package com.wcc.supertrunfo

data class Player(
        val name: String,
        var isWinner: Boolean = false
//set e get vem automáticos porque é uma var. Se fosse val, teria
//que ser setName
)

{
    var vehicle: Vehicle = setVehicle()
    var driver: Driver = setDriver()

    private fun setDriver(): Driver {
        return driver
    }

    private fun setVehicle(): Vehicle {
        return vehicle
    }
}

