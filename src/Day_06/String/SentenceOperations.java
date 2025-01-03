package Day_06.String;

import java.util.Scanner;

public class SentenceOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\s+"); // Split by spaces
        int wordCount = words.length;
        System.out.println("Number of words: " + wordCount);
        String reversedSentence = new StringBuilder(sentence).reverse().toString();
        System.out.println("Reversed sentence: " + reversedSentence);
        String modifiedSentence = sentence.replaceAll("[aeiouAEIOU]", "*");
        System.out.println("Sentence with vowels replaced: " + modifiedSentence);
    }
}
