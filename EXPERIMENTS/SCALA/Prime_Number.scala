object PrimeCheck {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val number = scala.io.StdIn.readInt()

    if (isPrime(number)) {
      println(s"$number is a prime number.")
    } else {
      println(s"$number is not a prime number.")
    }
  }

  def isPrime(number: Int): Boolean = {
    if (number <= 1) {
      return false
    }

    var i = 2
    var isPrime = true

    do {
      if (number % i == 0) {
        isPrime = false
      }
      i += 1
    } while (i * i <= number && isPrime)

    isPrime
  }
}
