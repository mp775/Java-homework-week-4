package homeworkWeek4;

/* 11. Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
 */

public class EvenDigitSum {

    // main method
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));  // calling static method
        System.out.println(getEvenDigitSum(252));  // calling static method
        System.out.println(getEvenDigitSum(-22));  // calling static method
    }

    // user defined static method
    public static int getEvenDigitSum(int number){
        int originalNumber = number;
        int lastDigit;
        int sumOfEvenDigits = 0;
        if (number >= 0) {
            while (number > 0) {
                lastDigit = number % 10;  // returns the last digit
                if (lastDigit % 2 == 0) {  // checking if the last digit is even
                    sumOfEvenDigits += lastDigit;
                }
                number /= 10;
            }
            if (originalNumber >= 0) {
                System.out.print("The sum of even digits for " + originalNumber + " is equal to: ");
            }
            return sumOfEvenDigits;
        }
        System.out.println("Invalid input:");
        return -1;
    }
}
