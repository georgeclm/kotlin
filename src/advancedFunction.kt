// higher order function
// this predicate will be a function that take string and return boolean value
// the predicate is a lambda property
fun printFilteredString(list: List<String>, predicate: ((String) -> Boolean)?){
    list.forEach {
        // use the invoke mean let it work if the value are null so it will work
        if(predicate?.invoke(it) == true){
            println(it)
        }
    }
}
// this higher order can work with input and output
// store the function as a variable
// for input
val predicate: (String) ->Boolean = {
    it.startsWith("K")
}
// for output
fun getPrintPredicate(): (String) -> Boolean{
    return {it.startsWith("J")}
}
fun main(){
    val list = listOf("Kotlin","JavaScript","C#","HTML","Java")
    printFilteredString(list, getPrintPredicate())
    printFilteredString(list, predicate)
    // to filter the not null and then continue
    list.filterNotNull()
            // to filter the element that start with H then continue
        .filter {
        it.startsWith("H")
    }
            // the use of map now the type below change from string to integer
        .map {
            it.length
        }
            // after the filter then print
        .forEach {
        println(it)
    }
    list.filterNotNull()
            // this take function take how many value from index 0
            // and takeLast to take the last 3 value from last index
        .takeLast(3)
        .forEach {
            println(it)
        }
    list.filterNotNull()
        // use this associate to make on this one the it.value will be the length of the string
        // this will make the it value is the length and the it.key will be the string value
        .associate { it to it.length }
        .forEach{
            println("${it.value}, ${it.key}")
        }
    val map = list
    list.filterNotNull()
        .associate { it to it.length }
    // print the first value of the list
    val language = list.first()
    println(language)
    // last value of the list
    // add this orEmpty to make that if not found it will be empty instead of null
    println(list.filterNotNull().last().orEmpty())
    // find from the beginning take only 1 value
    println(list.find{it.startsWith("Java")}.orEmpty())
    // find from the last index value
    println(list.findLast{it.startsWith("Java")}.orEmpty())

}