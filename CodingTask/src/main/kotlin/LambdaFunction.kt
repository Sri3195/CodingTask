import java.util.Scanner

fun main() {
    var sc=Scanner(System.`in`)
    println("Enter your age")
    var age=sc.nextInt()

    var myLambda:(Int)->String={age->if(age<18) "Non-Adult" else if (age>=18 && age<=55) "Adult" else "Senior Citizen"}

    println("Your are an ${myLambda(age)}")
}