import java.util.Scanner;

public class SumNaturalNumbers {
	
    // Method to calculate the sum of n natural numbers using recursion
    public static int sumRecursive(int n) {
        if (n == 0) {
            return 0;
			} else {
            return n + sumRecursive(n - 1);
		}
	}
	
    // Method to calculate the sum of n natural numbers using the formula
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
	}
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
		
        // Check if the number is a natural number (positive integer)
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;  // Exit the program if the input is invalid
		}
		
        // Calculate sum using recursion
        int recursiveSum = sumRecursive(n);
        
        // Calculate sum using the formula
        int formulaSum = sumFormula(n);
		
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the correct result! and final output is: " + formulaSum);
			} else {
            System.out.println("There seems to be an error in the computation.");
		}
		
        scanner.close();
	}
}
