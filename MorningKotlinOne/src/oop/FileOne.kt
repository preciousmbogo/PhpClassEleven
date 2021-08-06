package oop

fun main(args: Array<String>) {
    //Create an object from the class
    var car1:Car
    car1= Car()
    println(car1.color)
    var car2=Car()
    println(car2.manufacturer)
    car1.accelerate()
    car2.brake()
}
class Car{
    var color="Maroon"
    var wheels=24
    var drive_type="Left"
    var manufacturer="Mercedes"
    fun accelerate(){
        println("Yeah, I can accelerate")
    }
    fun brake(){
        println("Yeah,I can break")
    }
}