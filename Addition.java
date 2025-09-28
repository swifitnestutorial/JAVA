// public class Addition {
    import java.util.Scanner;  // Import the Scanner class to read input

class Addition {
    public static void main(String[] args) {
        // Create a Scanner object to take input from console
        Scanner sc = new Scanner(System.in);

        // Asking the user to enter first number
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();  // Reads an integer

        // Asking the user to enter second number
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();  // Reads another integer

        // Perform addition
        int sum = num1 + num2;

        // Print the result
        System.out.println("The sum is: " + sum);

        // Closing the scanner
        sc.close();
    }
}

// }
