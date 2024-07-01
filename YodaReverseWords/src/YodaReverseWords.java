/**
 * Design a function that takes a sentence as input and returns a new sentence 
 * with the words reversed in the same order that Master Yoda would use. 
 * For example, instead of saying "I am home" he might say "Home am I".
 **/

import java.util.Scanner;

public class YodaReverseWords {

    // Function to reverse the order of words in a sentence
    public static String reverseWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            throw new IllegalArgumentException("Input sentence cannot be empty");
        }

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Use a StringBuilder to construct the reversed sentence
        StringBuilder reversedSentence = new StringBuilder();

        // Iterate through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }

        return reversedSentence.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence to be reversed:");
        String input = sc.nextLine();

        try {
            String yodaSentence = reverseWords(input);
            System.out.println("Reversed sentence: " + yodaSentence);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
