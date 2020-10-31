package com.wcc.supertrunfo.interactor

import com.wcc.supertrunfo.entities.Driver
import com.wcc.supertrunfo.entities.Player
import com.wcc.supertrunfo.entities.Vehicle

class Card (
        val vehicle: Vehicle,
        val driver: Driver,
        val player: Player = Player("player")
)
{
    val label: String = "Card ${player.name}"
    val maxVelocity = initMaxVelocity()
    val accelerationTime = initAccelerationTime()
    val passengers = initPassengers()
    val xp = initXP()

//----------------INIT MAX VELOCITY--------------------
    private fun initMaxVelocity(): Int {
        return when (vehicle.type) {
            "car" -> carMaxVelocity()
            "motorcycle" -> motorcycleMaxVelocity()
            else -> bikeMaxVelocity()
        }
    }
//----------------INIT PASSENGERS--------------------
    private fun initPassengers(): Int {
        return vehicle.passengers * (1 + driver.defensiveDriving)
    }

//----------------INIT ACCELERATION TIME---------------
    private fun initAccelerationTime(): Int {
        return vehicle.accelerationTime
    }

//----------------INIT XP-------------------------------
    private fun initXP(): Int {
        return when (vehicle.type) {
            "car" -> driver.carXP
            "motorcycle" -> driver.motorcycleXP
            else -> driver.bikeXP
        }
    }

//--------------FUNCTIONS THAT SET MAX VELOCITY ACCORDING TO VEHICLE TYPE--------------------

    private fun carMaxVelocity(): Int {
        return if (vehicle.style == "sedã") {
            vehicle.maxAcceleration
        } else{
            vehicle.maxAcceleration + 10
        }
    }

    private fun motorcycleMaxVelocity(): Int {
        return (1 / (vehicle.weight)) * (vehicle.maxAcceleration)
    }

    private fun bikeMaxVelocity(): Int {
        return vehicle.maxAcceleration * driver.boldness
    }

}
