fun isVowel(lettre:Char){
    println(lettre =='a' || lettre == 'e' || lettre == 'i' || lettre == 'o' || lettre=='u' || lettre=='y')
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
