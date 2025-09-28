class ArithmeticOperations {
    // Instance variables
    int num1, num2;

    // Constructor to initialize values
    ArithmeticOperations(int a, int b) {
        num1 = a;
        num2 = b;
    }

    // Methods for arithmetic operations
    void addition() {
        System.out.println("Addition: " + (num1 + num2));
    }

    void subtraction() {
        System.out.println("Subtraction: " + (num1 - num2));
    }

    void multiplication() {
        System.out.println("Multiplication: " + (num1 * num2));
    }

    void division() {
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Division: Cannot divide by zero!");
        }
    }

    void modulus() {
        if (num2 != 0) {
            System.out.println("Modulus: " + (num1 % num2));
        } else {
            System.out.println("Modulus: Cannot divide by zero!");
        }
    }

    public static void main(String[] args) {
        // Check if two arguments are passed
        if (args.length < 2) {
            System.out.println("Please provide 2 integers as command line arguments.");
            return;
        }

        // Convert command line arguments from String → int
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // Create object
        ArithmeticOperations obj = new ArithmeticOperations(a, b);

        // Call methods
        obj.addition();
        obj.subtraction();
        obj.multiplication();
        obj.division();
        obj.modulus();
    }
}


// for the execution 
// javac ArithmeticOperations.java
// java ArithmeticOperations 20 10
