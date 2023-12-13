import scala.io.StdIn

class Circle {
  private var radius: Double = _

  def setRadius(r: Double): Unit = {
    if (r >= 0) {
      radius = r
    } else {
      println("Radius cannot be negative. Setting radius to 0.")
      radius = 0
    }
  }

  def calculateArea(): Double = {
    math.Pi * radius * radius
  }

  def displayArea(): Unit = {
    println(s"The area of the circle with radius $radius is: ${calculateArea()}")
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val myCircle = new Circle()

    // Accept radius from the user
    print("Enter the radius of the circle: ")
    val userRadius = StdIn.readDouble()
    myCircle.setRadius(userRadius)

    // Display area
    myCircle.displayArea()
  }
}
