import java.util.*

fun main(args: Array<String>) {
    val attach = fun String.(item:String) = this.reversed() +" "+ item.reversed()

    var myName = "Sampath"

    myName.attach("Kumar")

    println(myName.attach("Kumar"))

    operator fun String.invoke():String{
        return "-------*** $this ***--------"
    }
    println(myName())

    var greet: String.(String) -> Unit = { println("Hello $this & $it") }
    val name = "SAM"
    name.greet("Kumar")
}