package com.wcc.supertrunfo.presenters

import com.wcc.supertrunfo.interactor.CardsInteractor

class CardsPresenter {
    private val interactor = CardsInteractor()
    val cardOne = interactor.cardOne
    val cardTwo = interactor.cardTwo





    fun getCardOneMaxVelocity(): Int {
        return cardOne.maxVelocity
    }

    fun getCardTwoMaxVelocity(): Int {
        return cardTwo.maxVelocity
    }

    fun getCardOneAccelerationTime(): Int {
        return cardOne.accelerationTime
    }

    fun getCardTwoAccelerationTime(): Int {
        return cardTwo.accelerationTime
    }

    fun getCardOnePassengers(): Int {
        return cardTwo.passengers
    }
    fun getCardTwoPassengers(): Int {
        return cardTwo.passengers
    }
    fun getCardOneXP(): Int {
        return cardOne.xp
    }

    fun getCardTwoXP(): Int {
        return cardTwo.xp
    }
}