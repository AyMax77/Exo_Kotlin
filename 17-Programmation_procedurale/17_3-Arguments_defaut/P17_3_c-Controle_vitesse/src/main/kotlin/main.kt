fun checkSpeed(speed: Int,limit:Int = 60) {
    var N = speed - limit
    if(speed>limit){
        println("Exceeds the limit by $N kilometers per hour")
    } else {
        println("Within the limit")
    }
}

fun main() {
    checkSpeed(100, 60)
    checkSpeed(40, 90)
    checkSpeed(61)
    checkSpeed(60)
}