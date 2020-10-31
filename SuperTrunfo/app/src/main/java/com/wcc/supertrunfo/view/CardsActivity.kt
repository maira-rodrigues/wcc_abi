package com.wcc.supertrunfo.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wcc.supertrunfo.ChooseCriteriaActivity
import com.wcc.supertrunfo.R
import com.wcc.supertrunfo.entities.Player
import com.wcc.supertrunfo.presenters.CardsPresenter
import kotlinx.android.synthetic.main.activity_cards.*

class CardsActivity : AppCompatActivity() {
    private val presenter = CardsPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cards)

        val playerOneName = intent.getStringExtra("player_one") ?: "Player One"
        val playerTwoName = intent.getStringExtra("player_two") ?: "Player Two"

        //instancia 2 players recebendo como parâmetro a String da intent
        val playerOne = Player(playerOneName)
        val playerTwo = Player(playerTwoName)

        cardPlayerOneLabel.text = "Card $playerOneName"
        cardPlayerTwoLabel.text = "Card $playerTwoName"

        cardPlayerOneVelocity.text = "Máx velocity: ${presenter.getCardOneMaxVelocity()}"
        cardPlayerTwoVelocity.text = "Máx velocity: ${presenter.getCardTwoMaxVelocity()}"

        cardPlayerOneAccelerationTime.text = "Acceleration time: ${presenter.getCardOneAccelerationTime()}"
        cardPlayerTwoAccelerationTime.text = "Acceleration time: ${presenter.getCardTwoAccelerationTime()}"

        cardPlayerOnePassengers.text = "Passengers: ${presenter.getCardOnePassengers()}"
        cardPlayerTwoPassengers.text = "Passengers: ${presenter.getCardOnePassengers()}"

        cardPlayerOneXP.text = "XP: ${presenter.getCardOneXP()}"
        cardPlayerTwoXP.text = "XP: ${presenter.getCardTwoXP()}"

        chooseCriteriaButton.setOnClickListener {
            val intent = Intent(this, ChooseCriteriaActivity::class.java)
            intent.putExtra("player_one", playerOneName)
            intent.putExtra("player_two", playerTwoName)
            startActivity(intent)
        }
    }
}