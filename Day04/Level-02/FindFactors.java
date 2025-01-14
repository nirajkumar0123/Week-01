import java.util.Scanner;

public class FindFactors {

    // Method to find the factors of a number and store them in an array
    public static int[] findFactors(int number) {
        int count = 0;
        
        // First loop to count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize the array with the count of factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of the square of the factors
    public static double sumOfSquaresOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Get the factors of the number
        int[] factors = findFactors(number);

        // Display the factors
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Calculate and display the sum of the factors
        int sum = sumOfFactors(factors);
        System.out.println("Sum of the factors: " + sum);

        // Calculate and display the product of the factors
        int product = productOfFactors(factors);
        System.out.println("Product of the factors: " + product);

        // Calculate and display the sum of squares of the factors
        double sumOfSquares = sumOfSquaresOfFactors(factors);
        System.out.println("Sum of squares of the factors: " + sumOfSquares);

        scanner.close();
    }
}
