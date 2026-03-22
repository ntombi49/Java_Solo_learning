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

    }
}
