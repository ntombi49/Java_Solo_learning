import java.util.Scanner;

public class InputOutputPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

// Exercise 1
// Ask the user:
// What is your name?
// Then print:
// Nice to meet you, ___

    System.out.println("What is your name? ");

    String name = scanner.nextLine();
    System.out.println("Nice to meet you " + name);


// Exercise 2
// Ask:
// How old are you?
// Then print:
// Next year you will be ___
    
    System.out.println("How old are you? ");

    int age = scanner.nextInt();
    scanner.nextLine();
    int newAge = age + 1;

    System.out.println("Next year you will be " + newAge);


// // Exercise 3
// Ask:
// What city do you live in?
// Then print:
// You live in ___

    
    System.out.println("What city do you live in? ");
    String city = scanner.nextLine();
    
    System.out.println("You live in " + city);


// Exercise 4
// Ask the user for two numbers.
// Print:
// Sum = ___

    System.out.println("Enter num1: ");
<<<<<<< HEAD
    System.out.println("Enter num2: ");

    int num1 = scanner.nextInt();scanner.nextLine();
=======
    int num1 = scanner.nextInt();
    System.out.println("Enter num2: ");
>>>>>>> 7cd9aebafe6b70fb5315c7743fd462ec9feba14e
    int num2 = scanner.nextInt();

    System.out.println("Sum = " + (num1 + num2));
    }
    
}
