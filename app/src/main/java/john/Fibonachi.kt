package john

fun main(){

    var n =7

        println(fiboSum(n))



}

fun fibo(number:Int):Int{

    if (number==0){
        return 0
    }
    else if (number ==1 || number ==2) return 1

    else return fibo(number -1) + fibo(number-2)
}

fun fiboSum(number: Int):Int{
   var sum =0
    var fiboN = 0
    if (number==0){
        return 0
    }
    else if (number ==1) return 1

        for (i in 2..number) {
            fiboN = fibo(i - 1) + fibo(i - 2)
            sum += fiboN
        }

    return sum+1
}
