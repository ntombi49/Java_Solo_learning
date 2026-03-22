package controlflow;

import java.util.Scanner;

public class ForLoopsPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ========================
        // Exercise 1 — Count to 5
        // ========================
        // Use a for loop to print numbers 1 to 5
        // Expected output: 1 2 3 4 5

        for ( int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        // ========================
        // Exercise 2 — Sum 1 to 10
        // ========================
        // Use a loop to calculate the sum of numbers 1 to 10
        // Print the sum

        int total = 0;

        for (int i = 1; i <= 10; i++) {
            total += i;

        } System.out.println("Sum: " + total);


        // ========================
        // Exercise 3 — Multiplication Table
        // ========================
        // Ask the user for a number
        // Print its multiplication table from 1 to 10
        // Example for 3:
        // 3 x 1 = 3
        // 3 x 2 = 6
        // ...
        // 3 x 10 = 30

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for ( int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        // ========================
        // Exercise 4 — Even Numbers
        // ========================
        // Print all even numbers from 2 to 20 using a for loop

        for (int num = 1; num <= 20; num++) {
            if ( num % 2 == 0) {
                System.out.println(num);
            }
        }


        // ========================
        // Exercise 5 — Challenge 🔥
        // ========================
        // Print numbers from 1 to 50
        // But for multiples of 3 → print "Fizz"
        // For multiples of 5 → print "Buzz"
        // For multiples of both 3 & 5 → print "FizzBuzz"

        for ( int num = 1; num <= 50; num++) {
            if ( num % 3 == 0 && num % 5 == 0) {
                System.out.println(num + " = FizzBuzz");
            } else if ( num % 3 == 0) {
                System.out.println(num + " = Fizz");
            } else if (num % 5 == 0) {
                System.out.println(num +" = Buzz");
            } else {
                System.out.println(num);
            }
        }

        input.close();
    }
}
