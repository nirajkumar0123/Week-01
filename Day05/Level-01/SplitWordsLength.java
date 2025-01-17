import java.util.*;
public class SplitWordsLength{
	
	public static String[] splitTextIntoWords(String text) {
		
        String[] words = new String[text.length() / 2 + 1];
        int wordCount = 0;
        String word = "";
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            
            // If the current character is not a space, add it to the word
            if (currentChar != ' ') {
                word += currentChar;
			} 
            // If the current character is a space and word is not empty
            else if (word.length() > 0) {
                words[wordCount++] = word;
                word = "";
			}
		}
        
        // If the last word doesn't end with a space, add it manually
        if (word.length() > 0) {
            words[wordCount++] = word;
		}
		
		// Resize the array to fit the actual number of words
        String[] result = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
			result[i] = words[i];
		}
        
        return result;
	}
	
	   public static int getLength(String str) {
        int length = 0;
        
        for (char ch : str.toCharArray()) {
            length++;
        }
        
        return length;
    }
	
    // Method to generate a 2D array containing words and their corresponding lengths
    public static String[][] getWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(getLength(words[i]));
		}
        
        return wordLengthArray;
	}
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String inputText = scanner.nextLine();
        
        String[] words = splitTextIntoWords(inputText);
        
        String[][] wordLengthArray = getWordLengthArray(words);
        
        for (int i = 0; i < wordLengthArray.length; i++) {
            System.out.println(wordLengthArray[i][0] + "\t" + Integer.parseInt(wordLengthArray[i][1]));
		}
        
        scanner.close();
	}
}
