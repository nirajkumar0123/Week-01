import java.util.Scanner;

public class GenNullPointerException{
	
	public static void generateException(){
		String text = null;
		System.out.println("The length of the string is: " + text.length());
	}
	
	public static void handleException() {
        String text = null;
        try {
            // Attempt to call a method on null
            System.out.println("The length of the string is: " + text.length());
			} catch (NullPointerException e) {
            System.out.println("NullPointerException caught! The variable 'text' is null.");
		}
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        
        // Generating the exception
        System.out.println("Calling the method to generate NullPointerException...");
        try {
            generateException();
			} catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
		}
        
        System.out.println();
		
		// Handling the exception
        System.out.println("Calling the method to handle NullPointerException...");
        handleException();
        
        scanner.close();
	}
}