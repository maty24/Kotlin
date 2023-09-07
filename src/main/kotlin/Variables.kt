package com.mati.androidmaster.sintaxis

fun main() {


    //Variables


    val age: Int = 25
    val example: Long = 25
    val floatExample: Float = 25.11f //le tengo que poner una f al final
    val doubleExample: Double = 432.43253245 //soporta mas decimales pero consume mas memoria


    //Variables alfanomuerica


    val charExample: Char = 'e' //puede ser cualquier caracter pero solo 1
    val stringExample: String = "matiel pulento 10"




    //Bool


    val boolExample: Boolean = true


    print(age * example)


    var templeString :String = "hola"
    templeString =  "hola me llaamo  $stringExample y tengo $age"
    print(templeString)
    //me crea de int a string
    val example123: String = age.toString()

    //funcion con parametro, los string siempre van con "" doble comilla
    showMyAge("matias",25)


    val mySubtract = subtract(10,5)
}


fun showMyAge(name : String,currentAge: Int){
    println("me llamo $name y  tengo $currentAge alos")
}

//  le pongo :Int,esto hace que me retorne una pura cosa que deve ser un Int
fun subtract(firstNumber: Int, secondNumber: Int): Int{
    return  firstNumber - secondNumber
}