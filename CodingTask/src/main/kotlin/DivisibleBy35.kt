
fun main()
{
    println("---Numbers divisible by 3 and 5 from 1 to 100")
    for(i in 1..100){
        if((i%3==0) && (i%5==0))
            print("$i\t")
    }
}