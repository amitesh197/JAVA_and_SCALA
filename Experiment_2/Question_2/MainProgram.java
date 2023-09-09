import java.util.Scanner;

import letmecalculate.Calculator;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();

        int result = 0;
        String operation = "";

        switch (choice) {
            case 1:
                result = Calculator.addition(num1, num2);
                operation = "Addition";
                break;
            case 2:
                result = Calculator.subtraction(num1, num2);
                operation = "Subtraction";
                break;
            case 3:
                result = Calculator.multiplication(num1, num2);
                operation = "Multiplication";
                break;
            case 4:
                double quotient = Calculator.division(num1, num2);
                if (Double.isNaN(quotient)) {
                    System.out.println("Division by zero is not allowed.");
                    return;
                }
                System.out.println("Division");
                System.out.println("Quotient: " + quotient);
                return;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println(operation);
        System.out.println("Result: " + result);
    }
}
