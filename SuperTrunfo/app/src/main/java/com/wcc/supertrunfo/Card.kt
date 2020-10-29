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
    val xp = setXP()


    //(currentVehiclePlayerOne["passengers"]?.toInt()
//            ?: 0) * (1 + (currentDriverPlayerOne["defensiveDriving"]?.toInt() ?: 0))
    private fun setPassengers(): Int {
        return vehicle.passengers * (1 + driver.defensiveDriving)
    }


    private fun setMaxVelocity(): Int {
        return when (vehicle.type) {
            "car" ->
                if (vehicle.style == "sedã") {
                    vehicle.maxAcceleration
                } else {
                    vehicle.maxAcceleration + 10
                }
            "motorcycle" ->
                (1 / (vehicle.weight)) * (vehicle.maxAcceleration)

            else -> (vehicle.maxAcceleration * (driver.boldness))
        }
    }


//----------------------------------------------------------------------------------
    private fun setAccelerationTime(): Int {
        return vehicle.accelerationTime * (1/driver.vehicle.accelerationTime)
    }
//----------------------------------------------------------------------------------
    private fun setXP(): Int {
        return when (vehicle.type) {
            "car" -> player.driver.carXP
            "motorcycle" -> player.driver.motorcycleXP
            else -> player.driver.bikeXP
    }


    }

}
