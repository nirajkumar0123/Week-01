import java.util.Scanner;

public class LargestAndSecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        // Taking user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
        // Array to store digits
        int maxDigit = 10; // Maximum digits allowed
        int[] digits = new int[maxDigit];
        int index = 0;
		
        // Extract digits from the number
        while (number != 0) {
            if (index == maxDigit) {
                System.out.println("Number has more than " + maxDigit + " digits. Stopping further digit extraction.");
                break;
			}
            digits[index++] = number % 10; // Add the last digit to the array
            number /= 10; // Remove the last digit
		}
		
        if (index == 0) {
            System.out.println("No digits found in the input.");
            return;
		}
		
        // Finding the largest and second largest digits
        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
				} else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
			}
		}
		
        System.out.println();
        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
			System.out.println("Second largest digit: " + secondLargest);
			} else {
			System.out.println("Second largest digit: None");
		}
		
	}
}
