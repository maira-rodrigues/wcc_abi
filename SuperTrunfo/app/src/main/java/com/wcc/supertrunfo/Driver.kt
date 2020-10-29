package com.wcc.supertrunfo

data class Driver (
        val carXP: Int,
        val bikeXP: Int,
        val motorcycleXP: Int,
        val carChampionships: Int,
        val bikeChampionships: Int,
        val motorcycleChampionships: Int,
        val boldness: Int,
        val defensiveDriving: Int,
)
{
    var vehicle = setVehicle()

    private fun setVehicle(): Vehicle {
        return vehicle //isso é um loop infinito? não sei oq eu to fazendo aqui rs, é um chute!!
    }
}

