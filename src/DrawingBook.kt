import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

/*
 * Complete the pageCount function below.
 */
fun pageCount(n: Int, p: Int): Int {
    val pages = (1..n)
    val totalPairs = (n/2).toInt() + 1
    val left = pages.indexOf(p)
    val right = pages.reversed().indexOf(p)
    var turnCount = 0
    if (left < right){
        turnCount =  (pages.elementAt(left)/2).toInt()
    }
    else{

        if (right == 0) return 0 else turnCount = (pages.reversed().elementAt(right)/2).toInt() + 1
        turnCount = totalPairs - turnCount
    }
    return turnCount
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val p = scan.nextLine().trim().toInt()

    val result = pageCount(n, p)

    println(result)
}

