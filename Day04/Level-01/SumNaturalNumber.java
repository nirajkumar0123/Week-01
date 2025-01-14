import java.util.Scanner;

public class SumNaturalNumber {
	
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
		}
        return sum;
	}
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
		
        if (n > 0) {
            int sum = sumOfNaturalNumbers(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
			} else {
            System.out.println("Please enter a positive integer.");
		}
		
        scanner.close();
	}
}
