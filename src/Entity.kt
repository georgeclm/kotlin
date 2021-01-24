interface IdProvider{
    fun getId(): String
}

class Entitiy private constructor(val  id: String){
    // use this companion to exclude a function inside a class to be use publicly
    // add idprovider for the implementation interface
    companion object Factory : IdProvider{
        override fun getId(): String {
            return "123"
        }
        const val id = "id"
        fun create() = Entitiy(getId())
    }
}
fun main(){
    //val entitiy = Entitiy.create()
    // same result below to shorten companion
    val entitiy = Entitiy.Factory.create()
    Entitiy.id
}