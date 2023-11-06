object MaxOfThreeNumbers {
  def main(args: Array[String]): Unit = {

    println("Enter the first number: ")
    val num1 = scala.io.StdIn.readInt()
    println("Enter the second number: ")
    val num2 = scala.io.StdIn.readInt()
    println("Enter the third number: ")
    val num3 = scala.io.StdIn.readInt()

    val max = if (num1 >= num2 && num1 >= num3) {
      num1
    } else if (num2 >= num1 && num2 >= num3) {
      num2
    } else {
      num3
    }

    println(s"The maximum number among $num1, $num2, and $num3 is: $max")
  }
}
