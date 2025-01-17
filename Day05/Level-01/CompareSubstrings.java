import java.util.Scanner;

public class CompareSubstrings{

    // Method to create a substring using charAt()
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        String substring = "";
        for (int i = start; i < end; i++) {
            substring += str.charAt(i);
        }
        return substring;
    }
	
  // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
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
	
public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();
		
		// Creating substring using charAt()
        String substringUsingCharAt = createSubstringUsingCharAt(str, start, end);

        // Creating substring using built-in substring() method
        String substringUsingBuiltIn = str.substring(start, end);

        // Comparing the two substrings
        boolean comparisonResult = compareUsingCharAt(substringUsingCharAt, substringUsingBuiltIn);
		
	    if (comparisonResult) {
    System.out.println("Comparison Result: Both substrings are identical!");
} else {
    System.out.println("Comparison Result: The substrings are different.");
}


}
}