import java.util.Scanner;

public class VowelConsonantsTwo {
	
    // Method to check if the character is a vowel or consonant
    public static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
		}
		
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
				} else {
                return "Consonant";
			}
		}
        return "Not a Letter";
	}
	
    // Method to find vowels and consonants in a string and return a 2D array of character and type
    public static String[][] findCharTypes(String str) {
        String[][] result = new String[str.length()][2];
		
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String type = checkChar(ch);
			
            result[i][0] = String.valueOf(ch); 
            result[i][1] = type;              
		}
		
        return result;
	}
	
    // Method to display the 2D array in a tabular format
	public static void displayTable(String[][] array) {
		System.out.println("Character | Type");
		System.out.println("----------------------");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i][0] + "        | " + array[i][1]);
		}
	}
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input String :");
        String inputString = sc.nextLine();
		
        String[][] characterTypes = findCharTypes(inputString);
		
        displayTable(characterTypes);
		
        sc.close();
	}
}
