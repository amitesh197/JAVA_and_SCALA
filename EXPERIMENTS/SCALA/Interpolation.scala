object StringInterpolationDemo {
  def main(args: Array[String]): Unit = {
    val name = "Alice"
    val age = 30

    val message = s"My name is $name and I am $age years old."

    println(message)
  }
}
