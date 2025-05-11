package com.example.myapplication.POO

sealed class Resultado {

}

class Exitoso(val data: String) : Resultado()
class Error(val codigo: Int, val mensaje: String): Resultado()
fun obtenerResultado(r: Resultado){
    when(r){
        is Exitoso ->  println("Exitoso: ${r.data}")
        is Error ->  println("Error: ${r.codigo} - ${r.mensaje}")
    }
}