fun main() {
    val targetSum = readLine()!!.toInt() // Get the target sum from the user
  
    var sum = 0
    
    
    for (num in 2..50 step 2) {
      sum += num
      if (sum == targetSum) {
        break // Exit the loop if the target sum is reached
      }
    }
  
    if (sum == targetSum) {
      println("$targetSum is the sum of all even numbers from 1 to 50")
    } else {
      println("$targetSum is not the sum of all even numbers from 1 to 50")
    }
  }
  