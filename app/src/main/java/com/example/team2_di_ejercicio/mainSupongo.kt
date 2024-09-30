package com.example.team2_di_ejercicio
import kotlin.math.pow

fun main(){
    println("Ejercicio 1:")
    ej1()
    println("")

    println("Ejercicio 2:")
    ej2()
    println("")

    println("Ejercicio 3:")
    ej3()
    println("")

    println("Ejercicio 4:")
    ej4()
    println("")

    println("Ejercicio 5: 50f")
    ej5(50f)
    println("")
}


fun ej1(){
    var edad = 19
    var nombre = "Jaime"
    var altura = 1.75f

    println("Hola, soy $nombre, tengo $edad años y mido $altura metros")
}


fun ej2(){
    val PI = 3.14159f
    var radio = 5f
    var res = PI * radio.pow(2)

    println("El área de un círculo de radio $radio es de $res")
}


fun ej3(){
    saludar("Jaime", 19)
}

fun saludar(nombre: String, edad: Int){
    println("Hola $nombre de $edad años!")
}


fun ej4(){
    informacionPersonal("Jaime", 19, "Granada")
}

fun informacionPersonal(nombre: String, edad: Int, ciudad: String){
    println("Nombre: $nombre" +
            "\nEdad: $edad" +
            "\nCiudad: $ciudad")
}


fun ej5(num: Float){
    print("Celsius a Fahrenheit: ")
    celsiusAFahrenheit(num)
    print("Fahrenheit a Celsius: ")
    fahrenheitACelsius(num)
}

fun celsiusAFahrenheit(num: Float){
    var res : Float = num * 9 / 5 + 32

    println(res)
}

fun fahrenheitACelsius(num: Float){
    var res : Float = (num  - 32) * 5 / 9

    println(res)
}