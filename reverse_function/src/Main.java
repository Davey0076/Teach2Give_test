

/**1. Design a function that reverses the digits of an integer. For example, 50
 * should become 5 and -12 should become -21. **/

 import java.util.Scanner;

class Reverse {
    //method to reverse digits of a number
    public static int reverseNumber(int num) {
        //check if number is negative
        boolean isNegative = num < 0;
        //get absolute number
        int absNumber = Math.abs(num);

        //iterate through the number to obtain digits and reverse them
        int reversedNumber = 0;
        while (absNumber != 0) {
            int lastDigit = absNumber % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            absNumber = absNumber / 10;
        }

        //return the reversed after getting the sign
        return isNegative ? -reversedNumber : reversedNumber;
    }
}

//starting point of program
public class Main {
    public static void main(String[] args) {
        // Prompt user to enter number to be scanned
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to be reversed...");
        int num = sc.nextInt();
        System.out.println("Entered number is: " + num);

        // Reverse the number
        int reversedNum = Reverse.reverseNumber(num);
        System.out.println("Reversed number is: " + reversedNum);
    }
}
