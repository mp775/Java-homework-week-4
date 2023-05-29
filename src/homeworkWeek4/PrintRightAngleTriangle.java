package homeworkWeek4;

import java.util.Scanner;

/* 8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@
 */

public class PrintRightAngleTriangle {

    // main method
    public static void main(String[] args) {
        PrintRightAngleTriangle triangle = new PrintRightAngleTriangle();  // creating object
        triangle.printTriangle();  // calling instance method using an object
    }


    // user defined instance method
    public void printTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int a, b;
        for (a = 0; a < n; a++) {
            for (b = 0; b <= a; b++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
