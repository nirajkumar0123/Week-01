import java.util.Scanner;

public class CompareTwoStrings {
    
    public static String compareStrings(String str1, String str2) {
        // Get the length of the shorter string
        int minLength = Math.min(str1.length(), str2.length());
        
        // Compare the strings character by character
        for (int i = 0; i < minLength; i++) {
            int diff = str1.charAt(i) - str2.charAt(i);

            if (diff < 0) {
                return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order";
				} else if (diff > 0) {
                return "\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order";
			}
		}
        
        // If the loop completes, strings are identical up to the length of the shorter string
        // Now check the lengths
        if (str1.length() < str2.length()) {
            return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order";
			} else if (str1.length() > str2.length()) {
            return "\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order";
			} else {
            return "\"" + str1 + "\" and \"" + str2 + "\" are identical";
		}
	}
	
    public static void main(String[] args) {
        //scanner object  
	    Scanner input = new Scanner(System.in);
        
        System.out.println("Enter string str1 :");
        String str1 = input.nextLine();
        System.out.println("Enter string str2 :");
        String str2 = input.nextLine();
        
        String result = compareStrings(str1, str2);
        System.out.println(result);
	}
}
