import java.util.*;

public class amitesh6 
    
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);   
        int quant, cost=100;
        double total_cost=0;
        System.out.println("enter the quantity: ");
        quant = sc.nextInt();
        total_cost = cost * quant;
        if(total_cost > 1000){
            total_cost = total_cost * 0.9;
        }
        System.out.println("Total cost is: " + total_cost);
}}
