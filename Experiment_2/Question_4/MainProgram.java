public class MainProgram 
{
    public static void main(String[] args) {
        // Create a student with the default name "Unknown"
        Student student1 = new Student();
        System.out.println("Student 1 name: " + student1.getName());

        // Create a student with a specified name
        Student student2 = new Student("Alice");
        System.out.println("Student 2 name: " + student2.getName());

        // Create another student with no name (defaults to "Unknown")
        Student student3 = new Student();
        System.out.println("Student 3 name: " + student3.getName());
    }
}
