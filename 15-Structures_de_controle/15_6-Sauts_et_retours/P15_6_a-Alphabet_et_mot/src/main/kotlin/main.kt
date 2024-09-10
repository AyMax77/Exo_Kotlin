fun main() {
    val a = "hello"
    val alphabet = ('a'..'z').toList()


    val filteredAlphabet = alphabet.filterNot { it in a }


    val result = filteredAlphabet.joinToString("")

    println(result)
}
