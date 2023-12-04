import java.util.*;
import MyErrorClasses.MyErrorClass;
public class Q3
{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int seatno, center_number, sem1, sem2, sem3; 
        String date = new String();
        String name = new String();
        System.out.println("Enter the Name: ");
        name = scanner.nextLine();
        System.out.println("Enter the seat number: ");
        seatno = scanner.nextInt();
        System.out.println("Enter the Date: ");
        date = scanner.nextLine();
        System.out.println("Enter the center number: ");
        center_number = scanner.nextInt();
        System.out.println("Enter the sem1 marks: ");
        sem1 = scanner.nextInt();
        System.out.println("Enter the sem2 marks: ");
        sem2 = scanner.nextInt();
        System.out.println("Enter the sem3 marks: ");
        sem3 = scanner.nextInt();

        try{
            if(sem1>100 || sem1<0 || sem2>100 || sem2<0 || sem3>100 || sem3<0){
                throw new MyErrorClass("Error: marks out of bound!");
            }
        }
        catch(MyErrorClass exp){
            System.out.println("INVALID MARKS!");
        }



    };
};

