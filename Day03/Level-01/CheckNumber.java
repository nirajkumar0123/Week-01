import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] numbers = new int[5];
        
        // Getting input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        
        // Checking each number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                // If the number is positive, check if it's even or odd
                if (numbers[i] % 2 == 0) {
                    System.out.println("Number " + numbers[i] + " is positive and even.");
                } else {
                    System.out.println("Number " + numbers[i] + " is positive and odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println("Number " + numbers[i] + " is negative.");
            } else {
                System.out.println("Number " + numbers[i] + " is zero.");
            }
        }
        
        // Comparing the first and last elements of the array
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("The first and last numbers are equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("The first number is greater than the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }
        
        input.close();
    }
}
