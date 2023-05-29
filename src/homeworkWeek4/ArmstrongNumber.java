package homeworkWeek4;

import java.util.Scanner;

import static java.lang.Math.pow;

/* 10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
 */


public class ArmstrongNumber {

    // main method
    public static void main(String[] args) {
        findArmstrongNumber();  // calling static method
    }

    // user defined static method
    public static int findArmstrongNumber() {
        int originalNum, remainder, n=0, result =0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int num = scan.nextInt();

        for (originalNum = num; originalNum != 0; n++) {
            originalNum /= 10;
        }

        for (originalNum = num; originalNum != 0; originalNum /= 10) {
            remainder = originalNum % 10;
            result += pow(remainder,n);
        }

        if (result == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");

        return 0;
    }
}
