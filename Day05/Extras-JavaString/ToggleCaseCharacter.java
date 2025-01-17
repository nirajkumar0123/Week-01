import java.util.Scanner;

public class ToggleCaseCharacter {
    
	//Method to toggle characters
    public static String toggleCase(String str) {
        String toggledStr = "";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch >= 'A' && ch <= 'Z') {
                // If character is uppercase, convert it to lowercase
                toggledStr += (char)(ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                toggledStr += (char)(ch - 32);
            } else {
                toggledStr += ch;
            }
        }
        
        return toggledStr;
    }

    public static void main(String[] args) {
        //scanner object 
	    Scanner input = new Scanner(System.in);
        
		System.out.println("Enter the string : ");
        String str = input.nextLine();

        String result = toggleCase(str);
        System.out.println("Original String is : " + str + " Toggled String is : " +result);
    }
}
