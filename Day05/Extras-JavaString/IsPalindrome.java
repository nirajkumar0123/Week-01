import java.util.Scanner;

public class IsPalindrome{
	
	//Method to check is Palindrome or Not
	public static boolean PalindromeCheck(String str){
		str = str.toLowerCase();
		int start = 0;
		int end = str.length()-1;

		while(start < end){
			if(str.charAt(start) != str.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	public static void main(String[] args){
		//scanner object

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = input.nextLine();
		
		System.out.println("String is Palindrome Or Not : " +PalindromeCheck(str));
	}
}