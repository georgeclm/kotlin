import java.util.*

enum class EntityType{
    EASY,MEDIUM,HARD;
    fun getFormattedName() = name.toLowerCase().capitalize()
}
object  EntityyFactory{
    fun create(type: EntityType): Entityy{
        val id = UUID.randomUUID().toString()
        // for the example enum use case for a variable change base on the type
        val name = when(type){
            EntityType.EASY -> type.getFormattedName()
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> type.getFormattedName()
        }
        return Entityy(id,name)
    }
}
class Entityy(val  id: String, val name: String){
    override fun toString(): String {
        return "id: $id name:$name"
    }
}
fun main(){
    val entitiy = EntityyFactory.create(EntityType.EASY)
    println(entitiy)
    val mediumEntityy = EntityyFactory.create(EntityType.MEDIUM)
    println(mediumEntityy)
}