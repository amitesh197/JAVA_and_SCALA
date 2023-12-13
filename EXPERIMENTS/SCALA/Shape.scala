class Shape {
  def printShape(): Unit = {
    println("This is shape.")
  }
}

class Rectangle extends Shape {
  def printRectangle(): Unit = {
    println("This is rectangular shape.")
  }
}

class Circle extends Shape {
  def printCircle(): Unit = {
    println("This is circular shape.")
  }
}

class Square extends Rectangle {
  def printSquare(): Unit = {
    println("Square is Rectangle.")
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    // Creating an object of Square class
    val square = new Square()

    // Calling methods of Shape and Rectangle using the object of Square
    square.printShape()
    square.printRectangle()
  }
}
