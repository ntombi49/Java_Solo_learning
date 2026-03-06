// Inputoutput



// 1️⃣ Java Needs a Tool for Input
// Java does not read user input automatically.

// We must use something called Scanner.

// Think of Scanner like a listener 👂
// It listens to what the user types.

// 2️⃣ Import Scanner
// At the top of your file, we write:

// import java.util.Scanner;
// This tells Java:

// "I want to use the Scanner tool."


// 3️⃣ Create the Scanner
// Inside main we create it:

// Scanner input = new Scanner(System.in);

// | Part      | Meaning                   |
// | --------- | ------------------------- |
// | Scanner   | the tool we are using     |
// | input     | the name we gave the tool |
// | System.in | listen to the keyboard    |

// 4️⃣ Reading Text (String)
// Example program:

// 4️⃣ Reading Text (String)
// Example program:

// import java.util.Scanner;

// public class InputExample {
//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);

//         System.out.println("What is your name?");

//         String name = input.nextLine();

//         System.out.println("Hello " + name);

//     }
// }

// 5️⃣ Understanding nextLine()
// This is important.

// input.nextLine()
// means:

// Read everything the user types until they press ENTER

// 6️⃣ Reading Numbers
// If we want numbers, we use different methods.

// Integer
// int age = input.nextInt();

// Double (decimal numbers)
// double height = input.nextDouble();

// | Method       | What it reads |
// | ------------ | ------------- |
// | nextLine()   | full sentence |
// | nextInt()    | integer       |
// | nextDouble() | decimal       |

