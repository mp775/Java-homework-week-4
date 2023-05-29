package homeworkWeek4;

/* 13. Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
 */

public class SharedDigit {

    // main method
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    // static method
    public static boolean hasSharedDigit(int fNumber, int sNumber) {

        if (fNumber < 10 || fNumber > 99 || sNumber < 10 || sNumber > 99) {
            return false;
        }

        int firstNumberFirstDigit = fNumber / 10;
        int secondNumberFirstDigit = sNumber / 10;
        int firstNumberLastDigit = fNumber % 10;
        int secondNumberLastDigit = sNumber % 10;

        if (firstNumberFirstDigit == secondNumberFirstDigit || firstNumberFirstDigit == secondNumberLastDigit || firstNumberLastDigit == secondNumberFirstDigit ||
                firstNumberLastDigit == secondNumberLastDigit) {
            return true;
        } else {
            return false;
        }
    }
}
