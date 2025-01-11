import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double first = input.nextDouble();
        double second = input.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        String op = input.next();
        switch (op) {
            case "+":
			System.out.println("Addition: " + (first + second));
			break;
            case "-":
			System.out.println("Subtraction: " + (first - second));
			break;
            case "*":
			System.out.println("Multiplication: " + (first * second));
			break;
            case "/":
			if (second != 0) {
				System.out.println("Division: " + (first / second));
                } else {
				System.out.println("Division by zero is not allowed.");
			}
			break;
            default:
			System.out.println("Invalid Operator");
			break;
		}
		input.close();
	}
}
