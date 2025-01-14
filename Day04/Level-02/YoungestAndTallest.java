import java.util.Scanner;

public class YoungestAndTallest {
	
    public static int findYoungest(int[] ages) {
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
			}
		}
        return youngestIndex;
	}
	
    public static int findTallest(double[] heights) {
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
			}
		}
        return tallestIndex;
	}
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
		
        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter the age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter the height (in cm) of " + friends[i] + ": ");
            heights[i] = scanner.nextDouble();
		}
		
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);
		
	    System.out.println("Youngest Friend is : " +friends[youngestIndex]);
		System.out.println("Tallest Friend is : " +friends[tallestIndex]);
		
        scanner.close();
	}
}