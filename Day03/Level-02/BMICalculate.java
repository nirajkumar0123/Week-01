import java.util.Scanner;

public class BMICalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = sc.nextInt();

        // Step 2: Create a multi-dimensional array to store weight, height, and BMI
        double[][] personData = new double[numberOfPersons][3]; // [height, weight, BMI]
        String[] weightStatus = new String[numberOfPersons];

        // Step 3: Take input for weight and height of each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");

            // Input and validate weight
            do {
                System.out.print("Enter weight (kg): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be positive. Please try again.");
                }
            } while (personData[i][1] <= 0);

            // Input and validate height
            do {
                System.out.print("Enter height (m): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be positive. Please try again.");
                }
            } while (personData[i][0] <= 0);

            // Step 4: Calculate BMI
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]); // BMI = weight / (height^2)

            // Determine weight status based on BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Step 5: Display the height, weight, BMI, and weight status for each person
        System.out.println("\nHeight(m)  Weight(kg)  BMI         Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%.2f       %.2f       %.2f    %s\n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
