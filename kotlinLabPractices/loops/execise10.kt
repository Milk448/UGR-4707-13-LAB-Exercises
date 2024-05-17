fun main() {
    println("Enter the lower limit of the range (inclusive): ")
    val lowerLimit = readLine()!!.toInt()
  
    println("Enter the upper limit of the range (inclusive): ")
    val upperLimit = readLine()!!.toInt()
  
    println("Prime numbers between $lowerLimit and $upperLimit:")
  
    var num = lowerLimit
    while (num <= upperLimit) {
      if (isPrime(num)) {
        print("$num ")
      }
      num++
    }
  }
  
  // Function to check if a number is prime
  fun isPrime(n: Int): Boolean {
    if (n <= 1) return false // 1 or less are not prime
    if (n <= 3) return true  // 2 and 3 are prime
  
    if (n % 2 == 0 || n % 3 == 0) return false // Divisible by 2 or 3, not prime (except 2 and 3)
  
    var i = 5
    while (i * i <= n) {
      if (n % i == 0 || n % (i + 2) == 0) return false // Check divisibility by 6k ± 1 up to the square root of n
      i += 6
    }
  
    return true // If no divisors found, it's prime
  }
  