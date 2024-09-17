fun main() {
    // Liste d'exemple
    val numbers = mutableListOf(6, 1, 2, 4, 5, 6, 7)

    // Variable pour compter le nombre de triples
    var tripleCount = 0

    // Vérifier les triples dans la liste
    for (i in 0 until numbers.size - 2) {
        if (numbers[i] + 1 == numbers[i + 1] && numbers[i + 1] + 1 == numbers[i + 2]) {
            tripleCount++
        }
    }

    // Afficher le résultat
    println(tripleCount)
}
