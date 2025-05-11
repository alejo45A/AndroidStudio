package com.example.myapplication.POO

class Producto (precio: Double){
   var precio: Double = 0.0
        set(value){
            field = if(value in 0.0 .. 100.0) value else 0.0
        }
}