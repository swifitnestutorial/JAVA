import java.util.Scanner; // For console input

class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        // Find the greatest using nested conditional (ternary) operator
        int greatest = (num1 > num2) 
                        ? (num1 > num3 ? num1 : num3) 
                        : (num2 > num3 ? num2 : num3);

        // Print the greatest number
        System.out.println("The greatest number is: " + greatest);

        sc.close();
    }
}
