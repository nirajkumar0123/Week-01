import java.util.Scanner;

public class Handshake {

    // Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2; // Using the combination formula
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Validating the input
        if (numberOfStudents <= 1) {
            System.out.println("No handshakes possible for " + numberOfStudents + " student(s).");
        } else {
            // Calculating the maximum number of handshakes
            int maxHandshakes = calculateHandshakes(numberOfStudents);

            // Displaying the result
            System.out.println("The maximum number of handshakes among " 
                               + numberOfStudents + " students is " + maxHandshakes + ".");
        }

        scanner.close(); // Close the scanner
    }
}

