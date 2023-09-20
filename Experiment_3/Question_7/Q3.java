public class Q3 {
  public static void main(String[] args) {
    String string = "This is a Java and Scala Laboratory!!";

    int upperCaseCount = 0;
    int lowerCaseCount = 0;
    int blankSpaceCount = 0;
    int digitCount = 0;
    int specialCharacterCount = 0;

    for (int i = 0; i < string.length(); i++) {
      char charAt = string.charAt(i);

      if (Character.isUpperCase(charAt)) {
        upperCaseCount++;
      } else if (Character.isLowerCase(charAt)) {
        lowerCaseCount++;
      } else if (Character.isWhitespace(charAt)) {
        blankSpaceCount++;
      } else if (Character.isDigit(charAt)) {
        digitCount++;
      } else {
        specialCharacterCount++;
      }
    }

    System.out.println("Uppercase characters: " + upperCaseCount);
    System.out.println("Lowercase characters: " + lowerCaseCount);
    System.out.println("Blank spaces: " + blankSpaceCount);
    System.out.println("Digits: " + digitCount);
    System.out.println("Special characters: " + specialCharacterCount);
  }
}
