package john

class Person(val firstName:String = "peter", val lastName:String = "parker"){

    var nickname:String?= null
    set(value) {
        field = value
        println("new nickname is $value")
    }

    get(){
        println("the returned value is $field")
        return field
    }

    fun printInfo(){
        val nicknameToPrint = nickname ?: "No nickname"
        println("$firstName ($nicknameToPrint) $lastName")
    }
}