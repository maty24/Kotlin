package com.mati.androidmaster.sintaxis

fun main(){
    ifBasico()
    ifAnidado()
    ifMultipleOr()
    ifMultiple()
}

fun ifMultipleOr(){
    var pet = "cat"
    var isHappy = true

    //OR
 //si una es true pasa, si pasa en gato deve cumplir esa condificon
    if(pet == "cat" || (pet == "cat" && isHappy)){
        println("es un perro o gato feliz")
    }
}


fun ifMultiple(){
    var age = 18
    var parenetPermision = false
    var imHappy = false


   //AND
    //si son todas true pasa , si una no es true no pasa
    if(age >= 18 && parenetPermision && imHappy ){
        println("si se puede")
    }
}


fun ifAnidado(){
    val animal = "perro"

    if (animal == "perro"){
        println("es un peyo")
    }else if(animal == "gato") {
        println("es un agto")
    }else if(animal == "lorp"){
        println("es un loro")
    }else{
        println("no esta el animal en la lista")
    }
}

fun ifBasico(){
    val name = "mati"

    if(name == "matai"){
        println("el nombre es mati")
    }else{
        println("no se llama na loco :c")
    }
}