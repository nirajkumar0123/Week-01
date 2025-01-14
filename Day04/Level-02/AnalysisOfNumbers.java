import java.util.Scanner;

public class AnalysisOfNumbers {
	
    public static boolean isPositive(int number) {
        return number >= 0;
	}
	
	public static boolean isNegative(int number) {
        return number < 0;
	}
	
    public static boolean isEven(int number) {
        return number % 2 == 0;
	}
    
	public static boolean isOdd(int number) {
        return number % 2 != 0;
	}
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
			} else if (number1 == number2) {
            return 0;
			} else {
            return -1;
		}
	}
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
		
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
			
			if(isPositive(numbers[i])){
				if(isEven(numbers[i])){
					System.out.println("Number is positive and even");
				}
				else{
					System.out.println("Number is positive and odd");
				}
			}
			else{
				System.out.println("Number is negative");
			}
		}
        
        System.out.println("\nAnalysis of numbers:");
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.print("Number " + numbers[i] + " is Positive and ");
                if (isEven(numbers[i])) {
                    System.out.println("Even.");
					} else {
                    System.out.println("Odd.");
				}
				} else {
                System.out.println("Number " + numbers[i] + " is Negative.");
			}
		}
		
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
			} else if (comparisonResult == 0) {
            System.out.println("The first and last numbers are equal.");
			} else {
            System.out.println("The first number is less than the last number.");
		}
		
        scanner.close();
	}
}
