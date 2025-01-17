import java.util.Scanner;

public class GenStringIndexOutOfBoundsException{
	
	public static void generateException(String ans){
		System.out.println("Character at position 100: " + ans.charAt(50));
	}
	
	public static void handleException(String ans){
		try {
			// Attempting to access a character beyond the string length
            System.out.println("Character at position 100: " + ans.charAt(100));
			} catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught!");
            System.out.println("Error: Tried to access an index beyond the string length.");
		}
	}
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
		
        // Generate the exception
        System.out.println("\nCalling the method to generate StringIndexOutOfBoundsException...");
        try {
            generateException(input);
			} catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
		}
		
        System.out.println();
		
        // Handle the exception
        System.out.println("Calling the method to handle StringIndexOutOfBoundsException...");
        handleException(input);
		
        scanner.close();
		
	}
}