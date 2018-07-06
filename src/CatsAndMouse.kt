import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the catAndMouse function below.
fun catAndMouse(x: Int, y: Int, z: Int): String {
    var d1 = if (x > z) x-z else z-x
    var d2 = if (y > z) y-z else z-y

    when{
        d1 < d2 -> return "Cat A"
        d2 < d1 -> return "Cat B"
        d1 == d2 -> return "Mouse C"
    }
    return ""
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val xyz = scan.nextLine().split(" ")

        val x = xyz[0].trim().toInt()

        val y = xyz[1].trim().toInt()

        val z = xyz[2].trim().toInt()

        val result = catAndMouse(x, y, z)

        println(result)
    }
}