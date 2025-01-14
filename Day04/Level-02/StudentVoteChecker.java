import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote based on their age
    public static boolean canStudentVote(int[] age) {
	   for(int i = 0; i < age.length; i++){
		   if (age[i] < 0) {
            return false; // Invalid age
           }
		    if (age[i] < 18) {
            return false; // Invalid age
           }
		 }
        
        return true; // Return true if age is 18 or above
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] studentAges = new int[10]; // Array to store the ages of 10 students

        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();

            boolean canVote = canStudentVote(studentAges);
			
            if (studentAges[i] < 0) {
                System.out.println("Invalid age entered for student " + (i + 1) + ".");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        scanner.close();
    }
}
