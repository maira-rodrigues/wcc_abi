package com.wcc.lancedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoLancarDados = findViewById<Button>(R.id.lanceDadosBotao)
        val dado1: ImageView = findViewById(R.id.dado1)
        val dado2: ImageView = findViewById(R.id.dado2)

        botaoLancarDados.setOnClickListener {
            dado1.setImageResource(escolherImagem(gerarNumero()))
            dado2.setImageResource(escolherImagem(gerarNumero()))
        }
        val playerName = getIntent().getStringExtra("playername")
        val playerNameTextView = findViewById<TextView>(R.id.playerNameText)
        playerNameTextView.text =  "Olá, $playerName"
    }


    fun lancaDado(): Int {
        return escolherImagem(gerarNumero())
    }

    fun escolherImagem(numero: Int): Int{
        return when(numero){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    fun gerarNumero(): Int{
        return (1..6).random()
    }

    /*
    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "mensagem final", LENGTH_SHORT)
    } */
}