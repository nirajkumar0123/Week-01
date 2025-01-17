import java.util.Scanner;

public class RemoveCharFromString {
	
    //Method to remove character from string
    public static String removeCharacter(String str, char charToRemove) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != charToRemove) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        //scanner object 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = input.nextLine();

        System.out.println("Enter char to remove : ");
        char charToRemove = input.next().charAt(0);

        String result = removeCharacter(str, charToRemove);
        System.out.println("Modified String: " + result);
    }
}
