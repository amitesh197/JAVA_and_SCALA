public class Student {
    private String name;

    // Constructor with default "Unknown" name
    public Student() {
        this.name = "Unknown";
    }

    // Constructor with a specified name
    public Student(String name) {
        this.name = name;
    }

    // Getter method to retrieve the student's name
    public String getName() {
        return name;
    }
}
