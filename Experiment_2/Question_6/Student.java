public class Student {
    // Instance variables
    private String name;
    private int roll_no;

    // Constructor to initialize the instance variables
    public Student() {
        this.name = "John";
        this.roll_no = 2;
    }

    // Getter method for the name
    public String getName() {
        return name;
    }

    // Getter method for the roll_no
    public int getRollNo() {
        return roll_no;
    }

    public static void main(String[] args) {
        // Create an object of the Student class
        Student student = new Student();

        // Access and print the name and roll_no
        System.out.println("Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
    }
}
