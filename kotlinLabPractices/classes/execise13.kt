class Triangle(val side1: Double, val side2: Double, val side3: Double) {

    fun isValidTriangle(): Boolean {
      return side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2
    }
  

    fun getTriangleType(): String {
      if (!isValidTriangle()) {
        return "Invalid Triangle" // Not a valid triangle if sides don't satisfy the triangle inequality
      }
      if (side1 == side2 && side2 == side3) {
        return "Equilateral Triangle"
      } else if (side1 == side2 || side2 == side3 || side1 == side3) {
        return "Isosceles Triangle"
      } else {
        return "Scalene Triangle"
      }
    }
  }
  
  fun main() {
    val triangle = Triangle(5.0, 5.0, 5.0) // Create an equilateral triangle
    val triangleType = triangle.getTriangleType()
  
    println("Triangle with sides ${triangle.side1}, ${triangle.side2}, ${triangle.side3} is a: $triangleType")
  }
  