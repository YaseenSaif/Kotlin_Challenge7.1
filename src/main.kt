

fun main(args: Array<String>) {
    println("inflix fuction examples");
    var m = infixFunction()
    // call using infix notation
    var result = m square 3
    println("The square of 3 is: "+result)
    println()

    println("member function examples")
    var member = MemberFun()
    member.LambdaFun()
    member.inLineFun("in inline function",::println)
    member.localFun()
    println()

    println("user defined function examples")
    var userDefinedFunction = UserDefinedFunction()
    userDefinedFunction.userDefinedFun()
    println()

    println("standard function examples")
    var standard= StandardFunction()
    standard.RunTestFunction()
    standard.alsoTestFunction()
    standard.leTestFunction()
    standard.applyTestFunction()
    standard.takeIfTestFunction()
    standard.withTestFunction()
    println()

}