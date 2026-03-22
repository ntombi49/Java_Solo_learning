package controlflow;

import java.util.Scanner;

public class IfElsePractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ========================
        // Exercise 1 — Age Check
        // ========================
        // Ask user age
        // If age >= 18 → "You can vote"
        // Else → "You are too young"

        System.out.print("How old are you? ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You are too young");
        }

        // ========================
        // Exercise 2 — Even or Odd
        // ========================
        // Ask number
        // If even → "Even number"
        // Else → "Odd number"

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if ( number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        // ========================
        // Exercise 3 — Grade System
        // ========================
        // Ask marks
        // 80+ → Distinction
        // 50–79 → Pass
        // Below 50 → Fail

        System.out.print("Enter your marks: ");
        int marks = input.nextInt();

        if ( marks >= 80) {
            System.out.println("Distinction");
        } else if (marks >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        input.nextLine();

        // ========================
        // Exercise 4 — Password Check 🔐
        // ========================
        // Ask user to enter password
        // If password == "java123" → "Access granted"
        // Else → "Access denied"

        System.out.print("Enter password: ");
        String password = input.nextLine();

        if (password.equals("java123")) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        input.close();
    }
}
