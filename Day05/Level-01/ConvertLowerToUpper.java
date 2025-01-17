import java.util.Scanner;

public class ConvertLowerToUpper {
	
    // Method to convert text to lowercase using charAt()
    public static String convertToLowerCase(String text) {
        String str = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
				str += (char)(ch + 32);
				} else {
                str += ch;
			}
		}
        return str;
	}
	
	
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
		
        System.out.print("Enter the text: ");
        String input = scanner.nextLine();
		
        // Convert using user-defined method
        String userDefinedLower = convertToLowerCase(input);
		
        // Convert using built-in toLowerCase()
        String builtInLower = input.toLowerCase();
		
        // Compare the results
        boolean isIdentical = compareStrings(userDefinedLower, builtInLower);
		
        // Display the results
        System.out.println("Converted using user-defined method: " + userDefinedLower);
        System.out.println("Converted using built-in method: " + builtInLower);
        if (isIdentical) {
			System.out.println("Comparison Result: Both methods produced identical results!");
			} else {
			System.out.println("Comparison Result: Results differ between the two methods.");
		}
        scanner.close();
	}
}
