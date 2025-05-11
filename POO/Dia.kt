package com.example.myapplication.POO

enum class Dia(val numero: Int) {
    LUNES(1),
    MARTES(2),
    MIERCOLES(3),
    JUEVES(4),
    VIERNES(5),
    SABADO(6),
    DOMINGO(7);

    fun obtenerNombre(): String{
        return when (this){
            LUNES -> "Lunes"
            MARTES -> "Martes"
            MIERCOLES -> "Miercoles"
            JUEVES -> "Jueves"
            VIERNES -> "Viernes"
            SABADO -> "Sabado"
            DOMINGO -> "Domingo"
        }
    }


}