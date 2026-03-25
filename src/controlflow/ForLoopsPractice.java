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

//     More practice questions.
//
//         ========================
//         Exercise 1 — Count Up
//         ========================
//         Use a for loop to print numbers from 1 to 10
//         Expected output: 1 2 3 4 5 6 7 8 9 10

       for ( int num = 1; num <= 10; num++) {
           System.out.println(num);
       }



        // ========================
        // Exercise 2 — Count Down
        // ========================
        // Use a for loop to print numbers from 10 down to 1
        // Expected output: 10 9 8 7 6 5 4 3 2 1

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // ========================
        // Exercise 3 — Even Numbers
        // ========================
        // Use a for loop to print all even numbers from 1 to 20
        // Expected output: 2 4 6 8 10 12 14 16 18 20

        for ( int num = 2; num <= 20; num += 2) {
            System.out.println(num);
        }

        // ========================
        // Exercise 4 — Odd Numbers
        // ========================
        // Use a for loop to print all odd numbers from 1 to 20
        // Expected output: 1 3 5 7 9 11 13 15 17 19

        for ( int num = 1; num <= 20; num ++) {
            if ( num % 2 != 0) {
                System.out.println(num);
            }
        }

        // ========================
        // Exercise 5 — Skip Counting
        // ========================
        // Use a for loop to print numbers from 0 to 50 in steps of 5
        // Expected output: 0 5 10 15 20 25 30 35 40 45 50

        for ( int num = 0; num <= 50; num += 5) {
            System.out.println(num);
        }


        // ========================
        // Exercise 6 — Sum 1 to 100
        // ========================
        // Use a for loop to calculate the sum of numbers from 1 to 100
        // Print the final sum

        int sum = 0;
        for ( int num = 1; num <= 100; num ++) {
            sum += num;
        } System.out.println(sum);

        // ========================
        // Exercise 7 — Multiplication Table
        // ========================
        // Use a for loop to print the multiplication table of 5 (1 to 10)
        // Example:
        // 5 x 1 = 5
        // 5 x 2 = 10

        for ( int num = 1; num <= 10; num ++) {
            System.out.println( "5 * " + num + " = " + (5 * num));
        }


        // ========================
        // Exercise 8 — Squares
        // ========================
        // Use a for loop to print numbers from 1 to 10 and their squares
        // Example:
        // 1 -> 1
        // 2 -> 4
        // 3 -> 9

        for ( int num = 1; num <= 10; num ++) {
            int squares = num * num; {
                System.out.println( num + " -> " + squares);
            }
        }


        // ========================
        // Exercise 9 — Reverse Even Numbers
        // ========================
        // Use a for loop to print even numbers from 20 down to 2
        // Expected output: 20 18 16 14 12 10 8 6 4 2

        for ( int num = 20; num >= 2; num -= 2) {
            System.out.println(num);
        }


        // ========================
        // Exercise 10 — Pattern Stars
        // ========================
        // Use nested for loops to print:
        // *
        // **
        // ***
        // ****
        // *****

        for ( int row = 1; row <= 5; row ++ ) {
            for ( int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();

        }

        // ========================
        // Exercise 11 — Pattern Numbers
        // ========================
        // Use nested for loops to print:
        // 1
        // 12
        // 123
        // 1234
        // 12345

        for ( int num = 1; num <= 5; num++) {
            for (int numbers = 1; numbers <= num; numbers++ ) {
                System.out.print(numbers);
            }
            System.out.println();
        }


        // ========================
        // Exercise 12 — Factorial
        // ========================
        // Use a for loop to calculate the factorial of a number
        // Example: 5! = 5 × 4 × 3 × 2 × 1 = 120

        int factorial = 1;

        for (int num = 5; num >= 1; num--) {
            factorial *= num;
        }
        System.out.println(factorial);

        // ========================
        // Exercise 13 — Break Practice
        // ========================
        // Use a for loop to print numbers from 1 to 10
        // Stop the loop when the number is 6

        for (int num = 1; num <= 10; num ++) {
            if ( num == 6) {
                break;
            } {
                System.out.println(num);
            }
        }


        // ========================
        // Exercise 14 — Continue Practice
        // ========================
        // Use a for loop to print numbers from 1 to 10
        // Skip number 5

        for ( int num = 1; num <= 10; num ++) {
            if ( num == 5) {
                continue;
            } {
                System.out.println(num);
            }
        }

        input.close();
    }
}
