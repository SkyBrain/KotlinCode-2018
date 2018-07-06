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

// Complete the pickingNumbers function below.
fun pickingNumbers(a: Array<Int>): Int {
    var pickedNumbers = ArrayList<MutableList<Int>>()

    val intArr = a.groupBy { it }.filter { it.value.count()>1 }.forEach(){ entry ->
        pickedNumbers.add(entry.value.toMutableList())
    }
    var index = 0
    if (pickedNumbers.count() == 0) {
        a.sortDescending()
        index++
        a.forEach {
            if (Math.abs(it-a[index]) <= 1){
                return 2
            }
        }
    }
    index  = -1
    pickedNumbers.forEach { ga ->
        index++
        a.forEach { x ->
            if (ga.first() != x && pickedNumbers[index].filter { Math.abs(it-x) <= 1}.count() == pickedNumbers[index].count()){
                pickedNumbers[index].add(x)
            }
        }
    }

    val maxCount = pickedNumbers.maxBy { it.count() }?.count() ?: 0

    return maxCount
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = pickingNumbers(a)

    println(result)
}

