import scala.io.StdIn

class Employee {
  var empid: Int = _
  var empname: String = _
  var designation: String = _
  var salary: Double = _

  def get_employee(): Unit = {
    print("Enter Employee ID: ")
    empid = StdIn.readInt()

    print("Enter Employee Name: ")
    empname = StdIn.readLine()

    print("Enter Designation: ")
    designation = StdIn.readLine()

    print("Enter Salary: ")
    salary = StdIn.readDouble()
  }

  def show_grade(): Unit = {
    val grade =
      if (salary >= 50000) "A"
      else if (salary >= 30000) "B"
      else "C"

    println(s"The grade of employee $empname with salary $salary is: $grade")
  }

  def show_employee(): Unit = {
    println(s"Employee ID: $empid")
    println(s"Employee Name: $empname")
    println(s"Designation: $designation")
    println(s"Salary: $salary")
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val employee = new Employee()

    // Get employee details from the user
    employee.get_employee()

    // Display employee details
    println("\nEmployee Details:")
    employee.show_employee()

    // Display employee grade based on salary
    employee.show_grade()
  }
}
