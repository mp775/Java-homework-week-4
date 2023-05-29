package homeworkWeek4;

import java.util.Scanner;

/* 3. Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel of Consonant, depending on the user input.
If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
For eg:
Input an alphabet: p
Expected Output: Input letter is Consonant */

public class PrintVowelOfConsonant {

    // main method
    public static void main(String[] args) {
        PrintVowelOfConsonant vc = new PrintVowelOfConsonant();  // creating object
        vc.findVowelOfConsonant();  // calling instance method using an object
    }

    // instance method
    public void findVowelOfConsonant() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input an alphabet: ");
        String input = scan.next();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;  // conditional variable
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;  // conditional variable
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") // conditional variable
                || input.equals("o") || input.equals("u") || input.equals("A") || input.equals("E") || input.equals("I")
                || input.equals("O") || input.equals("U");

        if (input.length() > 1)
        {
            System.out.println("Error - Input value is not a single character.");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Error - Input value is not a letter. Enter uppercase or lowercase letter.");
        }
        else if (vowels)
        {
            System.out.println("Input letter is Vowel");
        }
        else
        {
            System.out.println("Input letter is Consonant");
        }
    }
}
