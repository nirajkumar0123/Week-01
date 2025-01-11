import java.util.Scanner;

public class VoterIsEligible{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int[] age = new int[10];
		for (int i = 0; i < age.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            age[i] = input.nextInt();
		}
		
		for(int i = 0; i < age.length; i++){
			if(age[i] < 0){
				System.out.println("Invalid Age");
			}
			else if(age[i] >= 18){
				System.out.println("The student with the age "+age[i]+" can vote");
			}
			else{
				System.out.println("The student with the age "+age[i]+" cannot vote.");
			}
		}
	}
}