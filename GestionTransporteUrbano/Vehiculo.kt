package com.example.myapplication.GestionTransporteUrbano

// Punto 1
abstract class Vehiculo (val id: String, val capacidad: Int, val velocidadMaxima: Double ) {

    abstract fun moverse()
    abstract fun detenerse()

    fun infoVehiculo() {
        println("La placa del auto es ${id}. Tiene una capacidad para ${capacidad} pasajeros y su velocidad maxima es de ${velocidadMaxima}")
    }
}

// Punto 2

class Bus : Vehiculo(){

}
