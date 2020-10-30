package com.wcc.supertrunfo.entities

data class Player(
        val name: String,
        var isWinner: Boolean = false
//set e get vem automáticos porque é uma var, não val
)
