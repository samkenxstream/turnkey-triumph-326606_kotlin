// IGNORE_REVERSED_RESOLVE
// !LANGUAGE: -ProhibitVisibilityOfNestedClassifiersFromSupertypesOfCompanion

class X {
    fun T_X() {}
}

class Y {
    fun T_Y() {}
}

open class A {
    class X {
        fun A_X() {}
    }
    companion object {
        class Y {
            fun A_C_Y() {}
        }
    }

    init {
        X().A_X()
        X().<!UNRESOLVED_REFERENCE!>T_X<!>()

        Y().A_C_Y()
        Y().<!UNRESOLVED_REFERENCE!>T_Y<!>()
    }
}

class B: A() {
    init {
        X().A_X()
        X().<!UNRESOLVED_REFERENCE!>T_X<!>()

        Y().<!UNRESOLVED_REFERENCE!>A_C_Y<!>()
        Y().T_Y()
    }
}
