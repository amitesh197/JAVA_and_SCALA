public class Meta_Strings {
    public static void main(String[] args) {
        String s1 = "geeks";
        System.out.println("First string is: " + s1);
        String s2 = "keegs";
        System.out.println("Second string is: " + s2);

        int z = 0;
        int xor = 0;

        for (int i = 0; i < s1.length(); i++){
             xor ^= s1.charAt(i)^s2.charAt(i);
         
        }

        if(xor == 0) { System.out.println("yes ") ;}
        else{ System.out.println("no");}

     
        if(z>0){
        System.out.print("They are Meta Strings!");
        }
    }
}

