package homeworkWeek4;

import java.util.Scanner;

/* 12. Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.)
 */

public class PrimeNumber {

    // main method
    public static void main(String[] args) {
        PrimeNumber prime = new PrimeNumber();  // creating object
        prime.findPrimeNumber();  // calling instance method using an object
    }

    // instance method
    public void findPrimeNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        boolean flag = false;

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}

