import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        // Take input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
		}
		
        // Initializing variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
		
        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    // Resize the factors array if it runs out of space
                    maxFactor *= 2; // Double the size of the array
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length); // Copy existing factors to temp
                    factors = temp; // Assign resized array
				}
                factors[index++] = i; // Store factor in array
			}
		}
		
        // Display the factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
		}
	}
}
