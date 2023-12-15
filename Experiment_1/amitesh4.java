import java.util.Scanner;
public class amitesh4 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age 1: ");
        int age1 = sc.nextInt();
        System.out.print("Enter the age 2: ");
        int age2 = sc.nextInt();
        System.out.print("Enter the age 3: ");
        int age3 = sc.nextInt();
        int oldest = Math.max(age1, Math.max(age2, age3));
        int youngest = Math.min(age1, Math.min(age2, age3));
        System.out.println("The oldest person is " + oldest + " years old.");
        System.out.println("The youngest person is " + youngest + " years old.");
    }
}
