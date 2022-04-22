// IGNORE_BACKEND: WASM
// WASM_MUTE_REASON: IGNORED_IN_JS
// IGNORE_BACKEND: JS, JS_IR
// IGNORE_BACKEND: JS_IR_ES6

fun interface KRunnable {
    fun invoke()
}

fun interface KBoolean {
    fun invoke(b: Boolean)
}

fun useFunInterface(fn: KRunnable) {
    fn.invoke()
}
fun useFunInterfacePredicate(fn: KBoolean) {
    fn.invoke(true)
}

fun <T> testIntersection(x: T) where T : () -> Unit, T : (Boolean) -> Unit {
    useFunInterface(x)
    useFunInterfacePredicate(x)
}

var result = ""

object Test : () -> Unit, (Boolean) -> Unit {
    override fun invoke() {
        result += "O"
    }

    override fun invoke(p1: Boolean) {
        if (p1) result += "K"
    }
}

fun box(): String {
    <!INFERRED_TYPE_VARIABLE_INTO_EMPTY_INTERSECTION!>testIntersection<!>(Test)
    return result
}