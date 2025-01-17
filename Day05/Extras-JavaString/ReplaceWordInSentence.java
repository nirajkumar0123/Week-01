import java.util.Scanner;

public class ReplaceWordInSentence {

    // Method to replace a word in a sentence using only String
    public static String replaceWordString(String sentence, String target, String replacement) {
        return sentence.replace(target, replacement);
    }

    public static void main(String[] args) {
        //scanner object
	    Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the sentence : ");
        String sentence = input.nextLine();
        System.out.println("Enter the target word : ");
        String targetWord = input.nextLine();
        System.out.println("Enter the replacement word : ");
        String replacementWord = input.nextLine();
		
        String updatedSentence = replaceWordString(sentence,targetWord, replacementWord);
        System.out.println("Sentence after replacement of word is : " + updatedSentence);
    }
}
