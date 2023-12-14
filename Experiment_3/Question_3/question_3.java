import java.util.Scanner;

public class  question_3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of tests: ");
        int T = sc.nextInt(); 

        while (T-- > 0) {
            System.out.println("Enter the length of the array: ");
            int N = sc.nextInt(); 
            int[] arr = new int[N];
            long[] result = new long[N]; 

            System.out.println("Enter the array: ");
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            long totalSum = 0;
            for (int i = 0; i < N; i++) {
                totalSum += arr[i];
            }

            for (int i = 0; i < N; i++) {
                result[i] = totalSum - arr[i];
            }

            for (int i = 0; i < N; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
