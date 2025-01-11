import java.util.Scanner;

public class LargestAndSecondLargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a number: ");
        long number = sc.nextLong(); // Using long to handle large numbers
		
        int maxDigit = 10; // Initial size of the digits array
        int[] digits = new int[maxDigit];
        int index = 0; // To keep track of the current index
		
        // Extract digits and store them in the array
        while (number != 0) {
            if (index == maxDigit) {
                // Increase the size of the digits array by 10
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp; // Reassign digits to the new, larger array
			}
			
            digits[index] = (int) (number % 10); // Extract last digit
            number /= 10; // Remove the last digit
            index++;
		}
		
        int largest = -1;
        int secondLargest = -1;
		
        // Find the largest and second-largest digits
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
		
        sc.close();
	}
}
