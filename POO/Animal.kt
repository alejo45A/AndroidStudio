package com.example.myapplication.POO

class Animal(val nombre: String) {
    companion object{
        fun crearPerro(): Animal{
            return Animal("Perro")
        }
    }
}