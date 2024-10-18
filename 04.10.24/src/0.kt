import java.util.Scanner
import kotlin.math.abs

fun main(){
    val input = Scanner(System.`in`)
    print("k = ")
    val k = input.nextInt()
    print("x = ")
    val x = input.nextInt()
    print("y = ")
    val y = input.nextInt()
    if(2 < abs(x+y)){
        if(k<=x || k<=y){
            print(0)
        }
        else{
            print(if(x>y) k-x else k-y)
        }
    }
    else{
        if(k<=x || k<=y){

        }
    }
}