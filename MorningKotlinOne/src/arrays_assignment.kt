import java.util.*

fun main(args: Array<String>) {
    var take = Scanner(System.`in`)
    println("How many students do you have")

    var number = take.nextInt()
    var students = arrayOfNulls<String>(number)
    var id = arrayOfNulls<Int>(number)
    var marks = arrayOfNulls<Int>(number)
    println("Enter the $number students")

    //Write a loop to receive the names,id and marks
    var x = 0
    while (x < number) {
        students[x] = take.next()
        println("Enter " + students[x] + "'s id")
        id[x] = take.nextInt()
        println("Enter " + students[x] + "'s marks")
        marks[x]=take.nextInt()
        x++
    }
    //Write a loop to output results
    var y=0
    while (y<number){
        println(students[y]+"--"+id[y]+"--"+marks[y])
        y++
    }

}