fun main() {
    var a = mutableListOf(5,5,1,4,2,3)
    var res = a[0]
    for (i in 1..< a.size){
        if (a[i]< res){
            res = a[i]
        }
    }
    println(res)
}
