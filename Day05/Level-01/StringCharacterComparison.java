import java.util.Scanner;

public class StringCharacterComparison{
	
	public static char[] getCharacters(String str){
		char[] ch = new char[str.length()];
		for(int i = 0; i < str.length(); i++){
			ch[i] = str.charAt(i);
		}
		return ch;
	}
	
	  // Method to compare two character arrays
    public static boolean compareArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Call the user-defined method to get characters
        char[] userDefinedArray = getCharacters(input);

        // Use the built-in toCharArray() method
        char[] builtInArray = input.toCharArray();

        // Compare the two arrays
        boolean areIdentical = compareArrays(userDefinedArray, builtInArray);
		
		 // Display the results
        System.out.println("Characters from user-defined method: ");
        for (char c : userDefinedArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Characters from built-in method: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }
        System.out.println();
		
		if (areIdentical) {
            System.out.println("The results from both methods are identical.");
        } else {
            System.out.println("The results from both methods are different.");
        }

        scanner.close();
	}
}