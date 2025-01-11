import java.util.Scanner;

public class YoungTallFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];
		
        // Taking input for age and height for each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            age[i] = sc.nextInt();
            System.out.print("Enter height of " + friends[i] + " (in cm): ");
            height[i] = sc.nextDouble();
		}
		
        // Finding the youngest and tallest using array indexing
        int youngestIndex = 0;
        int tallestIndex = 0;
		
        // Loop to find the youngest and tallest
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
			}
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
			}
		}
		
        // Display the youngest and tallest friend
        System.out.println("\nThe youngest friend is: " + friends[youngestIndex]);
        System.out.println("The tallest friend is: " + friends[tallestIndex]);
	}
}
