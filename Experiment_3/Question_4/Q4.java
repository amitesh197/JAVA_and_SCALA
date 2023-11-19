import java.util.Scanner;
import java.util.Vector;

public class Q4 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Vector<String> shoppingList = new Vector<>();

        while (true) {
            System.out.println("Shopping List Menu:");
            System.out.println("1. Add item");
            System.out.println("2. Delete item");
            System.out.println("3. Print shopping list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to add: ");
                    String itemToAdd = scanner.nextLine();
                    System.out.print("Enter the index where you want to add the item: ");
                    int indexToAdd = scanner.nextInt();
                    shoppingList.add(indexToAdd, itemToAdd);
                    System.out.println(itemToAdd + " has been added to the shopping list.");
                    break;
                case 2:
                    System.out.print("Enter the index of the item to delete: ");
                    int indexToDelete = scanner.nextInt();
                    if (indexToDelete >= 0 && indexToDelete < shoppingList.size()) {
                        String deletedItem = shoppingList.remove(indexToDelete);
                        System.out.println(deletedItem + " has been removed from the shopping list.");
                    } else {
                        System.out.println("Invalid index. The shopping list does not contain an item at index " + indexToDelete + ".");
                    }
                    break;
                case 3:
                    System.out.println("Shopping List:");
                    for (int i = 0; i < shoppingList.size(); i++) {
                        System.out.println(i + ". " + shoppingList.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
