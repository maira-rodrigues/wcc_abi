package com.wcc.supertrunfo

import kotlin.reflect.KProperty

class Card (
        val vehicle: Vehicle,
        val driver: Driver,
        val player: Player
)
{
    val label: String = "Card ${player.name}"
    val maxVelocity = setMaxVelocity()
    val accelerationTime = setAccelerationTime()
    val passengers = setPassengers()

    private fun setPassengers(): Int {
        return vehicle.passengers * (1 + driver.defensiveDriving)
    }


    private fun setMaxVelocity(): Int {

    }



    private fun setAccelerationTime(): Int {

    }

}
