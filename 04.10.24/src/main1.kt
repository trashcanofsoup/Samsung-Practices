import java.util.Scanner

fun main() {
    println("hello world")
    println("Введите строку")
    val input = Scanner(System. `in`)
    val str = input.next()
    println("Ваша строка: $str")

    val i:Int = 1 //2^32
    val i2:Int
    var i3 = 5
    i2 = 4
    var sh:Short = 123 // 2^16
    var b:Byte = 127 //2^8
    var uByte:UByte = 255u
    var l:Long = 100 //2^64
    var f:Float = 10.0245f // 2^32
    var d:Double = 1234.3456 // 2^64
    var ch:Char = 'k'
    var st:String = "cool look"
    var boolean:Boolean = true//false

    val x = 10
    val y = (x + 1 - (x * 2))/4 % 3
    println("Результат: $y ${x.inv()}")

    val o = input.nextInt()
    if (o>10){
        println("o > 10")
        println(o)
    } else if(o <= 9){
        println("o <= 9")
    } else{
        println("o = 10")
    }

    when (o){
        10 -> {
            println("я <3 10")
        }
        15 -> {
            println("i hate 15")
        }
        in 1 .. 9 -> {
            println("1...9")
        }
        else -> {

        }
    }
    if(o>10 && o<19){
        //и
    }
    if(o<15 || (o in 19 .. 21)){
        // или
    }
    // i j k
    for(p in 0 until  10 step 2){ //downTo
        println("$p")
    }

    var xx = 10
    while(xx > 0){
        xx-- // xx = xx - 1 // xx --1
    }

    do {
        print("hi")
        xx++
    }while(xx<10)

    var intarray = IntArray(size = 5, {0})
    var mutablelist = mutableListOf<String>()
    mutablelist.add("str1")
    mutablelist.add("str2")

    var arrayarray = Array<Array<String>>(size = 5,{i -> Array<String>(i, {"str"})})
    var sum = 0
    for(a in intarray){
        sum += a
    }
}