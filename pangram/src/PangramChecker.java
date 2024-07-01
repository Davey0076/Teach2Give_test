/** Design a function that determines whether a given string is a pangram. 
 A pangram is a sentence or phrase containing every letter of the alphabet
 at least once. Punctuation and case are typically ignored.
 For example, the string "The quick brown fox jumps over the lazy dog"
 is a pangram, while "Hello, world!" is not. **/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {

    public static boolean isPangram(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }

        // Convert the string to lowercase and create a set to store unique characters
        str = str.toLowerCase();
        Set<Character> uniqueChars = new HashSet<>();

        // Iterate through the string and add only alphabetic characters to the set
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                uniqueChars.add(c);
            }
        }

        // A pangram must contain all 26 letters of the English alphabet
        return uniqueChars.size() == 26;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a pangram:");
        String input = sc.nextLine();

        try {
            boolean isPangram = PangramChecker.isPangram(input);
            if (isPangram) {
                System.out.println("The string is a pangram.");
            } else {
                System.out.println("The string is not a pangram.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
