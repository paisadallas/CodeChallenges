package john

interface InterfacePerson {

    fun sayHi(): String

}

interface InterfaceInfo{
    fun seeInfo():String
}

class BasicProvider: InterfacePerson, InterfaceInfo{
    override fun sayHi(): String = "Hello"
    override fun seeInfo(): String ="Carlos"
}

fun main(){

    val basic = BasicProvider()
    println(basic.sayHi())
    println(basic.seeInfo())
}