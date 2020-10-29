package com.wcc.colormyviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var currentColor = R.color.grey //fora do onCreate pra ser acessível em toda a classe Main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setColorsButtonsAction()
       // findViewById<Button>(R.id.button_red).setOnClickListener

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