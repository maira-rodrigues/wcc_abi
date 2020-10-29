package com.wcc.colormyviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var currentColor = R.color.grey //fora do onCreate pra ser acessível em toda a classe Main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setColorsButtonsAction()
        setBoxColor()

    }

    private fun setBoxColor() {
        box_one_text.setOnClickListener {
            it.setBackgroundResource(currentColor)
        }

        box_two_text.setOnClickListener {
            it.setBackgroundResource(currentColor)
        }

        box_three_text.setOnClickListener {
            it.setBackgroundResource(currentColor)
        }

        box_four_text.setOnClickListener {
            it.setBackgroundResource(currentColor)
        }

        box_five_text.setOnClickListener {
            it.setBackgroundResource(currentColor)
        }
    }

    private fun setColorsButtonsAction() {
        button_red.setOnClickListener {
            currentColor = R.color.red
        }

        button_yellow.setOnClickListener {
            currentColor = R.color.yellow
        }

        button_green.setOnClickListener {
            currentColor = R.color.green
        }
    }


    //indViewById.R.id.button_red


}