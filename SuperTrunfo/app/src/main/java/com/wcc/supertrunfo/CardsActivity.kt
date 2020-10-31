package com.wcc.supertrunfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wcc.supertrunfo.entities.Driver
import com.wcc.supertrunfo.entities.Player
import com.wcc.supertrunfo.entities.Vehicle

class CardsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cards)

        val playerOneName = intent.getStringExtra("player_one") ?: "Player One"
        val playerTwoName = intent.getStringExtra("player_two") ?: "Player Two"

        //instancia 2 players recebendo como parâmetro a String da intent
        val playerOne = Player(playerOneName)
        val playerTwo = Player(playerTwoName)

        //CARD RECEIVES RANDOM VEHICLE AND DRIVER + player
        var cardOne = Card(vehicles.random(), drivers.random(), playerOne)
        var cardTwo = Card(vehicles.random(), drivers.random(), playerTwo)

        //val currentVehiclePlayerOne = vehicles.random()
        //val currentVehiclePlayerTwo = vehicles.random()

        //val currentDriverPlayerOne = drivers.random()
        //val currentDriverPlayerTwo = drivers.random()

       /* val cardOneMaxVelocity =
            when (currentVehiclePlayerOne["type"]) {
                "car" ->
                    if (currentVehiclePlayerOne["style"] == "sedã") {
                        currentVehiclePlayerOne["maxAcceleration"]?.toInt() ?: 0
                    } else {
                        currentVehiclePlayerOne["maxAcceleration"]?.toInt() ?: 0 + 10
                    }

                "motorcycle" -> (1 / (currentVehiclePlayerOne["weight"]?.toInt()
                    ?: 1)) * (currentVehiclePlayerOne["maxAcceleration"]?.toInt() ?: 0)

                else -> (currentVehiclePlayerOne["maxAcceleration"]?.toInt()
                    ?: 1 * (currentDriverPlayerOne["boldness"]?.toInt() ?: 1))
            }*/

       /*val accelerationTimeCardOne = (currentVehiclePlayerOne["accelerationTime"]?.toInt()
            ?: 1) * (1 / (currentDriverPlayerOne["accelerationTime"]?.toInt() ?: 1))

        val passengersCardOne = (currentVehiclePlayerOne["passengers"]?.toInt()
            ?: 0) * (1 + (currentDriverPlayerOne["defensiveDriving"]?.toInt() ?: 0)) */

        /*val xPCardOne = when (currentVehiclePlayerOne["type"]) {
            "car" -> currentDriverPlayerOne["carXP"]?.toInt() ?: 0
            "motorcycle" -> currentDriverPlayerOne["motorcycleXP"]?.toInt() ?: 0
            else -> currentDriverPlayerOne["bikeXP"]?.toInt() ?: 0
        }

        /*val cardTwoMaxVelocity =
            when (currentVehiclePlayerTwo["type"]) {
                "car" ->
                    if (currentVehiclePlayerTwo["style"] == "sedã") {
                        currentVehiclePlayerTwo["maxAcceleration"]?.toInt() ?: 0
                    } else {
                        currentVehiclePlayerTwo["maxAcceleration"]?.toInt() ?: 0 + 10
                    }

                "motorcycle" -> (1 / (currentVehiclePlayerTwo["weight"]?.toInt()
                    ?: 1)) * (currentVehiclePlayerTwo["maxAcceleration"]?.toInt() ?: 0)

                else -> (currentVehiclePlayerTwo["maxAcceleration"]?.toInt()
                    ?: 1 * (currentDriverPlayerTwo["boldness"]?.toInt() ?: 1))
            }

        val accelerationTimeCardTwo = (currentVehiclePlayerOne["accelerationTime"]?.toInt()
            ?: 1) * (1 / (currentDriverPlayerOne["accelerationTime"]?.toInt() ?: 1))

        val passengersCardTwo = (currentVehiclePlayerOne["passengers"]?.toInt()
            ?: 0) * (1 + (currentDriverPlayerOne["defensiveDriving"]?.toInt() ?: 0))

        val xPCardTwo = when (currentVehiclePlayerOne["type"]) {
            "car" -> currentDriverPlayerOne["carXP"]?.toInt() ?: 0
            "motorcycle" -> currentDriverPlayerOne["motorcycleXP"]?.toInt() ?: 0
            else -> currentDriverPlayerOne["bikeXP"]?.toInt() ?: 0
        }*/

        cardPlayerOneLabel.text = cardOne.label
        //cardPlayerOneLabel.text = "Card $playerOneName"
        cardPlayerTwoLabel.text = cardTwo.label
        //cardPlayerTwoLabel.text = "Card $playerTwoName"

        //cardPlayerOneVelocity.text = "Máx velocity: $cardOneMaxVelocity"
        cardPlayerOneVelocity.text = String.format("Máx velocity: %d", cardOne.maxVelocity)
        //cardPlayerTwoVelocity.text = "Máx velocity: $cardTwoMaxVelocity"
        cardPlayerTwoVelocity.text = String.format("Máx velocity: %d", cardTwo.maxVelocity)

        //cardPlayerOneAccelerationTime.text = "Acceleration time: $accelerationTimeCardOne"
        cardPlayerOneAccelerationTime.text = String.format("Acceleration time: %d", cardOne.accelerationTime)
        //cardPlayerTwoAccelerationTime.text = "Acceleration time: $accelerationTimeCardTwo"
        cardPlayerTwoAccelerationTime.text = String.format("Acceleration time: %d", cardTwo.accelerationTime)

        //cardPlayerOnePassengers.text = "Passengers: $passengersCardOne"
        cardPlayerOnePassengers.text = String.format("Passengers: %d", cardOne.passengers)
        //cardPlayerTwoPassengers.text = "Passengers: $passengersCardTwo"
        cardPlayerTwoPassengers.text = String.format("Passengers: %d", cardTwo.passengers)

        //cardPlayerTwoXP.text = "XP: $xPCardTwo"
        cardPlayerOneXP.text = String.format("XP: %d", cardOne.xp)
        cardPlayerTwoXP.text = String.format("XP: %d", cardTwo.xp)

        chooseCriteriaButton.setOnClickListener {
            val intent = Intent(this, ChooseCriteriaActivity::class.java)
            intent.putExtra("player_one", playerOneName)
            intent.putExtra("player_two", playerTwoName)
            startActivity(intent)
        }*/
    }
}