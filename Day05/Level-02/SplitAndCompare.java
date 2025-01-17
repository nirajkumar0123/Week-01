import java.util.Scanner;

public class SplitAndCompare {

    // Method to calculate the length of the string without using length()
    public static int getStringLength(String text) {
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to split the string into words without using split()
    public static String[] customSplit(String text) {
        int length = getStringLength(text);
        int wordCount = 0;

        // Count words
        boolean isWord = false;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ' && !isWord) {
                isWord = true;
                wordCount++;
            } else if (text.charAt(i) == ' ') {
                isWord = false;
            }
        }

        String[] words = new String[wordCount];
        int startIndex = 0;
        int wordIndex = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                if (i == length - 1 && text.charAt(i) != ' ') {
                    i++; 
                }
                if (startIndex < i) {
                    words[wordIndex++] = text.substring(startIndex, i).trim();
                }
                startIndex = i + 1;
            }
        }

        return words;
    }

    // Method to compare two String arrays
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        String[] customSplitWords = customSplit(text);

        String[] splitWords = text.trim().split("\\s+");

        boolean areEqual = compareStringArrays(customSplitWords, splitWords);


        System.out.println("\nCustom Split Words:");
        for (String word : customSplitWords) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split Words:");
        for (String word : splitWords) {
            System.out.println(word);
        }

        if(areEqual){
		    System.out.println("Both are equal " + areEqual);
		}
		else{
			System.out.println("Both are not Equal");
		}

        scanner.close();
    }
}
