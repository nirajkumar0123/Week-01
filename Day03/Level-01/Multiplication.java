import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
        int[] multiplicationResult = new int[4]; 
		
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;  // Store the result in the array
		}
		
        // Display the multiplication table results
		for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
		}
	}
}