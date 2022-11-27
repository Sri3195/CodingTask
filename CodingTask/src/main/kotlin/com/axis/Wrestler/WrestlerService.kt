package com.axis.Wrestler

class WrestlerService {

    var wrestlerDatabase = WrestlerDatabase()
    fun addWrestler(wrestler: Wrestler){
        var str=wrestlerDatabase.addWrestler(wrestler)
        println(str)
    }
    fun displayAll(){
        var wrestlers=wrestlerDatabase.displayAll()
        println("----Wrestlers Details----")
        for(wrestler in wrestlers){
            println(wrestler)
        }
    }

    fun countNoOfWrestlerswhoseAgegreaterthan35():Int{
        var wrestlers=wrestlerDatabase.countNoOfWrestlerswhoseAgegreaterthan35()
        var count=0;
        for(wrestler in wrestlers){
            if(wrestler.age>35)
                count=count+1
        }
        return count
    }

    fun diplayWrestlerswhoseWeightgreaterthan200(){
        var wrestlers=wrestlerDatabase.diplayWrestlerswhoseWeightgreaterthan200()
        println("---Wrestlers whose weight is greater than 200---")
        for(wrestler in wrestlers){
            if(wrestler.weight>200){
                println(wrestler)
            }
        }
    }
}