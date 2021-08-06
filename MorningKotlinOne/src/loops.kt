fun main(args: Array<String>) {
    //while loop
    var x:Int=0
    while (x<5){
        println(x)
        x++
    }
    //Do while loop
    var y:Int=10
    do{
        println(y)
        y++
    }while (y<15)
    //Repeat loop
    repeat(10){
        println("Hello king")
    }
    //For loop
    var names = arrayOf("Jeff","Betty","Wayne","Becky","Sharon")
    for (jina in names){
        println(jina)
    }
    //var numbers=1...10
    var numbers=10 downTo 1
    for (nambari in numbers) {
        println(nambari)
    }
}