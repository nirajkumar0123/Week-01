import java.util.Scanner;
public class Calculator{
	public static void main(String [] args){
		double number1 , number2 ,addition, subtraction , multiplication ,division;
		Scanner input = new Scanner(System.in);
		number1 = input.nextDouble();
		number2 = input.nextDouble();
		addition = number1 + number2 ;
		subtraction = number1 - number2 ;
		multiplication = number1 * number2 ;
		division = number1 / number2 ;
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+addition +" "+subtraction+" "+multiplication+" and "+ division);
		input.close();
		
	}
}
