import java.util.Scanner;

class GreatestOfFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 5 numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        System.out.print("Enter fourth number: ");
        int num4 = sc.nextInt();

        System.out.print("Enter fifth number: ");
        int num5 = sc.nextInt();

        // Assume first number is greatest
        int greatest = num1;

        // Compare with others
        if (num2 > greatest) greatest = num2;
        if (num3 > greatest) greatest = num3;
        if (num4 > greatest) greatest = num4;
        if (num5 > greatest) greatest = num5;

        // Print result
        System.out.println("The greatest number is: " + greatest);

        sc.close();
    }
}
