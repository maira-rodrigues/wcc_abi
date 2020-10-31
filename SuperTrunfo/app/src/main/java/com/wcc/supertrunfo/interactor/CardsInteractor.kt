package com.wcc.supertrunfo.interactor

import com.wcc.supertrunfo.data.SuperTrunfoDatabase

class CardsInteractor {
    private val database = SuperTrunfoDatabase()
    val cardOne = generateCard()
    val cardTwo = generateCard()

    private fun generateCard(): Card{
        val driver = database.getAllDrivers().random()
        val vehicle = database.getAllVehicles().random()

        return Card(vehicle, driver)
    }
}