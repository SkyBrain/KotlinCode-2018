import com.sun.org.apache.xpath.internal.operations.Bool
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

// Complete the countingValleys function below.
fun countingValleys(n: Int, s: String): Int {
    var level = 0
    var valleyCount = 0

    var down = ArrayList<String>()
    var up = ArrayList<String>()
    var isValley = false
    s.forEach {

        if(it == 'D'){
            down.add(it.toString())
            if (up.count() == 0) isValley = true
        }
        else if (it == 'U'){
            up.add(it.toString())
            if (down.count() == 0) isValley = false
        }
        if (down.count() > 0 && up.count() == down.count()){
            if(isValley) valleyCount++
            down.removeAll { true }
            up.removeAll { true }
            isValley = false
        }
    }

    return valleyCount
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val result = countingValleys(n, s)

    println(result)
}