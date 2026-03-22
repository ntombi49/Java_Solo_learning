package basics;

import java.util.Scanner;

public class InputOutputPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ========================
        // Exercise 1 — Name
        // ========================
        // Ask: What is your name?
        // Print: Hello, <name>

        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.println("Hello, " + name);


        // ========================
        // Exercise 2 — Age
        // ========================
        // Ask: How old are you?
        // Print: Next year you will be ___

        System.out.print("How old are you? ");
        int age = input.nextInt();
        System.out.println("Next year you will be " + (age + 1));

        // ========================
        // Exercise 3 — Two numbers
        // ========================
        // Ask for 2 numbers
        // Print their sum

        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();

        System.out.println("Sum: " + (num1 + num2));

        input.nextLine();

        // ========================
        // Exercise 4 — Sentence
        // ========================
        // Ask: What is your favorite quote?
        // Print it nicely

        System.out.print("What is your favorite quote: ");
        String quote = input.nextLine();
        System.out.println("Your favorite quote is " + quote);


        input.close();
    }
}
