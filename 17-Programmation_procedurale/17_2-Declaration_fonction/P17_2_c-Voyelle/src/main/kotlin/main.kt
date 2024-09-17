fun isVowel(lettre:Char){
    println(lettre =='a' || lettre == 'e' || lettre == 'i' || lettre == 'o' || lettre=='u' || lettre=='y'||lettre=='A'||lettre=='E'||lettre=='I'||lettre=='O'||lettre=='U'||lettre=='Y')
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
