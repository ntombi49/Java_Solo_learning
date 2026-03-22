package basics;

public class VariablesPractice {
    public static void main(String[] args) {

        // Exercise 1 — Basic Variables
        // Create:
        // name (String)
        // age (int)
        // height (double)

        String name = "Ntombi";
        int age = 20;
        double height = 1.7;

        // Print:
        // My name is ___
        // I am ___ years old
        // My height is ___

        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("My height is " + height);

        // Exercise 2 — Favorite Things
        // Create:
        // favoriteFood
        // favoriteColor
        // favoriteNumber
        // Print them nicely

        String favoriteFood = "Burger";
        String favoriteColor = "Brown";
        int favoriteNumber = 10;

        System.out.println("My favorite food is " + favoriteFood);
        System.out.println("My favorite color is " + favoriteColor);
        System.out.println("My favorite number is " + favoriteNumber);

        // Exercise 3 — Math with Variables
        // Create:
        // int num1
        // int num2

        int num1 = 10;
        int num2 = 20;

        // Print:
        // Sum =
        // Difference =
        // Product =

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " +(num1 * num2));

        // Exercise 4 — Update Variable
        // Create/:
        // int score = 50;

        int score = 50;

        // Print it
        System.out.println(score);
        // Change it to 75
        // Print again

        score = 75;
        System.out.println(score);

        // ========================
        // Exercise 5 — Arithmetic
        // ========================

        int a = 15;
        int b = 4;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        // ========================
        // Exercise 6 — Even or Odd
        // ========================

        int number = 7;
        // Print remainder when divided by 2
        System.out.println("Remainder: " + (number % 2));

        // ========================
        // Exercise 7 — Fix Division
        // ========================

        // Make this print decimal result (3.5)

        double x = 7;
        int y = 2;

        System.out.println("Results: " + (x/y));

        // ========================
        // Exercise 8 — Challenge 🔥
        // ========================

        // Create 2 numbers
        // Print:
        // Their sum
        // Their average (IMPORTANT — think carefully)

        int number1 = 20;
        int number2 = 10;

        System.out.println("Sum: " + (number1 + number2));

        double average = (number1 + number2) / 2;
        System.out.println("Average: " + average);

    }
}
