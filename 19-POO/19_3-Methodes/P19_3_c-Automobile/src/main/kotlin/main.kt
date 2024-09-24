class Car(val make: String, val year: Int,speed:Int) {

    var speed: Int = 0
    fun accelerate(){
        speed+=5
    }
    fun decelerate(){
        speed-=5
        if(speed<0){
            speed = 0
        }
    }


}

fun main() {
    val myCar = Car("Mustang", 1976,100)
    myCar.accelerate()
    println(myCar.speed)
    myCar.decelerate()
    myCar.decelerate()
    println(myCar.speed)
}