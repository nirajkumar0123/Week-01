import java.util.Scanner;

public class FindQuadratic {
	
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c; // Calculate delta
		
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
			} else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
			} else {
            return new double[]{}; // Return an empty array
		}
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        // Take input for coefficients a, b, and c
        System.out.print("Enter the coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the coefficient c: ");
        double c = sc.nextDouble();
		
        // Find the roots using the findRoots method
        double[] roots = findRoots(a, b, c);
		
        // Display the results
        if (roots.length == 2) {
            System.out.println("The equation has two roots: " + roots[0] + " and " + roots[1]);
			} else if (roots.length == 1) {
            System.out.println("The equation has one root: " + roots[0]);
			} else {
            System.out.println("The equation has no real roots.");
		}
		
        sc.close();
	}
}
