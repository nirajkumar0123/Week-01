import java.util.Scanner;

public class FindTrigonometric {

    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert the angle from degrees to radians
        double radians = Math.toRadians(angle);
        
        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        
        // Return the results in an array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        double[] results = calculateTrigonometricFunctions(angle);
        
        System.out.printf("Sine: %.4f\n", results[0]);
        System.out.printf("Cosine: %.4f\n", results[1]);
        System.out.printf("Tangent: %.4f\n", results[2]);

        scanner.close();
    }
}
