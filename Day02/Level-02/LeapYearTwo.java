import java.util.Scanner;

public class LeapYearTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter a year: ");
        int year = input.nextInt();
		
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
			} else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year.");
			} else {
            System.out.println("Year must be greater than or equal to 1582.");
		}
		input.close();
	}
}
