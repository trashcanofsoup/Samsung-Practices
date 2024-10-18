fun main():Unit{
    getKey(i = 123)
    getKey(i = 123, b = "asd")
    var str = getKey(c = 5, b = "dgh")
    println(str)
    var str2:String = "12312312"
    println(str2.duplicate())
    val str4 = str2 probelBetween str
    var ffff:(Int, Int) -> Int = {it1, it2 ->
        println("остальные действия")
        it1 + it2
    }
    val pp = ffff(1, 3)
    println(pp)
    getOtherFun(i=1, ffff)
}

fun getOtherFun(i:Int, f:(Int, Int) -> Int){
    f(1, 3)
}

fun getKey(i:Int):String{
    return "i = $i"
}

fun getKey(i:Int, b:String):String{
    return "i = $i $b"
}

fun getKey(i:Int = 123, b:String = "asd", c:Int = 2):String{
    return "i = $i $b $c"
}

fun String.duplicate():String{
    return this.plus(other = this)
}

infix fun String.probelBetween(str:String):String{
    return "$this $str"
}