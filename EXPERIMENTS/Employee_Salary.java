import java.util.Scanner;

class Employee_Salary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee name: ");
        String empName = sc.nextLine();
        System.out.println("Enter the employee no: ");
        int empNo = sc.nextInt();
        System.out.println("Enter the Basic: ");
        int empBasic = sc.nextInt();

        double DA = 0.7* empBasic;
        System.out.println("The DA is "+DA);

        double HRA = 0.3* empBasic;
        System.out.println("The DA is "+HRA);

        double PF = 0.1* empBasic;
        System.out.println("PF is: "+PF);
    }
}
