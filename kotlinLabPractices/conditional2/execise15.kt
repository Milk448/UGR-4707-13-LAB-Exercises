fun main() {
    println("Enter the month (1-12): ")
    val month = readLine()!!.toInt()
  
    println("Enter the day of the month (1-31): ")
    val day = readLine()!!.toInt()
  
    val season = determineSeason(month, day)
  
    if (season != null) {
      println("The season is: $season")
    } else {
      println("Invalid month or day entered.")
    }
  }
  
  fun determineSeason(month: Int, day: Int): String? {
    // Use ranges to define season boundaries with some overlap for edge cases
    return when {
      (month in 3..5 && day >= 21) || (month in 6..8) -> "Summer"
      (month in 9 && day >= 22) || (month in 10..11) || (month in 12 && day <= 20) -> "Fall"
      (month in 12 && day >= 21) || (month in 1..2) || (month in 3 && day <= 20) -> "Winter"
      (month in 4 && day <= 20) || (month in 5 && day < 21) -> "Spring"
      else -> null // Invalid month or day
    }
  }
  