fun main() {
    val numericGrade = getValidGrade("Enter the grade of student out of 100: ")
    if (numericGrade != null) {
        val letterGrade = calculateLetterGrade(numericGrade)
        println("The corresponding letter grade is: $letterGrade")
    }
}

fun getValidGrade(message: String): Int? {
    println(message)
    val input = readLine()?.toIntOrNull()
    if (input == null || input !in 0..100) {
        println("Invalid input. Please enter a numeric grade between 0 and 100.")
    }
    return input
}

fun calculateLetterGrade(numericGrade: Int): String {
    return when (numericGrade) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }
}
