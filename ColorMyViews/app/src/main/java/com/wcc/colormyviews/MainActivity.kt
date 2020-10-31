package com.wcc.colormyviews

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    var currentColor = R.color.grey //fora do onCreate pra ser acessível em toda a classe Main
    var boxOneColor = R.color.grey
    var boxTwoColor = R.color.grey
    var boxThreeColor = R.color.grey
    var boxFourColor = R.color.grey
    var boxFiveColor = R.color.grey

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreferences = this.getSharedPreferences("colors", Context.MODE_PRIVATE)
        val color = sharedPreferences.getInt("color_box_one", R.color.grey)
        box_one_text.setBackgroundResource(color)

        setColorsButtonsAction()
        setBoxColor()
    }

    override fun onStop() {
        super.onStop()
        val sharedPreferences = this.getSharedPreferences("colors", Context.MODE_PRIVATE)
        val sharedPreferencesEditor = sharedPreferences.edit()
        sharedPreferencesEditor.putInt("color_box_one", boxOneColor)
        sharedPreferencesEditor.apply()
    }

    private fun setBoxColor() {
        box_one_text.setOnClickListener {
            it.setBackgroundResource(currentColor)
            boxOneColor = currentColor
        }

        box_two_text.setOnClickListener {
            it.setBackgroundResource(currentColor)
            boxTwoColor = currentColor
        }

        box_three_text.setOnClickListener {
            it.setBackgroundResource(currentColor)
            boxThreeColor = currentColor
        }

        box_four_text.setOnClickListener {
            it.setBackgroundResource(currentColor)
            boxFourColor = currentColor
        }

        box_five_text.setOnClickListener {
            it.setBackgroundResource(currentColor)
            boxFiveColor = currentColor
        }
    }

    private fun setColorsButtonsAction() {
        button_red.setOnClickListener {
            currentColor = R.color.red
           // it.setBackgroundResource(R.color.red)
        }

        button_yellow.setOnClickListener {
            currentColor = R.color.yellow
            //it.setBackgroundResource(R.color.yellow)
        }

        button_green.setOnClickListener {
            currentColor = R.color.green
            //it.setBackgroundResource(R.color.green)
        }
    }



}