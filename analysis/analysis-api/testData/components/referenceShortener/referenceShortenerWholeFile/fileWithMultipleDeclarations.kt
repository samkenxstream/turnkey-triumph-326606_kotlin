class A<caret_onAirContext> {
    abstract class B {
        abstract val b: A.B
    }
}

class C {
    abstract class D {
        companion object {
            fun foo() {}
        }

        init {
            C.D.Companion.foo()
        }
    }
}