import java.util.Scanner;

public class TriangularPark {

    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public static int calculateRounds(double perimeter, double totalDistance) {
        return (int) Math.ceil(totalDistance / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first side of the triangular park in meters: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the second side of the triangular park in meters: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the third side of the triangular park in meters: ");
        double side3 = scanner.nextDouble();

        double perimeter = calculatePerimeter(side1, side2, side3);

        int rounds = calculateRounds(perimeter, 5000);
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");

scanner.close(); // Close the scanner
    }
}

