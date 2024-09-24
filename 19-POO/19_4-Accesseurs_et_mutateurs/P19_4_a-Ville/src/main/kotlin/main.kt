class City(val name: String,var population:Int) {
    init {
        if (population < 0) {
            population = 0
        } else if(population>50_000_000){
            population = 50_000_000
        }
    }
}

fun main() {
    val goodCity = City("Good City",65_000_000)
    val badCity = City("Bad City",45_000_000)

    println(badCity.population)
    println(goodCity.population)
}