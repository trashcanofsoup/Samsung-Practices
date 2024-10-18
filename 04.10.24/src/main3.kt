fun main(){
    lateinit var car:String
    var str:String? = null //NullPointerException
    str = "123"
    print(getString(str)?.length ?: 0)
}

fun getString(str:String?):String?{
    return str
}