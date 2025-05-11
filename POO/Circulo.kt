package com.example.myapplication.POO

class Circulo(val radio: Double) {
    fun calcualrArea(): Double {
        return Math.PI * radio * radio
    }

    fun describir(): String {
        return "curculo con radio $radio"
    }
}