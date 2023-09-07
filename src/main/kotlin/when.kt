package com.mati.androidmaster.sintaxis

//El when es como el switch pero con steroides

fun main(){

}

fun getSemester(month: Int){
    when(month){
        //esto es para ver entre el 1 y el 6 , se le pone in primero
        in 1..6 ->  "Primer semestre"
        in 7..12 ->   "Segundo semestre"
        //para negaer
        !in 1..12 -> "Semestre no válido"
        else ->  "dawda"
    }
}

fun getMonth(month:Int){
    when(month){
        1 -> println("Enero")
        2 -> println("Enero")
        3 -> println("Enero")
        4 -> println("Enero")
        //le pongo las {} para poner mas codigo
        5 ->{
            println("Enero")
            println("Enero")
        }
        else -> println("no es un mes loco")
    }
}