class Kitty {
    var color:String=""
    var age:Int=0
    constructor(_color: String,_age:Int){
        var color = _color
        var age = _age
    }
    constructor(__age:Int,__color:String){
        var age = __age
        var color = __color
    }
    constructor(couleur:String){
        var color = couleur
    }
    constructor(ager:Int){
        var age = ager
    }
}


fun main() {
    val garfield = Kitty("orange", 7)
    val tom = Kitty(8, "grey")
    val grominet = Kitty("black")
    val kitty = Kitty(3)
}