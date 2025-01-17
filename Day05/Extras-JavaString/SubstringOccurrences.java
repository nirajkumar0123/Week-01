import java.util.Scanner;

public class SubstringOccurrences {

    // Method to count occurrences of a substring in a string
    public static int countSubstringOccurrences(String str, String substring) {
        int count = 0;

        for(int i = 0; i <= str.length() - substring.length(); i++){
            boolean isMatch = true;
            for(int j = 0; j < substring.length(); j++){
                if(str.charAt(i+j) != substring.charAt(j)){
                    isMatch = false;
                    break;
                }
            }
            if(isMatch){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //scanner object 
	    Scanner input = new Scanner(System.in);

        System.out.println("Enter your string :");
        String str = input.nextLine();

        System.out.println("Enter your substring :");
        String substring = input.nextLine();

        int occurrences = countSubstringOccurrences(str, substring);
        System.out.println("The substring \"" + substring + "\" occurs " + occurrences + " times.");
    }
}
