package com.axis.Account
import java.util.Scanner

fun main()
{
    var sc=Scanner(System.`in`)
    println("Enter your account number")
    var accNo=sc.nextInt()
    println("Enter your account type")
    var accType=sc.next()

    var acc=Account(accNo=accNo,accType=accType)
    var accService=AccountService()

    while(true){

        println("1.Withdraw\t2.Deposit\t3.CalculateRateOFInterest\t4.Get Balance\nEnter your choice")
        var choice=sc.nextInt()
        when(choice) {
            1 -> {
                println("Enter the amount to withdraw")
                var amount = sc.nextInt()
                accService.withdraw(amount,acc)
            }

            2 -> {
                println("Enter the amount to deposit")
                var amount = sc.nextInt()
                accService.deposit(amount,acc)
            }

            3 -> {
                var interest=accService.calculateRateOfInterest(acc)
                println("Your Interest amount=$interest")
            }

            4 -> {
                accService.getBalance(acc)
            }

            else ->{
                println("Enter correct choice")
                break}
        }
    }
}