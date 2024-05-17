class Rectangle(val length: Double, val width: Double) {
    fun calculatePerimeter(): Double {
      return 2 * (length + width)
    }
  
    
    fun calculateArea(): Double {
      return length * width
    }
  }
  
  fun main() {
    val rectangle = Rectangle(5.0, 3.0) // Create a rectangle object
  
    val perimeter = rectangle.calculatePerimeter()
    val area = rectangle.calculateArea()
  
    println("Rectangle with length ${rectangle.length} and width ${rectangle.width}:")
    println("Perimeter: $perimeter")
    println("Area: $area")
  }
  