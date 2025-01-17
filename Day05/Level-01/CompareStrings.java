import java.util.Scanner;

public class CompareStrings {

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
	
        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.next();

        System.out.print("Enter the second string: ");
        String str2 = scanner.next();

        // Comparing strings using charAt() method
        boolean charAtComparisonResult = compareUsingCharAt(str1, str2);

        // Comparing strings using the built-in equals() method
        boolean equalsMethodResult = str1.equals(str2);

        // Checking if both methods produce the same result
        if (charAtComparisonResult == equalsMethodResult) {
            System.out.println("Both methods produce the same result!");
        } else {
            System.out.println("The results of the two methods are different.");
        }

        scanner.close();
    }
}

