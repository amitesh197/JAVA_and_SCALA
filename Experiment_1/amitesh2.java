import java.util.*;

public class amitesh2{

     public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Factorial");
        int n, i, fact=1;
        System.out.println("Enter number: ");
        n = obj.nextInt();
        for(i=1; i<=n; i++){
            fact*=i;
        }
        System.out.println("The factorial is: " + fact);
    

    System.out.println("armstrong");
    int n1, digit, sum=0, temp;
    System.out.println("enter number: ");
    n1 = obj.nextInt();
    temp=n1;
    while(n1>0){
        digit=n1%10;
        sum+=(digit*digit*digit);
        n1=n1/10;

    }
    if(sum == temp){
        System.out.println("its armstrong number");
    }
    else{
        System.out.println("not an armstrong number");
    }

    System.out.println("palindrome program");
    int n2, rev=0, copy;
    System.out.println("nter number: ");
    n2 = obj.nextInt();
    copy=n2;
    while(n2>0){
        int remainder = n2 %10;
        rev = rev*10 + remainder;
        n2 = n2/10;
    }
    if(copy == rev){
        System.out.println("its a palindrome");
    }
    else{
        System.out.println("its not a palindrome");
    }

    }
}