package com.axis.Wrestler
import java.util.Scanner
fun main()
{
    var sc=Scanner(System.`in`)
    var wrestlerService=WrestlerService()

    while(true){
        println("\n1.AddWrestler\n2.DisplayAllWrestler\n3.CountNoOfWrestlerswhoseAgeisgreaterthan35\n4.DisplayWrestlerswhoseWeightgreaterthan200")
        println("Enter your choice")
        var choice=sc.nextInt()
        when(choice){
            1->{
                println("Enter wrestler name")
                var name=sc.next()
                println("Enter wrestler age")
                var age=sc.nextInt()
                println("Enter wrestler height")
                var height=sc.nextDouble()
                println("Enter wrestler weight")
                var weight=sc.nextInt()

                var wrestler=Wrestler(name,age,height,weight)
                wrestlerService.addWrestler(wrestler)
            }
            2->{
                wrestlerService.displayAll()
            }
            3->{
                var count= wrestlerService.countNoOfWrestlerswhoseAgegreaterthan35()
                println("Count of wrestlers whose age greater than 35 is  $count")
            }
            4->{
                wrestlerService.diplayWrestlerswhoseWeightgreaterthan200()
            }
            else->{
                println("Enter correct choice")
                break
            }
        }
    }
}