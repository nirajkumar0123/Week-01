import java.util.Scanner;

public class ArmstrongNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int sum = 0;
		int originalNumber  = number;
		
		while(number != 0){
			int rem = number % 10;
			sum += Math.pow(rem, 3);
			number = number/10;
		}
		if(sum == originalNumber){
			System.out.println("Number is Armstrong number");
		}
		else{
			System.out.println("Number is not Armstrong number");
		}
		input.close();
	}
}