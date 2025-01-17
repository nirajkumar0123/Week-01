import java.util.Scanner;

public class GenArrayIndexOutOfBoundsException {

    // Method to generate the ArrayIndexOutOfBoundsException
    public static void generateException(String[] names, int index) {
        // Attempting to access an index outside the array's bounds
		
        System.out.println("Attempting to access the name at index " + index + ":");
        System.out.println(names[index]);  // This will generate an ArrayIndexOutOfBoundsException if index is invalid
    }

    // Method to handle the ArrayIndexOutOfBoundsException
    public static void handleException(String[] names, int index) {
        try {
            // Attempting to access the index safely
            System.out.println("Attempting to access the name at index " + index + ":");
            System.out.println(names[index]);  // This will generate an ArrayIndexOutOfBoundsException
			
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catching and handling the ArrayIndexOutOfBoundsException
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[size];
        
        System.out.println("Enter the names:");
        for (int i = 0; i < size; i++) {
            names[i] = scanner.nextLine();
        }

        System.out.print("Enter an index to access: ");
        int index = scanner.nextInt();

        // Generating the exception (this will throw an exception if index is out of bounds)
        try {
            generateException(names, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException in generateException: " + e.getMessage());
        }

        // Handling the exception
        System.out.println("\nHandling the exception...");
        handleException(names, index);
		
        scanner.close();
    }
}
