class CommandLineInput {
    public static void main(String[] args) {
        // Check if user entered any arguments
        if (args.length > 0) {
            // args[0] contains the first argument entered from command line
            String input = args[0];  

            // Print the input
            System.out.println("You entered: " + input);

            // If you want to use it as a number, convert string to integer
            int number = Integer.parseInt(input);
            System.out.println("As an integer: " + number);
        } else {
            System.out.println("No arguments provided. Please enter a number.");
        }
    }
}


// the notes execution
// javac CommandLineInput.java
// java CommandLineInput 50
