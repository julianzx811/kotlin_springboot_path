fun main() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    // eager, creates a new list
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

}