import java.util.Scanner;

public class CourseFeesSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fee = scanner.nextInt();
        int discountPercent = scanner.nextInt();
        int discount = (fee * discountPercent) / 100;
        int finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
	}
}
