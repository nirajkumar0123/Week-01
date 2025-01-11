import java.util.Scanner;
public class SICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal = scanner.nextDouble();
        double rate = scanner.nextDouble();
        double time = scanner.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is " + simpleInterest + 
			" for Principal " + principal + 
			", Rate of Interest " + rate + 
		" and Time " + time);
	}
}
