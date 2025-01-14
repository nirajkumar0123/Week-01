public class UnitConverter {
	
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
	}
	
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
	}
	
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
	}
	
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
	}
	
    public static void main(String[] args) {
        // Testing the methods with some example values
        double km = 10;
        double miles = convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + miles + " miles.");
		
        double miles2 = 6.21;
        double km2 = convertMilesToKm(miles2);
        System.out.println(miles2 + " miles is equal to " + km2 + " kilometers.");
		
        double meters = 100;
        double feet = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + feet + " feet.");
		
        double feet2 = 328.084;
        double meters2 = convertFeetToMeters(feet2);
        System.out.println(feet2 + " feet is equal to " + meters2 + " meters.");
	}
}
