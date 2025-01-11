import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        // Step 1: Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = sc.nextInt();
		
        // Step 2: Create arrays to store weight, height, BMI, and weight status
        double[] weight = new double[numberOfPersons];
        double[] height = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] status = new String[numberOfPersons];
		
        // Step 3: Take input for weight and height of each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();
            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();
			
            // Step 4: Calculate BMI and determine weight status
            bmi[i] = weight[i] / (height[i] * height[i]); // BMI = weight / (height^2)
			
            // Determine weight status based on BMI
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
				} else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                status[i] = "Normal weight";
				} else if (bmi[i] >= 25 && bmi[i] < 39.9) {
                status[i] = "Overweight";
				} else {
                status[i] = "Obesity";
			}
		}
		
        // Step 5: Display the height, weight, BMI, and weight status for each person
		
		System.out.println("Height(m)  Weight(kg)  BMI    Status");
		for (int i = 0; i < numberOfPersons; i++) {
			System.out.println(height[i] + "    " + weight[i] + "    " + bmi[i] + "    " + status[i]);
		}
		
		
        sc.close();
	}
}
