class MemberFun {

    fun localFun() {
        //local function is a function inside other function
        var local = "local function"
        fun show() {
            println(local)

        }
        show()
    }

    inline fun inLineFun(text: String, myCall: (String) -> Unit) {
        //inline function is to define a function in one line
        myCall(text)
    }

    // lambda function is an anonymous function
    var LambdaFun= { println("lambda function ") }
}


