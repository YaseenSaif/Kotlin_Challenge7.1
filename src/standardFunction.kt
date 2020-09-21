class StandardFunction {
    data class Student(var name: String, var id: Int, var avg: Double)

    fun leTestFunction() {
        Student("yaseen", 3, 97.3).let {
            println(it)
            it.avg = 98.3
            println(it)
        }
    }

    fun applyTestFunction() {
        Student("ahmed", 20, 95.9).apply {
            println(this)
            this.avg = 98.6
            println(this)
        }
    }

    fun RunTestFunction() {
        Student("Abdulqader", 28, 80.4).run {
            println(this)
            this.avg = 98.3
            println(this)
        }
    }

    fun withTestFunction() {


        val p = Student("khaled", 2, 88.0)
        with(p) {
            println(this.toString())
            p.avg=88.3
            println(this.toString())
        }
    }

    fun alsoTestFunction() {


        Student("amjad", 22, 85.3).also {
            println(it.toString())
            it.avg = 88.3
            println(it.toString())
        }

    }

    fun takeIfTestFunction() {


        Student("monef", 22, 92.3).takeIf {
            it.id == 22
        }

    }

}





