import java.util.Scanner;

public class BMICalculator {
	
    private static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; 
            data[i][2] = weight / (heightInMeters * heightInMeters); 
		}
	}
	
    private static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.4) {
                status[i] = "Underweight";
				} else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
				} else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
				} else if (bmi >= 40.0) {
                status[i] = "Obese";
			}
		}
        return status;
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        double[][] data = new double[10][3];
        String[] status = new String[10]; // Array to store BMI status for each person
		
        // Step 2: Take input for weight and height of 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            data[i][0] = sc.nextDouble(); // Storing weight in the first column
            System.out.print("Enter height (cm): ");
            data[i][1] = sc.nextDouble(); // Storing height in the second column
		}
		
        // Step 3: Calculate BMI and populate the array
        calculateBMI(data);
		
        // Step 4: Determine BMI status for each person
        status = determineBMIStatus(data);
		
        // Step 5: Display the height, weight, BMI, and status for each person
        System.out.println("\nBMI Report:");
        System.out.println("Weight (kg) | Height (cm) | BMI         | Status");
        for (int i = 0; i < 10; i++) {
            System.out.println(data[i][0] + "          | " 
				+ data[i][1] + "        | " 
				+ data[i][2] + "      | " 
			+ status[i]);
		}
		
        sc.close();
	}
}
