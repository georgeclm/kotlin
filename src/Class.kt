fun main(){
    val person = Person()
    // for the set value so everytime value is set it will print the notice
    person.nickName = "George"
    // every time the user want to print the person nickname the get function will get executed first which is print the return value
    //println(person.nickName)
    person.printInfo()  
}