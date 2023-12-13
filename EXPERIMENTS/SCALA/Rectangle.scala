class Rectangle(val length: Double, val breadth: Double) {
  def area(): Double = length * breadth
  def perimeter(): Double = 2 * (length + breadth)
}

class Square(side: Double) extends Rectangle(side, side)

object Main {
  def main(args: Array[String]): Unit = {
    // Creating a Rectangle object
    val rectangle = new Rectangle(5.0, 7.0)

    // Creating a Square object
    val square = new Square(4.0)

    // Printing details for Rectangle
    println("Rectangle Details:")
    println(s"Length: ${rectangle.length}")
    println(s"Breadth: ${rectangle.breadth}")
    println(s"Area: ${rectangle.area()}")
    println(s"Perimeter: ${rectangle.perimeter()}")

    // Printing details for Square
    println("\nSquare Details:")
    println(s"Side: ${square.length}") // square.length and square.breadth are the same in this case
    println(s"Area: ${square.area()}")
    println(s"Perimeter: ${square.perimeter()}")
  }
}
