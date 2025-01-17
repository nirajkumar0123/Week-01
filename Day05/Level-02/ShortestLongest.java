import java.util.Scanner;

public class ShortestLongest {

    // Method to split the text into words using charAt(), without using split()
    public static String[] splitTextIntoWords(String text) {
        int wordCount = 0;

        // Count the number of words
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ' && (i == text.length() - 1 || text.charAt(i + 1) == ' ')) {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        String temp = "";
      
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                temp += ch; 
            } else if (!temp.equals("")) {
                words[wordIndex++] = temp; 
                temp = "";
            }
        }
        if (!temp.equals("")) {
            words[wordIndex] = temp; // Store the last word
        }

        return words;
    }
   
    public static int stringLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }

    public static String[][] calculateWordLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i]; 
            wordLengths[i][1] = String.valueOf(stringLength(words[i]));
        }
        return wordLengths;
    }

    // Method to find the shortest and longest strings and return them in a 1D int array
    public static int[] findShortestAndLongest(String[][] wordLengths) {
        int shortestIndex = 0;
        int longestIndex = 0;
        int shortestLength = Integer.parseInt(wordLengths[0][1]);
        int longestLength = Integer.parseInt(wordLengths[0][1]);

        for (int i = 1; i < wordLengths.length; i++) {
            int currentLength = Integer.parseInt(wordLengths[i][1]);
            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestIndex = i;
            }
            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestIndex = i;
            }
        }
        return new int[]{shortestIndex, longestIndex};
    }
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();
        
        String[] words = splitTextIntoWords(inputText);
  
        String[][] wordLengths = calculateWordLengths(words);
      
        int[] result = findShortestAndLongest(wordLengths);
        
        System.out.println("Shortest Word: " + wordLengths[result[0]][0] +
                           " (Length: " + wordLengths[result[0]][1] + ")");
        System.out.println("Longest Word: " + wordLengths[result[1]][0] +
                           " (Length: " + wordLengths[result[1]][1] + ")");
    }
}