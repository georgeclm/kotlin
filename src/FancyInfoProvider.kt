// this class will be use to extent the basic info provider class in  use of inheritance
class FancyInfoProvider : BasicInfoProvider(){
    // now to override from the basic info
    override val providerInfo: String
    // costum getter
        get() = "Fancy Info Provider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy Info")
    }

    override val sessionIdPrefix: String
        get() = "Fancy Session"

}