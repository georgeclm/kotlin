// for the class it is public by default so the value can be called inside the main
// there is internal which mean it will work in the same module or path
// there is private where the class will work only inside the file
class Person( val firstName: String = "Peter", val lastName: String = "Parker"){
    // init is the code anytime the class is run all init will run first
    // there is protected which will make the variable only inside the class
    var nickName: String? = null
        // use the set value to execute this code everytime the new value is added inside the new nickname which print out the nick
        set(value) {
            field = value
            println(" The new nickname is $value")
        }
        get() {
            println("The returned value is $field")
            return field
        }
    fun printInfo(){

        val nickToPrint = nickName ?: "no nick"
        // same result below
            //if(nickName != null) nickName else "no nick"
        println("$firstName ($nickToPrint) $lastName")
    }
}