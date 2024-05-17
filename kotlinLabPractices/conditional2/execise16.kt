fun main() {
    println("Enter the first number: ")
    val num1 = readLine()!!.toInt()
  
    println("Enter the second number: ")
    val num2 = readLine()!!.toInt()
  
    println("Enter the third number: ")
    val num3 = readLine()!!.toInt()
  
    val largestNumber = findLargest(num1, num2, num3)
  
    println("The largest number is: $largestNumber")
  }
  
  fun findLargest(a: Int, b: Int, c: Int): Int {
    // Nested conditionals to determine the largest number
    return if (a >= b) {
      if (a >= c) a else c 
    } else {
      if (b >= c) b else c 
    }
  }
  