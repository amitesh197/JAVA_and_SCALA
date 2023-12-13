class Member(var name: String, var age: Int, var phoneNumber: String, var address: String, var salary: Double) {
  def printSalary(): Unit = {
    println(s"$name's salary: $salary")
  }
}

class Employee(name: String, age: Int, phoneNumber: String, address: String, salary: Double, var specialization: String)
  extends Member(name, age, phoneNumber, address, salary)

class Manager(name: String, age: Int, phoneNumber: String, address: String, salary: Double, var department: String)
  extends Member(name, age, phoneNumber, address, salary)

object Main {
  def main(args: Array[String]): Unit = {
    // Creating an Employee object
    val employee = new Employee("John Doe", 30, "123-456-7890", "123 Main St", 50000.0, "Software Engineering")

    // Creating a Manager object
    val manager = new Manager("Jane Smith", 35, "987-654-3210", "456 Oak St", 70000.0, "Human Resources")

    // Printing details
    println("Employee Details:")
    println(s"Name: ${employee.name}")
    println(s"Age: ${employee.age}")
    println(s"Phone Number: ${employee.phoneNumber}")
    println(s"Address: ${employee.address}")
    employee.printSalary()
    println(s"Specialization: ${employee.specialization}")

    println("\nManager Details:")
    println(s"Name: ${manager.name}")
    println(s"Age: ${manager.age}")
    println(s"Phone Number: ${manager.phoneNumber}")
    println(s"Address: ${manager.address}")
    manager.printSalary()
    println(s"Department: ${manager.department}")
  }
}
