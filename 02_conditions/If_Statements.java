// Ifstatements

// 1️⃣ The if Statement
// Basic syntax:

// if (condition) {
//     // code runs if condition is true
// }
// Example:
// int age = 18;
// if (age >= 18) {
//     System.out.println("You are an adult.");
// }
// What happens
// If age is 18 or more, the message prints.
// Output:
// You are an adult.

// 2️⃣ Understanding Conditions
// Inside the parentheses we write a comparison.

// Common comparison operators:

// | Operator | Meaning               |
// | -------- | --------------------- |
// | `==`     | equal to              |
// | `!=`     | not equal             |
// | `>`      | greater than          |
// | `<`      | less than             |
// | `>=`     | greater than or equal |
// | `<=`     | less than or equal    |

//  3️⃣ if + else
//  Sometimes we want two possible outcomes.
 
//  Example:
 
//  int age = 16;
 
//  if (age >= 18) {
//      System.out.println("You can vote.");
//  } else {
//      System.out.println("You are too young to vote.");
//  }

// 4️⃣ else if (Multiple Decisions)
// This lets us check multiple conditions.

// Example:

// int score = 75;

// if (score >= 80) {
//     System.out.println("Distinction");
// } else if (score >= 60) {
//     System.out.println("Pass");
// } else {
//     System.out.println("Fail");
// }

// 5️⃣ Using Scanner + Decisions
// Now we combine input + decisions.

// Example:

// import java.util.Scanner;

// public class AgeCheck {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter your age: ");
//         int age = scanner.nextInt();

//         if (age >= 18) {
//             System.out.println("You are an adult.");
//         } else {
//             System.out.println("You are a minor.");
//         }
//     }
// }