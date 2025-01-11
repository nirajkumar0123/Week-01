import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        if (counter <= 0) {
            System.out.println("Please enter a valid positive number.");
			} else {
            while (counter >= 1) {
                System.out.println("Countdown: " + counter);
                counter--;
			}
            System.out.println("Launch!");
		}
	}
}
