import java.util.*;

class question_1 
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number=0;
        
        System.out.print("Enter a 4 digit number: ");
        number = sc.nextInt();

        int arr[] = new int[4];

        int n = number;

        int length = arr.length - 1;

        for(int i=0; i<4; i++){
            arr[length - i] = n%10;
            n = n/10;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        int combos[] = new int[6];

        System.out.println("the first combos are: ");
        int index = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int c = arr[i]*10 + arr[j];
                if(c!=0){
                    
                    combos[index] = c;
                    System.out.println(c);
                    index++;
                }
            }
        }

        System.out.println("combos: ");

        for(int i=0; i<6; i++){
            System.out.println(combos[i]);
        }

        System.out.println("hi");
        
        int arr2[] = new int[4];

        for(int j=0; j<4; j++){
            arr2[j] = arr[length - j];
        }

        System.out.println("the new array is: " );

        for(int k=0; k<arr2.length; k++){
            System.out.println(arr2[k ]);
        }

        System.out.println("the new combos are:" );        

        int combos2[] = new int[6];
        int index2 = 0;

        for(int l=0; l<arr2.length; l++){
            for(int m=l+1; m<arr2.length; m++){
                int c = arr2[l]*10 + arr2[m];
                if(c!=0){
                    
                    combos2[index2] = c;
                    System.out.println(c);
                    index2++;
                }
            }
        }
        
       System.out.println("combos2: ");
 
        for(int p=0; p<6; p++){
            System.out.println(combos2[p]);
        }
    
        int newcombo[] = new int[12];

        for(int i=0; i<combos.length; i++){
            newcombo[i] = combos[i];
        }
        for(int i=6; i<newcombo.length; i++){
            newcombo[i] = combos2[i-6];
        }

        for(int i=0; i<newcombo.length; i++){
            System.out.println("the main combo is: " + newcombo[i]);
        }

        for(int i=0; i<newcombo.length; i++){
            for(int j=i+1; j<newcombo.length; j++){
                if(newcombo[i]*newcombo[j] == number){
                    System.out.println("The number is a vampire number!");
                }
            }
        }
    
}}
