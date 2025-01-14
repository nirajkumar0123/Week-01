import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Validating the input
        if (numberOfStudents <= 1) {
            System.out.println("No handshakes possible for " + numberOfStudents + " student(s).");
        } else {
            // Using the formula to calculate the maximum number of handshakes
            int maximumHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

            // Displaying the result
            System.out.println("The maximum number of handshakes among " 
                               + numberOfStudents + " students is " + maximumHandshakes + ".");
        }

        scanner.close(); // Close the scanner
    }
}
