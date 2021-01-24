interface PersonInfoProvider{
    val providerInfo : String
    // use the person class before
    fun printInfo(person: Person){
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider{
    fun getSessionId() : String
}
// use this open before the class to make the class can be inhereted to other class
open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider{
    // this is to override the variable of providerInfo
    // all this class override to change all the product inside the interface
    override val providerInfo: String
        get() = "BasicInfoProvider"
    // add open for the variable inside the class because to override variable inside class have to use open
    // after this use protected to make sure the variable is not readable outside the class but it is inside the child class
    protected open val sessionIdPrefix = "Session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionId(): String {
        return  sessionIdPrefix
    }
}

fun main(){
    // this variable can also include an object and base of a class and can override
    val provider = object  : PersonInfoProvider{
        override val providerInfo: String
            get() = "New Info Provider"
        fun getSessionId() = "id"
     }
    provider.printInfo(Person())
    provider.getSessionId()
    checkTypes(provider)
}

fun checkTypes(infoProvider: PersonInfoProvider){
    if (infoProvider !is SessionInfoProvider){
        println("not a session provider")
    }else{
        println("is a session info provider")
        infoProvider.getSessionId()
    }
}

