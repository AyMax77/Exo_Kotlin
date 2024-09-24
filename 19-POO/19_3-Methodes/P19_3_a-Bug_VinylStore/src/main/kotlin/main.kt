// fix it
class VinylStore(vinyl: String) {
    val vinyl = vinyl
    fun printVinyl() {
        println(this.vinyl)
    }
}

fun main() {
    val myStore = VinylStore("Vinyl Record")
    myStore.printVinyl()
}