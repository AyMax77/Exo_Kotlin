class Complex{
    var real = 0.0
    var image = 0.0
}


fun main() {
    val number1 = Complex()
    number1.real = 5.0
    number1.image = 2.0
    println(number1.real)
    println(number1.image)
}