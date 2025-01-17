import java.util.Scanner;

public class CountConstAndVowel{

   // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
	
	  // Method to count vowels
    public static int[] countVowelsAndCons(String str) {
        int vowelCount = 0, consCount = 0;
        str = str.toLowerCase(); // Convert to lowercase
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                vowelCount++;
            }
            else if(ch >= 'a' && ch <= 'z'){
                consCount++;
            }
        }
        return new int[] {vowelCount, consCount};
    }
	
	
public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int[] count = countVowelsAndCons(str);

        // Print the results
        System.out.println("Number of vowels: " + count[0]);
        System.out.println("Number of consonants: " + count[1]);

        input.close();
}
}