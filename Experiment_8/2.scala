object NumberToWords {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val number = scala.io.StdIn.readInt()

    val words = numberToWords(number)
    println(s"$number in words: $words")
  }

  def numberToWords(number: Int): String = {
    val digitWords = Array("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

    var num = number
    var result = ""

    while (num > 0) {
      val digit = num % 10
      result = digitWords(digit) + " " + result
      num = num / 10
    }

    object NumberToWords {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val number = scala.io.StdIn.readInt()

    val words = numberToWords(number)
    println(s"$number in words: $words")
  }

  def numberToWords(number: Int): String = {
    val digitWords = Array("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

    var num = number
    var result = ""

    while (num > 0) {
      val digit = num % 10
      result = digitWords(digit) + " " + result
      num = num / 10
    }

    result.trim 
  }
}

  }
}
