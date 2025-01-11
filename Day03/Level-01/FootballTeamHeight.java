import java.util.Scanner;

public class FootballTeamHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;
        
        // Taking user input for the heights of 11 players
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i]; // Add the entered height to the sum
        }
        
        // Calculate the mean height
        double meanHeight = sum / heights.length;
        
        // Print the mean height
        System.out.println("The mean height of the football team is: " + meanHeight);
    }
}
