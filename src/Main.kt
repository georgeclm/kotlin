// this is global variable
// in kotlin variable is null so have to mention the type
// use ? so the variable can be null
var aName: String? = null
fun main(){
    println("Hello Kotlin")
    // use val for readonly variable
    // use var for mutable variable
    // for local variable
    // don't have to mention the type of variable
    if(aName != null){
        println(aName)
    }else{
        println("Lol name")
    }
    val name= "George"
    println(name)
    aName = "ffGeorge"
    // this is simple if function inside variable
    val theRandomName = if(aName != null) aName else "This is a random name"
    // this when function is like switch case using -> and else as default
    when(aName){
        null ->println("No name")
        "George" -> println(aName)
        else -> println(theRandomName)
    }
    sayHello("George","LOLL")

    println(getGreeting())
}
// to define the return type just like variable and nullable by adding ?
//fun getGreeting(): String?{
//    return "Hello Function"
//}
// same result call the single line function
fun getGreeting(): String = "Hello Function"
// function parameter
//fun sayHello(item:String){
//    val msg = "Hello $item"
//    println(msg)
//} same result with 1 line function
fun sayHello(name:String,item:String) = println("Hello $name you are $item")


