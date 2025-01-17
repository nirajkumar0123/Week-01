import java.util.Scanner;

public class RemoveDuplicates {

    public static String removeDuplicates(String str) {
        String result = "";

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isDuplicate = false;
        
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == currentChar) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate == false) {
               result += currentChar;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        //scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str1 = input.nextLine();

        System.out.println("New String after removal of Duplicates : " + removeDuplicates(str1));
        
        input.close();
    }
}
