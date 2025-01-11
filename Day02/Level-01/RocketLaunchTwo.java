import java.util.Scanner;

public class RocketLaunchTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        if (counter <= 0) {
            System.out.println("Please enter a valid positive number.");
			} else {
            for (int i = counter; i >= 1; i--) {
                System.out.println("Countdown: " + i);
			}
            System.out.println("Launch!");
		}
	}
}