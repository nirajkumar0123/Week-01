import java.util.Scanner;

public class FindStringLength {
	
    // Method to find the length of a string without using the length() method
    public static int getStringLength(String str) throws Exception {
        int length = 0;
        try {
            int i = 0;
            while (true) {
                if(str.charAt(i) != ' '){
                    length++;
                    i++;
                }
            }
        } catch (StringIndexOutOfBoundsException e) {
            return length;
        }
    }
	
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter a string: ");
        String str = scanner.next();
		
        // Call the custom method to find string length
        int customLength = getStringLength(str);
        int builtInLength = str.length();
		
        // Display results
        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in method: " + builtInLength);
		
        if (customLength == builtInLength) {
            System.out.println("Both methods give the same result: " + customLength);
        } else {
            System.out.println("Results differ.");
        }
		
        scanner.close();
    }
}
