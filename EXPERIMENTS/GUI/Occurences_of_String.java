import javax.swing.*;
class StringSearcher{
public static void main(String[] args) {
// Prompt user for input string
String input = JOptionPane.showInputDialog("Enter the input 
string:");
// Prompt user for search string
String search = JOptionPane.showInputDialog("Enter the search 
string:");
// Count the number of occurrences of the search string in the 
input string
int count = 0;
int index = 0;
while ((index = input.indexOf(search, index)) != -1) {
count++;
index += search.length();
}
// Display the number of occurrences
JOptionPane.showMessageDialog(null, "Number of occurrences: " + 
count);
// Prompt user for the new string
String replacement = JOptionPane.showInputDialog("Enter the new 
string:");
// Replace all occurrences of the search string with the new string
String output = input.replaceAll(search, replacement);
JOptionPane.showMessageDialog(null, "Resulting string: " + output);
}
}
