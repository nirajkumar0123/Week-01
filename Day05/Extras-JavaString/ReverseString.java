import java.util.Scanner;

public class ReverseString{
	
	//method to reverse the string 
    public static String reverseString(String str) {
		//initialize the start and end counter
		int start = 0;
		int end = str.length()-1;
        char[] ch = str.toCharArray();

		while(start < end){
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;
		}
        String reversed = new String(ch);
        return reversed; 
	}
	public static void main(String[] args){
		//scanner object 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = input.nextLine();
		System.out.println("Reversed String is : " +reverseString(str));
	}
}