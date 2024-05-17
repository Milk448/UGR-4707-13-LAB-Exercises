fun main() {
    println("Enter the lengths of the triangle sides (separated by spaces):")
    val sides = readLine()!!.split(" ").map { it.toDouble() }.toTypedArray()
  
    if (sides.size != 3) {
      println("Invalid input: Please provide three side lengths.")
      return
    }
  
    val (side1, side2, side3) = sides 
  
    
    if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
      println("Invalid triangle: The sum of any two sides must be greater than the third side.")
      return
    }
  
    // Check triangle type
    if (side1 == side2 && side2 == side3) {
      println("Equilateral Triangle")
    } else if (side1 == side2 || side2 == side3 || side1 == side3) {
      println("Isosceles Triangle")
    } else {
      println("Scalene Triangle")
    }
  }
  