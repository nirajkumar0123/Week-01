import java.util.Scanner;

public class DivideChoclates {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        if (numberOfChildren > 0) {
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
            System.out.println("Each child gets: " + result[0] + " chocolates and Remaining chocolates: " + result[1]);
        } else {
            System.out.println("Number of children must be greater than 0.");
        }

        scanner.close();
    }
}
