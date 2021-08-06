package oop

fun main(args: Array<String>) {
    var f1=Admin("king@gmail.com","123")
    f1.login()
}
open class NormalUser(open var email:String, open var password:String){
    fun login(){
        println("Yeah, I can login")
    }
    fun access_portal(){
        println("Yeah, I can access the students portal")
    }
}
class Admin(override var email: String, override var password: String):NormalUser(email,password){
    fun add_users(){
        println("Yeah, I can add users")
    }
    fun suspend_student(){
        println("Yeah, I can suspend a student")
    }
}