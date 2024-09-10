fun main() {
    // Lire la taille de la liste
    val size = readLine()!!.toInt()

    // Lire les éléments de la liste
    val numbers = mutableListOf(6,1)

    // Variable pour compter le nombre de triples
    var tripleCount = 0

    // Vérifier les triples dans la liste
    for (i in 0 until size - 2) {
        if (numbers[i] + 1 == numbers[i + 1] && numbers[i + 1] + 1 == numbers[i + 2]) {
            tripleCount++
        }
    }
    println(tripleCount)
}
