import java.util.*

enum class EntityyType{
    HELP, EASY,MEDIUM,HARD;
    fun getFormattedName() = name.toLowerCase().capitalize()
}
object  EntityyyFactory{
    fun create(type: EntityyType): Entityyy{
        val id = UUID.randomUUID().toString()
        // for the example enum use case for a variable change base on the type
        val name = when(type){
            EntityyType.EASY -> type.getFormattedName()
            EntityyType.MEDIUM -> type.getFormattedName()
            EntityyType.HARD -> type.getFormattedName()
            EntityyType.HELP -> type.getFormattedName()

        }
        return when(type){
            EntityyType.EASY -> Entityyy.Easy(id,name)
            EntityyType.MEDIUM -> Entityyy.Medium(id,name)
            EntityyType.HARD -> Entityyy.Hard(id,name,2f)
            EntityyType.HELP -> Entityyy.Help

        }

    }
}
sealed class Entityyy(){
    // to create object inside class need to mention the class to make it usable inside the other
    object  Help : Entityyy(){
        val name = "Help"
    }
    // same with data class have to add the sealed class to make it usable
    data class Easy(val id: String, val name: String):Entityyy()
    data class Medium(val id: String, val name: String):Entityyy()
    data class Hard(val id: String, val name: String,val multiplier: Float):Entityyy()

}
// to add call the extension inside a class
fun Entityyy.Medium.printInfo(){
    println("Medium class: $id")
}
// new variable extension by using getter
val Entityyy.Medium.info: String
    get() = "some info"

fun main(){
    val entitiy:Entityyy = EntityyyFactory.create(EntityyType.HELP)
    val msg = when(entitiy){

        // object declaration no need to have is
            // this to print depend on the variable and the after variable has to mention the sealed class
        Entityyy.Help -> "help class"
        is Entityyy.Easy -> "ez class"
        is Entityyy.Medium -> "med class"
        is Entityyy.Hard -> "hard class"

    }
    println(msg)

    val entity1 = EntityyyFactory.create(EntityyType.EASY)
    val entity2 = EntityyyFactory.create(EntityyType.EASY)
    val entity3 = Entityyy.Easy("id","name")
    // same result with create the new entity
    // add value inside the copy parameter to change the given value
    val entity4 = entity3.copy(name = "New Name")
        //Entityyy.Easy("id","name")
    // because the id is different for each creation
    if(entity1 == entity2){
        println("They are equal")
    }else{
        println("They are not equal")
    }
    // because without the creation the id that got saved is the same
    if(entity4 == entity3){
        println("They are equal")
    }else{
        println("They are not equal")
    }
    val entitiy5 = EntityyyFactory.create(EntityyType.MEDIUM)
    if(entitiy5 is Entityyy.Medium){
        // the use of smart cast
        entitiy5.printInfo()
        entitiy5.info
    }

}