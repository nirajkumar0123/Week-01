import java.util.Scanner;

public class TrimStringSpaces {
	
    // Method to trim leading and trailing spaces using charAt() method
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;
		
        // Loop to find the first non-space character (leading spaces)
        while (start <= end && str.charAt(start) == ' ') {
            start++;
		}
		
        // Loop to find the last non-space character (trailing spaces)
        while (end >= start && str.charAt(end) == ' ') {
            end--;
		}
		
        // Return the start and end indices of the substring with no spaces
        return new int[] { start, end };
	}
	
    // Method to create a substring using charAt() method
    public static String createSubstring(String str, int start, int end) {
        String result = "";
		
        // Loop through the string and concatenate characters to the result
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);  // Concatenate each character to the result
		}
		
        return result;
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
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
		
        int[] indices = trimSpaces(inputString);
        String trimmedStringCustom = createSubstring(inputString, indices[0], indices[1]);
		
        String trimmedStringBuiltIn = inputString.trim();
		
        boolean isEqual = compareStrings(trimmedStringCustom, trimmedStringBuiltIn);
		
        System.out.println("Trimmed string (custom): '" + trimmedStringCustom + "'");
        System.out.println("Trimmed string (built-in): '" + trimmedStringBuiltIn + "'");
        System.out.println("Are both trimmed strings equal? " + isEqual);
		
        sc.close();
	}
}
