import java.util.Scanner;

public class ConvertUpperLower {
	
    // Method to convert text to uppercase using charAt()
    public static String convertToUpperCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
			    result += (char)(ch-32);
				} else {
                result += ch;
			}
		}
        return result;
	}
	
    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
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
		
        String input = scanner.nextLine();
		
        // Convert using user-defined method
        String userDefinedUpper = convertToUpperCase(input);
		
        // Convert using built-in toUpperCase()
        String builtInUpper = input.toUpperCase();
		
        // Compare the results
        boolean isIdentical = compareStrings(userDefinedUpper, builtInUpper);
		
        // Display the results
        System.out.println("Converted using user-defined method: " + userDefinedUpper);
        System.out.println("Converted using built-in method: " + builtInUpper);
		
        if (isIdentical) {
            System.out.println("Both methods produced identical results!");
			} else {
            System.out.println("Results differ between the two methods!");
		}
		
        scanner.close();
	}
}
