/** Design a function that takes a list of integers as input. 
 The function should return true if the list contains two consecutive threes
 (3 next to a 3) anywhere within the list. Otherwise, it should return false.
 For example, the function should return true for [1, 3, 3] and false for [1, 3, 1, 3]. **/

import java.util.Scanner;

public class ConsecutiveThrees {

    public static boolean hasConsecutiveThrees(int[] arr) {
        // Iterate through the array up to the second-to-last element
        for (int i = 0; i < arr.length - 1; i++) {
            // Check if the current element and the next element are both 3
            if (arr[i] == 3 && arr[i + 1] == 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name user?");
        String userName = sc.nextLine();
        System.out.println("Welcome, " +userName+ " ,How many numbers do you want to input?");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the numbers please....");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = hasConsecutiveThrees(arr);
        if (result) {
            System.out.println("Consecutive threes found.");
        } else {
            System.out.println("No consecutive threes found.");
        }

        sc.close();
    }
}
