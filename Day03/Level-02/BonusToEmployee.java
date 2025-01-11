import java.util.Scanner;

public class BonusToEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        // Define arrays to store employee data
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
		
        // Variables to store total values
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
		
        // Loop to take input for salary and years of service
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salary[i] = sc.nextDouble();
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = sc.nextDouble();
				
                if (salary[i] < 0 || yearsOfService[i] < 0) {
                    System.out.println("Invalid input! Salary or years of service cannot be negative. Please enter again.");
					} else {
                    break;
				}
			}
		}
		
        // Loop to calculate bonus, new salary and total salary
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
				} else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
			}
			
            newSalary[i] = salary[i] + bonus[i]; // New salary after bonus
			
            // Update total values
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
		}
		
        // Output the total bonus and salaries
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
	}
}
