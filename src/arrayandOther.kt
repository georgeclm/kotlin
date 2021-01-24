// by default all collection type in kotlin is immutable
// this is to create an array
val interestingThings = arrayOf("Kotlin","Programming","Troll gaming")
fun main(){
    // take the size
    println(interestingThings.size)
    println(interestingThings[0])
    // same index array with .get function
    println(interestingThings[0])
    for (interestingThing in interestingThings){
        println(interestingThing)
    }
    // lambda syntax in kotlin for foreach in array
    interestingThings.forEach {interestingThing ->
        println(interestingThing)
    }
    // another foreach which takes the index and the item
    interestingThings.forEachIndexed { index, interestingThing ->
        println("$interestingThing is at index $index")
    }
    sayHello("Hi",interestingThings3)
    greetPerson(name = "George")
    anotherHello("Hi", *interestingThings)
    anotherHello("Hi","try","new","array")
    forList()
}
fun forList(){
    // this is for list it have more function inside then array
    // add mutable to make the list is mutable because the default is immutable
    val interestingThings2 = mutableListOf("Anas","Butane","Programming")
    interestingThings2.add("Troll gaming")
    println(interestingThings2[0])
    interestingThings2.forEach{ interestingThing ->
        println(interestingThing)
    }
    // this is for map like dictionaries
    // now it is mutable
    val map= mutableMapOf("b" to "a", 2 to "b", 3 to "c")
    // to add more in map use "," instead "to" but it is the same
    // and only can add 1 argument with 2 parameter for the first and the second value
    // because how map work
    map["a"] = "b"
    map.forEach{ (key, value) -> println("$key -> $value")}
}
fun sayHello(greeting:String, item:List<String>){
    item.forEach{ theItem ->
        println("$greeting $theItem")
    }
}
// use vararg mean to take an array after the greeting and the size is depend on the number of input by user
// if there is no item then nothing is going to get printed
fun anotherHello(greeting:String, vararg item:String){
    item.forEach{ theItem ->
        println("$greeting $theItem")
    }
}
// this feature is to set the default "Hello for greeting and Kotlin for name"
fun greetPerson(greeting:String = "Hello", name:String = "Kotlin") = println("$greeting $name")

// use "*" to spread an array to an argument because the parameter is argument then it wont accept array

val interestingThings3 = mutableListOf("Anas","Bukharin","Programming")



