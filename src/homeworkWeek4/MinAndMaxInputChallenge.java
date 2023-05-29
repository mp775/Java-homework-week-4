package homeworkWeek4;

import java.util.Scanner;

/* 2. -Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge. */


public class MinAndMaxInputChallenge {

    // main method
    public static void main(String[] args) {
        findMinMaxNumber(); // calling static method
    }

    // static method
    public static void findMinMaxNumber() {
        int min, max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        min = max = number;

        while (number != 0) {
            System.out.println("Enter number");
            boolean validateNumber = sc.hasNextInt();  // validating number
            if (validateNumber) {
                number = sc.nextInt();
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
                System.out.println("min: " + min);
                System.out.println("max: " + max);
            } else {
                System.out.println("Invalid number");
                break;  // break the loop
            }
        }
    }
}
