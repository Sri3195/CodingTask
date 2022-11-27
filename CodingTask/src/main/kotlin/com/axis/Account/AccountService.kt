package com.axis.Account
import com.axis.Account.Account
class AccountService(){

    //var acc=Account()
    fun withdraw(amount:Int,acc:Account){
        if(amount<=acc.balance){
            acc.balance=acc.balance-amount
            println("Amount Withdrawn")
            println("Remaining Balance : ${acc.balance}")
        }
        else{
            println("Balance is very low")
        }
    }

    fun deposit(amount:Int,acc:Account){
        acc.balance=acc.balance+amount
        println("Your current acc balance= ${acc.balance}")
    }

    fun calculateRateOfInterest(acc:Account):Double{
        var interest=0.0
        if(acc.accType=="savings"){
             interest=(acc.balance*0.06)
        }
        else{
            interest=(acc.balance*0.1)
        }
        return interest
    }

    fun getBalance(acc:Account){
        var interest=calculateRateOfInterest(acc)
        var totalbalce=acc.balance+interest
        println("Total Balance = $totalbalce")
    }

}
