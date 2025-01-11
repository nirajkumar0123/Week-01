import java.util.Scanner;

public class HarshadNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int sum = 0;
		int originalNumber = number;
		
		while(number != 0){
			int digit = number % 10;
			sum += digit;
			number = number/10;
		}
		
		if(originalNumber % sum == 0){
			System.out.println("Number is HarshadNumber.");
		}
		else{
			System.out.println("Number is not HarshadNumber.");
		}
		input.close();
	}
}