import java.util.Scanner;

public class SimpleInterest {
	
    // Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
	}
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        // Taking user input for Principal, Rate, and Time
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();
		
        System.out.print("Enter Rate of Interest (in %): ");
        double rate = scanner.nextDouble();
		
        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();
		
        // Calculating Simple Interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
		
        // Displaying the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " 
		+ principal + ", Rate of Interest " + rate + " and Time " + time + " years.");
        
        scanner.close(); // Close the scanner
	}
}
