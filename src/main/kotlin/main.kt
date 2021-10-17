import java.lang.ArithmeticException

fun main(){
    println("enter 2 numbers")
    var num = readLine()!!.toInt()
    var num1 = readLine()!!.toInt()
    try {
        println("${num/num1}")
    }catch (exp : ArithmeticException){
        println("can't divide by 0")
    }
}
