import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        // Step 1: Take user input for a number
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();
		
        // Validate input
        if (number <= 0) {
            System.out.println("Invalid input! Please enter a positive number.");
            return;
		}
		
        // Step 2: Find the count of digits in the number
        int temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
		}
		
        // Step 3: Create an array to store the digits
        int[] digits = new int[count];
		
        // Step 4: Extract digits from the number and store in the array
        int index = 0;
        while (number != 0) {
            digits[index++] = number % 10; // Add the last digit to the array
            number /= 10; // Remove the last digit
		}
		
        // Step 5: Display the elements of the array in reverse order
        System.out.print("Reversed number: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]); // The digits array is already reversed
		}
        System.out.println();
		
        sc.close();
	}
}
