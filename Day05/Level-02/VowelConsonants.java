import java.util.Scanner;

public class VowelConsonants {
	
    // Method to check if the character is a vowel, consonant, or not a letter
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
	
    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
		
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String result = checkChar(ch);
			
            if (result.equals("Vowel")) {
                vowels++;
				} else if (result.equals("Consonant")) {
                consonants++;
			}
		}
        return new int[] { vowels, consonants };
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        String inputString = sc.nextLine();
		
        int[] result = countVowelsAndConsonants(inputString);
		
		System.out.println("Vowels Count: " + result[0]);
		System.out.println("Consonants Count: " + result[1]);
		
	sc.close();
    }
	}
		