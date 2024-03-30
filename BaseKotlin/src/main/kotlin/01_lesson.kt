import kotlin.math.PI
import kotlin.math.pow

fun main() {
    var greeting = "Hello!"
    greeting = "Hi!"
//    greeting = 10
    var number: Number = 10

    print(1)
    print(2)
    println(number)
    println("$greeting Моё любимое число $number")
    val hours = 24
//    hours = 25
    val name = "Руслан"
    var age = 39


    /*
    Арифметические операции
     */
    var x = 8
    x = x + 4
    x += 4
    x -= 4
    x /= 2
    x *= 8
    println(x)

    var radius = 7
//    val PI = 3.14
    var circleArea = PI * radius * radius
    println(circleArea)
    var circleArea2 = PI.toInt() * radius * radius
    println(circleArea2)
    var radiusD: Double = 7.0
    var circleArea3 = PI * radiusD.pow(2)
    println(PI)
    println(circleArea3)

/*
Циклы
 */
    for (i in 1..5) {
        println(i)
    }

    var language = arrayOf("Ruby", "Kotlin", "Python", "Java")
    for (item in language)
        println(item)

    var friends= listOf("Иван", "Дмитрий", "Вова", "глеб")
    for (item in friends) {
        if (item != "Иван")
            println(item)
    }

    for(i in name)
        println(i)

    for (i in 1 ..<10 step 2)
        println(i)

    for(x in 10 downTo 0)
        println(x)
    println("Поехали!")

    var f = 8
//    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8
    var factorial = 1
    for (i in 1..8) {
        factorial *= i
    }
    println("Факториал числа $f = $factorial")

    for (i in 1..10) {
        for(j in 1..10) {
            print(i * j)
            print("\t")
        }
        println()
    }
}