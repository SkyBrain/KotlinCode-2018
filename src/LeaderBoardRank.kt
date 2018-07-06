import org.omg.CORBA.INTERNAL
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

// Complete the climbingLeaderboard function below.
fun climbingLeaderboard(scores: Array<Int>, alice: Array<Int>) {
    var alicesRanks:Array<Int> = arrayOf()
    val dScores = scores.distinct()
    var index = dScores.size - 1
    run loop@{
        alice.forEach {
            while (index >= 0){
                if (it >= dScores[index]){
                    index--
                }
                else{
                    println(index+2)
                    return@forEach
                }
            }
            if (index < 0) println(1)
        }
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val scoresCount = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val aliceCount = scan.nextLine().trim().toInt()

    val alice = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = climbingLeaderboard(scores, alice)

    //println(result.joinToString("\n"))
}