fun main() {

//    val greetingFunction = { playerName: String, numberBuildings: Int ->
//        val currentYear = 2019
//        "Welcome to SimVillage with $numberBuildings buildings, $playerName!(Copyright $currentYear)"
//    }
//    runSimulation("Jingkai", greetingFunction)

//    runSimulation("Jingkai", ::printConstructionCost){playerName: String, numberBuildings: Int ->
//        val currentYear = 2019
//        "Welcome to SimVillage with $numberBuildings, $playerName! (Copyright $currentYear)"
//    }

    runSimulation()
}

//inline fun runSimulation(playerName: String, costPrinter:(Int) -> Unit, greetingFunction:(String, Int) -> String){
//    val numberBuildings = (1..3).shuffled().last()
//    costPrinter(numberBuildings)
//    println(greetingFunction(playerName, numberBuildings))
//}
//
//inline fun printConstructionCost(numBuildings: Int) {
//    val cost = 500
//    println("construction cost: ${cost * numBuildings}")
//}

fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Jingkai"))
    println(greetingFunction("Lijuan"))
}


fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2019
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName!(copyright $currentYear)"
    }
}
