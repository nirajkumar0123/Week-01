import java.util.Scanner;

public class StoreTheNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] numbers = new double[10];  // Array to store up to 10 numbers
        double total = 0.0;  // Variable to store the sum of numbers
        int index = 0;  // Index for the array
        
        // Infinite loop to take user input until a condition is met
        while (true) {
            System.out.print("Enter a number: ");
            double number = input.nextDouble();
            
            // Check if the number is 0 or negative, or if the array is full
            if (number <= 0 || index == 10) {
                break;
			}
            
            // Store the number in the array and increment the index
            numbers[index] = number;
            index++;
		}
        
        // all entered numbers and calculate the total
        System.out.println("Entered numbers are:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
		}
        
        // total sum of the numbers
        System.out.println("\nSum of all entered numbers: " + total);
        
        input.close();
	}
}
