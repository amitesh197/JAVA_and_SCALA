object RightTriangle {
  def main(args: Array[String]): Unit = {
    val rows = 5
    for (i <- 1 to rows) {
      for (j <- 1 to i) {
        print("* ")
      }
      println()
    }
  }
}
