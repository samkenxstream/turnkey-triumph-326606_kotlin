/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.scopes.impl

import org.jetbrains.kotlin.fir.FirSession
import org.jetbrains.kotlin.fir.declarations.utils.isInner
import org.jetbrains.kotlin.fir.resolve.createSubstitutionForSupertype
import org.jetbrains.kotlin.fir.resolve.substitution.ConeSubstitutor
import org.jetbrains.kotlin.fir.scopes.FirContainingNamesAwareScope
import org.jetbrains.kotlin.fir.scopes.getSingleClassifier
import org.jetbrains.kotlin.fir.symbols.impl.*
import org.jetbrains.kotlin.fir.types.ConeClassLikeType
import org.jetbrains.kotlin.name.Name

class FirNestedClassifierScopeWithSubstitution internal constructor(
    val originalScope: FirContainingNamesAwareScope,
    private val substitutor: ConeSubstitutor
) : FirContainingNamesAwareScope() {

    override fun processFunctionsByName(name: Name, processor: (FirNamedFunctionSymbol) -> Unit) {
        originalScope.processFunctionsByName(name, processor)
    }

    override fun processPropertiesByName(name: Name, processor: (FirVariableSymbol<*>) -> Unit) {
        originalScope.processPropertiesByName(name, processor)
    }

    override fun processDeclaredConstructors(processor: (FirConstructorSymbol) -> Unit) {
        originalScope.processDeclaredConstructors(processor)
    }

    override fun mayContainName(name: Name): Boolean {
        return originalScope.mayContainName(name)
    }

    override fun processClassifiersByNameWithSubstitution(name: Name, processor: (FirClassifierSymbol<*>, ConeSubstitutor) -> Unit) {
        val matchedClass = originalScope.getSingleClassifier(name) as? FirRegularClassSymbol ?: return
        val substitutor = substitutor.takeIf { matchedClass.fir.isInner } ?: ConeSubstitutor.Empty
        processor(matchedClass, substitutor)
    }

    override fun getCallableNames(): Set<Name> = originalScope.getCallableNames()
    override fun getClassifierNames(): Set<Name> = originalScope.getClassifierNames()

    override val scopeOwnerLookupNames: List<String>
        get() = originalScope.scopeOwnerLookupNames
}

fun FirContainingNamesAwareScope.wrapNestedClassifierScopeWithSubstitutionForSuperType(
    superType: ConeClassLikeType,
    session: FirSession
): FirContainingNamesAwareScope {
    val substitutor = createSubstitutionForSupertype(superType, session)
    return FirNestedClassifierScopeWithSubstitution(this, substitutor)
}
