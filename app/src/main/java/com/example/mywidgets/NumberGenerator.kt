package com.example.mywidgets

import kotlin.random.Random

internal object NumberGenerator {
    fun generate(max: Int): Int {
        val random = Random
        return random.nextInt(max)
    }
}