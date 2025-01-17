import java.util.Scanner;

public class GenNumberFormatExceptionExample {

    // Method to generate the NumberFormatException
    public static void generateException(String input) {
        // Attempting to parse the input into an integer (this will throw NumberFormatException if input is not a valid number)
        System.out.println("Attempting to parse the input: " + input);
		
        int number = Integer.parseInt(input); // This will generate a NumberFormatException if input is not a valid number
        System.out.println("Parsed number: " + number);
    }

    // Method to handle the NumberFormatException
    public static void handleException(String input) {
        try {
            System.out.println("Attempting to parse the input: " + input);
            int number = Integer.parseInt(input); // This will generate a NumberFormatException
            System.out.println("Parsed number: " + number);
			
        } catch (NumberFormatException e) {
            // Catching and handling the NumberFormatException specifically
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to parse to an integer: ");
        String input = scanner.nextLine(); 

        // Generating the exception (this will throw an exception if the input is not a valid integer)
        try {
            generateException(input);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException in generateException: " + e.getMessage());
        }

        // Handling the exception
        System.out.println("\nHandling the exception...");
        handleException(input);

        scanner.close();
    }
}
