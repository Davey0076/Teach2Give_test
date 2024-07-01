/** Design a function that takes a string or sequence of characters as input and
 returns the character that appears most frequently. **/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to find its most frequent character:");
        String input = sc.nextLine();

        try {
            char mostFrequentChar = MostFrequent.findMostFrequentChar(input);
            System.out.println("The most frequent character is: " + mostFrequentChar);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
