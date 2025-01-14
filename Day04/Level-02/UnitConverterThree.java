public class UnitConverterThree {
	
    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
	}
	
    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
	}
	
    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
	}
	
    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
	}
	
    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
	}
	
    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
	}
	
    public static void main(String[] args) {
        // Test the methods with example values
        double fahrenheit = 98.6;
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " °F is equal to " + celsius + " °C");
		
        double celsius2 = 37;
        double fahrenheit2 = convertCelsiusToFahrenheit(celsius2);
        System.out.println(celsius2 + " °C is equal to " + fahrenheit2 + " °F");
		
        double pounds = 150;
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms");
		
        double kilograms2 = 68;
        double pounds2 = convertKilogramsToPounds(kilograms2);
        System.out.println(kilograms2 + " kilograms is equal to " + pounds2 + " pounds");
		
        double gallons = 5;
        double liters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + liters + " liters");
		
        double liters2 = 20;
        double gallons2 = convertLitersToGallons(liters2);
        System.out.println(liters2 + " liters is equal to " + gallons2 + " gallons");
	}
}
