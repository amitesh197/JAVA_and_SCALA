class Student(private val name: String = "Unknown") {
  def printName(): Unit = {
    println(s"Student Name: $name")
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    // Creating a Student object with no name specified
    val student1 = new Student()

    // Creating a Student object with a specific name
    val student2 = new Student("John Doe")

    // Printing names
    student1.printName()
    student2.printName()
  }
}
