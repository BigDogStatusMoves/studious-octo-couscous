
fun main() {
    var userResponse: Int
    do {
        println("Are you a residential or business customer?")
        println("1) Residential")
        println("2) Business")
        println("3) Exit")
        userResponse = readln().toInt()
    }while (userResponse<1 || userResponse>3)
    when (userResponse){
        1 -> {
            println("Enter name: ")
            val name = readln()
            println("Enter phone number: ")
            val phone = readln()
            return residential(name,phone)
        }
        2 -> {
            println("Enter business name: ")
            val businessName = readln()
            println("Enter contact name: ")
            val name = readln()
            println("Enter phone number: ")
            val phone = readln()
            return business(businessName, name, phone)
        }
    }
}
fun residential (residentName:String,residentPhone:String){
    var yesNo: Int
    println("Your information is listed as follows: ")
    println("Name: $residentName")
    println("Phone Number: $residentPhone")
    do {
        println("Is this correct?")
        println("1) Yes")
        println("2) No")
        yesNo = readln().toInt()
    }while (yesNo<1 || yesNo>2)
    when (yesNo) {
        1 -> println("Your information is saved. Thank you.")
        2 -> main()
    }
}

fun business (business:String, ownerName:String, businessPhone:String){
    var yesNo: Int
    println("Your information is listed as follows: ")
    println("Contact name: $ownerName")
    println("Business name: $business")
    println("Business phone number: $businessPhone")
    do {
        println("Is this correct?")
        println("1) Yes")
        println("2) No")
        yesNo = readln().toInt()
    }while (yesNo<1 || yesNo>2)
    when (yesNo) {
        1 -> println("Your information is saved. Thank you.")
        2 -> return main()
    }
}

