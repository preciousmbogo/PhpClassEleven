import java.util.*

fun main(args: Array<String>) {
    var OurScanner=Scanner(System.`in`)
    println("How many students do you have")
    var number=OurScanner.nextInt()
    println("Enter the $number names")
    var students= arrayOfNulls<String>(number)
    //Write a loop to receive all the names
    var x=0
    while (x<number){
        students[x]=OurScanner.next()
        x++
    }
    //Write a loop to print the names
    for (name in students){
        println(name)
    }
}