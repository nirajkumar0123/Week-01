import java.util.Scanner;

public class BonusCalculator {
	
    public static double[][] generateEmployee(int count) {
        double[][] data = new double[count][2];
		
        for (int i = 0; i < count; i++) {
            data[i][0] = 10000 + (int) Math.random() * 90000;
			
            data[i][1] = 1 + (int) (Math.random() * 10);
		}
        return data;
	}
	
    // Method to calculate bonuses and new salaries
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][2];
		
        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
			
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonusAmount = salary * bonusPercentage;
            double newSalary = salary + bonusAmount;
			
            // Store new salary and bonus in updatedData
            updatedData[i][0] = newSalary;
            updatedData[i][1] = bonusAmount;
		}
        return updatedData;
	}
	
    // Method to display results in tabular format
    public static void displayResults(double[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
		
        System.out.println("\nEmployee Salary Details:");
        System.out.println("Employee\tOld Salary\tYears\tBonus\t\tNew Salary");
		
        for (int i = 0; i < oldData.length; i++) {
            double oldSalary = oldData[i][0];
            int yearsOfService = (int) oldData[i][1];
		double bonus = newData[i][1];
		double newSalary = newData[i][0];
		
		// Display employee data
		System.out.println(
		(i + 1) + "\t\t" + oldSalary + "\t\t" + yearsOfService + "\t" + bonus + "\t\t" + newSalary);
		
		// Update totals
		totalOldSalary += oldSalary;
		totalNewSalary += newSalary;
		totalBonus += bonus;
        }
		
        System.out.println("Totals:\t\t" + totalOldSalary + "\t\t\t" + totalBonus + "\t\t" + totalNewSalary);
		}
		
		public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Employees :");
        int numberOfEmployees = input.nextInt();
		
        double[][] employeeData = generateEmployee(numberOfEmployees);
		
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
		
        displayResults(employeeData, updatedData);
		}
		
		}
				