class Box(var height: Double, var width: Double, var length: Double) {
    fun getVolume():Double{
        var height = height
        var width = width
        var length = length
        var result = height*width*length
        return result
    }
}


fun main() {
    val myBox = Box(10.0, 20.0, 50.0)
    println(myBox.getVolume())
}