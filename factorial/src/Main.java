//2. Write a recursive function to calculate the factorial of a number

import java.util.Scanner;

class Factorial {

    //method to get the factorial of a number
    public static int numFactorial(int num) {
        if (num == 0) { // Base case: factorial of 0 is 1
            return 1;
        } else {
            return num * numFactorial(num - 1); // Recursive case
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number to get its factorial...");
        Scanner sc = new Scanner(System.in);
        int enteredNumber = sc.nextInt();
        System.out.println("The entered number is: " + enteredNumber);

        // Get the factorial for the number entered
        int result = Factorial.numFactorial(enteredNumber);
        System.out.println("Its factorial is: " + result);
    }
}
