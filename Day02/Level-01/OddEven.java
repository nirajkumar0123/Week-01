import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
		number = sc.nextInt();
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
					} else {
                    System.out.println(i + " is odd");
				}
			}
			} else {
            System.out.println("Please enter a valid Number.");
		}
	}
}