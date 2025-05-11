package com.example.myapplication.POO

class Usuario (val nombre: String, val edad: Int){
    init {
        println("El usuario creado: $nombre tiene $edad años")
        require(edad >= 0){
            println("La edad no puede ser menor a 1")
        }
    }
}