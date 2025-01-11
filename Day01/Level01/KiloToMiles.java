import java.util.Scanner;
public class KiloToMiles{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double km = input.nextDouble();
		double kmToMiles = km/1.6;
		System.out.println("The total miles is " +kmToMiles + " mile for the given " + km + "km");
	}
}