package com.axis.Wrestler

class WrestlerDatabase {
    var wrestlers= mutableListOf<Wrestler>()

    init
    {
        wrestlers.add(Wrestler("Rohit",39,5.4,150))
        wrestlers.add(Wrestler("Ankit",45,5.9,253))
        wrestlers.add(Wrestler("Rahul",35,5.7,190))


    }

    fun addWrestler(wrestler: Wrestler):String{
        wrestlers.add(wrestler)
        return "Wrestler added"
    }
    fun displayAll():MutableList<Wrestler>{
        return wrestlers
    }

    fun countNoOfWrestlerswhoseAgegreaterthan35():MutableList<Wrestler>{
        return wrestlers
    }

    fun diplayWrestlerswhoseWeightgreaterthan200():MutableList<Wrestler>{
        return wrestlers
    }
}