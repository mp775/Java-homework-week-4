package homeworkWeek4;

import java.util.Scanner;


/* 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number) */

public class FibonacciNumberSeries {

    // main method
    public static void main(String[] args) {
        FibonacciNumberSeries fib = new FibonacciNumberSeries();  // creating object
        fib.displayFibonacciSeries();  // calling instance method using an object
    }

    // user defined instance method
    public void displayFibonacciSeries(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number of digits you want to print Fibonacci series up to: ");
        int count = scan.nextInt();
        int n1=0,n2=1,n3,i;
        System.out.print(n1+" "+n2); // printing 0 and 1

        for(i=2;i<count;++i)  // loop starts from 2
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
