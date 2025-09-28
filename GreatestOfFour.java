class GreatestOfFour {
    public static void main(String[] args) {
        // Check if exactly 4 arguments are provided
        if (args.length < 4) {
            System.out.println("Please provide 4 integers as command line arguments.");
            return;
        }

        // Convert command line arguments (String → int)
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int num4 = Integer.parseInt(args[3]);

        // Find greatest using nested ternary operator
        int greatest = (num1 > num2) 
                        ? (num1 > num3 
                            ? (num1 > num4 ? num1 : num4) 
                            : (num3 > num4 ? num3 : num4)) 
                        : (num2 > num3 
                            ? (num2 > num4 ? num2 : num4) 
                            : (num3 > num4 ? num3 : num4));
 
        // Print the result
        System.out.println("The greatest number is: " + greatest);
    }
}
