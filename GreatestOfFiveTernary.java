import java.util.Scanner;

class GreatestOfFiveTernary {
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

        // Use nested ternary operator
        int greatest = (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) ? num1 :
                       (num2 > num3 && num2 > num4 && num2 > num5) ? num2 :
                       (num3 > num4 && num3 > num5) ? num3 :
                       (num4 > num5) ? num4 : num5;

        // Print result
        System.out.println("The greatest number is: " + greatest);

        sc.close();
    }
}
