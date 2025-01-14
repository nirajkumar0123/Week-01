import java.util.Scanner;

class IsLeapYear {
    
    public static boolean isValidYear(int year) {
        return year >= 1582;
    }
    
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printLeapYearStatus(int year) {
        if (isValidYear(year)) {
            if (isLeapYear(year)) {
                System.out.println("The year " + year + " is a Leap Year");
            } else {
                System.out.println("The year " + year + " is not a Leap Year");
            }
        } else {
            System.out.println("The year " + year + " is not a valid year in the Gregorian calendar");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        printLeapYearStatus(year);

        input.close();
    }
}
