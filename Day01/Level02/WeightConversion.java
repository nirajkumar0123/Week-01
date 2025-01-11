import java.util.Scanner;
public class WeightConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        double weightInKilograms = weight / 2.2;
        System.out.println("The weight of the person in pound is " + weight + 
		" and in kg is " + weightInKilograms);
	}
}
