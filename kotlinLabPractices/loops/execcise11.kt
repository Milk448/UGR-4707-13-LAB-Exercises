fun main() {
    println("Enter a number: ")
    val number = readLine()!!.toInt()
  
    val reversedNumber = reverseNumber(number)
  
    if (number == reversedNumber) {
      println("$number is a palindrome")
    } else {
      println("$number is not a palindrome")
    }
  }
  
  // Function to reverse a number
  fun reverseNumber(num: Int): Int {
    var reversed = 0
    var originalNumber = num
    while (originalNumber != 0) {
      val lastDigit = originalNumber % 10
      reversed = reversed * 10 + lastDigit
      originalNumber /= 10
    }
    return reversed
  }
  