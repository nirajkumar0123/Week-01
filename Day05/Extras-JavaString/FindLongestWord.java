import java.util.Scanner;

public class FindLongestWord {
	
    //method to find the longest word
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";
		
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
			}
		}
        return longestWord;
	}
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
		
        System.out.println("The longest word is: " + findLongestWord(sentence));
	}
}
