import java.util.Vector;

public class Q5 {
    public static void main(String[] args) {
       
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(2);
        vector.add(4);
        vector.add(2);
        vector.add(5);

        int elementToFind = 2;

        int frequency = 0;

        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) == elementToFind) {
                frequency++;
            }
        }

        System.out.println("The frequency of " + elementToFind + " is: " + frequency);
    }
}


