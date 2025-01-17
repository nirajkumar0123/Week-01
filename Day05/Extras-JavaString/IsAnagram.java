import java.util.Scanner;

public class IsAnagram {
	
	public static boolean isAnagram(String s1, String s2){
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();
        
        if(s1.length() != s2.length()){
                return false;
        } 

        int[] charCount = new int[26];

        for(int i = 0; i < s1.length(); i++){
                charCount[s1.charAt(i) - 'a']++;
         }

        for(int i = 0; i < s2.length(); i++){
                 charCount[s1.charAt(i) - 'a']--;
         }
		
        for(int count : charCount){
                if(count != 0) return false;
        }
        return true;
     }
	
    public static void main(String[] args) {
        //Scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string s1 : ");
        String s1 = input.nextLine();

        System.out.println("Enter string s2 : ");
        String s2 = input.nextLine();

        //call the isAnagram method to check the anagram 
        if(isAnagram(s1, s2)){
                System.out.println("Strings are anagrams!");
        }else{
                System.out.println("String are not anagrams");
        }
        input.close();
    }
}
