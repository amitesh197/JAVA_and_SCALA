interface Sports {
    int score();
}

class Student {
    int rollno;

    public Student(int rollno) {
        this.rollno = rollno;
    }
}

class Test extends Student {
    int sem1_marks;
    int sem2_marks;

    public Test(int rollno, int sem1_marks, int sem2_marks) {
        super(rollno);
        this.sem1_marks = sem1_marks;
        this.sem2_marks = sem2_marks;
    }
}

class Result extends Test implements Sports {
    int sportsScore;

    public Result(int rollno, int sem1_marks, int sem2_marks, int sportsScore) {
        super(rollno, sem1_marks, sem2_marks);
        this.sportsScore = sportsScore;
    }

    public int total() {
       
        return sem1_marks + sem2_marks + score();
    }

    @Override
    public int score() {
      
        return sportsScore;
    }
}

public class Sports_Interface {
    public static void main(String[] args) {
        int studentRollno = 123;
        int sem1Marks = 85;
        int sem2Marks = 92;
        int sportsScore = 10;

        Result resultInstance = new Result(studentRollno, sem1Marks, sem2Marks, sportsScore);

        int totalMarks = resultInstance.total();
        System.out.println("Roll No: " + resultInstance.rollno);
        System.out.println("Semester 1 Marks: " + resultInstance.sem1_marks);
        System.out.println("Semester 2 Marks: " + resultInstance.sem2_marks);
        System.out.println("Sports Score: " + resultInstance.score());
        System.out.println("Total Marks: " + totalMarks);


        
    }
}
