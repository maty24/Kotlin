package com.mati.androidmaster.sintaxis

fun main(){

    //le digo que esta variable puede ser nula
    var name:String? = null

    //name!!.get -> le digo que no va ser nulo

    //le pongo el ? que puede ser nulo, y el ?: para reemplazar el valor
    println(name?.get(3) ?: "es nulo")
}