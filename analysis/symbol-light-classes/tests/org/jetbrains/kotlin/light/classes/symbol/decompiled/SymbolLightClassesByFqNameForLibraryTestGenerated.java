/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.light.classes.symbol.decompiled;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/asJava/lightClasses/lightClassByFqName")
@TestDataPath("$PROJECT_ROOT")
public class SymbolLightClassesByFqNameForLibraryTestGenerated extends AbstractSymbolLightClassesByFqNameForLibraryTest {
    @Test
    public void testAllFilesPresentInLightClassByFqName() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/lightClassByFqName"), Pattern.compile("^([^.]+)\\.kt$"), null, true, "compilationErrors");
    }

    @Test
    @TestMetadata("AnnotatedParameterInEnumConstructor.kt")
    public void testAnnotatedParameterInEnumConstructor() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/AnnotatedParameterInEnumConstructor.kt");
    }

    @Test
    @TestMetadata("AnnotatedParameterInInnerClassConstructor.kt")
    public void testAnnotatedParameterInInnerClassConstructor() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/AnnotatedParameterInInnerClassConstructor.kt");
    }

    @Test
    @TestMetadata("AnnotatedPropertyWithSites.kt")
    public void testAnnotatedPropertyWithSites() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/AnnotatedPropertyWithSites.kt");
    }

    @Test
    @TestMetadata("AnnotationClass.kt")
    public void testAnnotationClass() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/AnnotationClass.kt");
    }

    @Test
    @TestMetadata("AnnotationJavaRepeatable.kt")
    public void testAnnotationJavaRepeatable() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/AnnotationJavaRepeatable.kt");
    }

    @Test
    @TestMetadata("AnnotationJvmRepeatable.kt")
    public void testAnnotationJvmRepeatable() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/AnnotationJvmRepeatable.kt");
    }

    @Test
    @TestMetadata("AnnotationKotlinAndJavaRepeatable.kt")
    public void testAnnotationKotlinAndJavaRepeatable() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/AnnotationKotlinAndJavaRepeatable.kt");
    }

    @Test
    @TestMetadata("AnnotationKotlinAndJvmRepeatable.kt")
    public void testAnnotationKotlinAndJvmRepeatable() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/AnnotationKotlinAndJvmRepeatable.kt");
    }

    @Test
    @TestMetadata("AnnotationRepeatable.kt")
    public void testAnnotationRepeatable() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/AnnotationRepeatable.kt");
    }

    @Test
    @TestMetadata("BackingFields.kt")
    public void testBackingFields() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/BackingFields.kt");
    }

    @Test
    @TestMetadata("CompanionObject.kt")
    public void testCompanionObject() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/CompanionObject.kt");
    }

    @Test
    @TestMetadata("Constructors.kt")
    public void testConstructors() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/Constructors.kt");
    }

    @Test
    @TestMetadata("DataClassWithCustomImplementedMembers.kt")
    public void testDataClassWithCustomImplementedMembers() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/DataClassWithCustomImplementedMembers.kt");
    }

    @Test
    @TestMetadata("DelegatedNested.kt")
    public void testDelegatedNested() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/DelegatedNested.kt");
    }

    @Test
    @TestMetadata("Delegation.kt")
    public void testDelegation() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/Delegation.kt");
    }

    @Test
    @TestMetadata("DeprecatedEnumEntry.kt")
    public void testDeprecatedEnumEntry() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/DeprecatedEnumEntry.kt");
    }

    @Test
    @TestMetadata("DeprecatedNotHiddenInClass.kt")
    public void testDeprecatedNotHiddenInClass() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/DeprecatedNotHiddenInClass.kt");
    }

    @Test
    @TestMetadata("DollarsInName.kt")
    public void testDollarsInName() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/DollarsInName.kt");
    }

    @Test
    @TestMetadata("DollarsInNameNoPackage.kt")
    public void testDollarsInNameNoPackage() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/DollarsInNameNoPackage.kt");
    }

    @Test
    @TestMetadata("EnumClass.kt")
    public void testEnumClass() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/EnumClass.kt");
    }

    @Test
    @TestMetadata("EnumClassWithEnumEntries.kt")
    public void testEnumClassWithEnumEntries() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/EnumClassWithEnumEntries.kt");
    }

    @Test
    @TestMetadata("EnumEntry.kt")
    public void testEnumEntry() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/EnumEntry.kt");
    }

    @Test
    @TestMetadata("ExtendingInterfaceWithDefaultImpls.kt")
    public void testExtendingInterfaceWithDefaultImpls() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/ExtendingInterfaceWithDefaultImpls.kt");
    }

    @Test
    @TestMetadata("HiddenDeprecated.kt")
    public void testHiddenDeprecated() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/HiddenDeprecated.kt");
    }

    @Test
    @TestMetadata("HiddenDeprecatedInClass.kt")
    public void testHiddenDeprecatedInClass() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/HiddenDeprecatedInClass.kt");
    }

    @Test
    @TestMetadata("InheritingInterfaceDefaultImpls.kt")
    public void testInheritingInterfaceDefaultImpls() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/InheritingInterfaceDefaultImpls.kt");
    }

    @Test
    @TestMetadata("InlineReified.kt")
    public void testInlineReified() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/InlineReified.kt");
    }

    @Test
    @TestMetadata("InvalidJavaIdentifierAsAnnotationArgument.kt")
    public void testInvalidJavaIdentifierAsAnnotationArgument() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/InvalidJavaIdentifierAsAnnotationArgument.kt");
    }

    @Test
    @TestMetadata("InvalidJavaIdentifierAsPropertyInitializer.kt")
    public void testInvalidJavaIdentifierAsPropertyInitializer() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/InvalidJavaIdentifierAsPropertyInitializer.kt");
    }

    @Test
    @TestMetadata("JavaBetween.kt")
    public void testJavaBetween() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/JavaBetween.kt");
    }

    @Test
    @TestMetadata("JavaClassWithAnnotation.kt")
    public void testJavaClassWithAnnotation() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/JavaClassWithAnnotation.kt");
    }

    @Test
    @TestMetadata("JvmNameOnMember.kt")
    public void testJvmNameOnMember() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/JvmNameOnMember.kt");
    }

    @Test
    @TestMetadata("JvmStatic.kt")
    public void testJvmStatic() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/JvmStatic.kt");
    }

    @Test
    @TestMetadata("LocalFunctions.kt")
    public void testLocalFunctions() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/LocalFunctions.kt");
    }

    @Test
    @TestMetadata("NestedObjects.kt")
    public void testNestedObjects() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/NestedObjects.kt");
    }

    @Test
    @TestMetadata("NonDataClassWithComponentFunctions.kt")
    public void testNonDataClassWithComponentFunctions() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/NonDataClassWithComponentFunctions.kt");
    }

    @Test
    @TestMetadata("OnlySecondaryConstructors.kt")
    public void testOnlySecondaryConstructors() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/OnlySecondaryConstructors.kt");
    }

    @Test
    @TestMetadata("PrivateObject.kt")
    public void testPrivateObject() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/PrivateObject.kt");
    }

    @Test
    @TestMetadata("PublishedApi.kt")
    public void testPublishedApi() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/PublishedApi.kt");
    }

    @Test
    @TestMetadata("SimpleObject.kt")
    public void testSimpleObject() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/SimpleObject.kt");
    }

    @Test
    @TestMetadata("SimplePublicField.kt")
    public void testSimplePublicField() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/SimplePublicField.kt");
    }

    @Test
    @TestMetadata("SpecialAnnotationsOnAnnotationClass.kt")
    public void testSpecialAnnotationsOnAnnotationClass() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/SpecialAnnotationsOnAnnotationClass.kt");
    }

    @Test
    @TestMetadata("StubOrderForOverloads.kt")
    public void testStubOrderForOverloads() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/StubOrderForOverloads.kt");
    }

    @Test
    @TestMetadata("Throws.kt")
    public void testThrows() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/Throws.kt");
    }

    @Test
    @TestMetadata("TypePararametersInClass.kt")
    public void testTypePararametersInClass() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/TypePararametersInClass.kt");
    }

    @Test
    @TestMetadata("VarArgs.kt")
    public void testVarArgs() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/VarArgs.kt");
    }

    @Nested
    @TestMetadata("compiler/testData/asJava/lightClasses/lightClassByFqName/delegation")
    @TestDataPath("$PROJECT_ROOT")
    public class Delegation {
        @Test
        public void testAllFilesPresentInDelegation() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/lightClassByFqName/delegation"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("Function.kt")
        public void testFunction() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/delegation/Function.kt");
        }

        @Test
        @TestMetadata("Property.kt")
        public void testProperty() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/delegation/Property.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/asJava/lightClasses/lightClassByFqName/facades")
    @TestDataPath("$PROJECT_ROOT")
    public class Facades {
        @Test
        public void testAllFilesPresentInFacades() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/lightClassByFqName/facades"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("AllPrivate.kt")
        public void testAllPrivate() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/facades/AllPrivate.kt");
        }

        @Test
        @TestMetadata("InternalFacadeClass.kt")
        public void testInternalFacadeClass() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/facades/InternalFacadeClass.kt");
        }

        @Test
        @TestMetadata("MultiFile.kt")
        public void testMultiFile() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/facades/MultiFile.kt");
        }

        @Test
        @TestMetadata("SingleFile.kt")
        public void testSingleFile() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/facades/SingleFile.kt");
        }

        @Test
        @TestMetadata("SingleJvmClassName.kt")
        public void testSingleJvmClassName() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/facades/SingleJvmClassName.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/asJava/lightClasses/lightClassByFqName/ideRegression")
    @TestDataPath("$PROJECT_ROOT")
    public class IdeRegression {
        @Test
        public void testAllFilesPresentInIdeRegression() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/lightClassByFqName/ideRegression"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("AllOpenAnnotatedClasses.kt")
        public void testAllOpenAnnotatedClasses() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/ideRegression/AllOpenAnnotatedClasses.kt");
        }

        @Test
        @TestMetadata("ImplementingCharSequenceAndNumber.kt")
        public void testImplementingCharSequenceAndNumber() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/ideRegression/ImplementingCharSequenceAndNumber.kt");
        }

        @Test
        @TestMetadata("ImplementingMap.kt")
        public void testImplementingMap() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/ideRegression/ImplementingMap.kt");
        }

        @Test
        @TestMetadata("ImplementingMutableSet.kt")
        public void testImplementingMutableSet() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/ideRegression/ImplementingMutableSet.kt");
        }

        @Test
        @TestMetadata("InheritingInterfaceDefaultImpls.kt")
        public void testInheritingInterfaceDefaultImpls() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/ideRegression/InheritingInterfaceDefaultImpls.kt");
        }

        @Test
        @TestMetadata("OverridingFinalInternal.kt")
        public void testOverridingFinalInternal() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/ideRegression/OverridingFinalInternal.kt");
        }

        @Test
        @TestMetadata("OverridingInternal.kt")
        public void testOverridingInternal() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/ideRegression/OverridingInternal.kt");
        }

        @Test
        @TestMetadata("OverridingProtected.kt")
        public void testOverridingProtected() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/ideRegression/OverridingProtected.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations")
    @TestDataPath("$PROJECT_ROOT")
    public class NullabilityAnnotations {
        @Test
        public void testAllFilesPresentInNullabilityAnnotations() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("Class.kt")
        public void testClass() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/Class.kt");
        }

        @Test
        @TestMetadata("ClassObjectField.kt")
        public void testClassObjectField() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/ClassObjectField.kt");
        }

        @Test
        @TestMetadata("ClassWithConstructor.kt")
        public void testClassWithConstructor() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/ClassWithConstructor.kt");
        }

        @Test
        @TestMetadata("ClassWithConstructorAndProperties.kt")
        public void testClassWithConstructorAndProperties() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/ClassWithConstructorAndProperties.kt");
        }

        @Test
        @TestMetadata("FileFacade.kt")
        public void testFileFacade() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/FileFacade.kt");
        }

        @Test
        @TestMetadata("Generic.kt")
        public void testGeneric() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/Generic.kt");
        }

        @Test
        @TestMetadata("ImplicitArrayWithFlexibleParameterTypes.kt")
        public void testImplicitArrayWithFlexibleParameterTypes() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/ImplicitArrayWithFlexibleParameterTypes.kt");
        }

        @Test
        @TestMetadata("IntOverridesAny.kt")
        public void testIntOverridesAny() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/IntOverridesAny.kt");
        }

        @Test
        @TestMetadata("JvmOverloads.kt")
        public void testJvmOverloads() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/JvmOverloads.kt");
        }

        @Test
        @TestMetadata("NullableUnitReturn.kt")
        public void testNullableUnitReturn() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/NullableUnitReturn.kt");
        }

        @Test
        @TestMetadata("OverrideAnyWithUnit.kt")
        public void testOverrideAnyWithUnit() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/OverrideAnyWithUnit.kt");
        }

        @Test
        @TestMetadata("PlatformTypes.kt")
        public void testPlatformTypes() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/PlatformTypes.kt");
        }

        @Test
        @TestMetadata("PrimitiveBackedInlineClasses.kt")
        public void testPrimitiveBackedInlineClasses() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/PrimitiveBackedInlineClasses.kt");
        }

        @Test
        @TestMetadata("Primitives.kt")
        public void testPrimitives() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/Primitives.kt");
        }

        @Test
        @TestMetadata("PrivateInClass.kt")
        public void testPrivateInClass() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/PrivateInClass.kt");
        }

        @Test
        @TestMetadata("Synthetic.kt")
        public void testSynthetic() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/Synthetic.kt");
        }

        @Test
        @TestMetadata("Trait.kt")
        public void testTrait() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/Trait.kt");
        }

        @Test
        @TestMetadata("UnitAsGenericArgument.kt")
        public void testUnitAsGenericArgument() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/UnitAsGenericArgument.kt");
        }

        @Test
        @TestMetadata("UnitParameter.kt")
        public void testUnitParameter() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/UnitParameter.kt");
        }

        @Test
        @TestMetadata("VoidReturn.kt")
        public void testVoidReturn() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/VoidReturn.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/asJava/lightClasses/lightClassByFqName/script")
    @TestDataPath("$PROJECT_ROOT")
    public class Script {
        @Test
        public void testAllFilesPresentInScript() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/lightClassByFqName/script"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }
    }

    @Nested
    @TestMetadata("compiler/testData/asJava/lightClasses/lightClassByFqName/withTestCompilerPluginEnabled")
    @TestDataPath("$PROJECT_ROOT")
    public class WithTestCompilerPluginEnabled {
        @Test
        public void testAllFilesPresentInWithTestCompilerPluginEnabled() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/lightClassByFqName/withTestCompilerPluginEnabled"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("allOpen.kt")
        public void testAllOpen() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/withTestCompilerPluginEnabled/allOpen.kt");
        }
    }
}
