import java.util.Scanner;

class EligibleToVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter the person's age : ");
        int age = input.nextInt();
		
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
			} else {
            System.out.println("The person's age is " + age + " and cannot vote.");
		}
		
        input.close();
	}
}