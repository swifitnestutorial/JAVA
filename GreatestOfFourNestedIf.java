import java.util.Scanner;

class GreatestOfFourNestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 4 numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        System.out.print("Enter fourth number: ");
        int num4 = sc.nextInt();

        int greatest;

        // Nested if logic
        if (num1 > num2) {
            if (num1 > num3) {
                if (num1 > num4) {
                    greatest = num1;
                } else {
                    greatest = num4;
                }
            } else {
                if (num3 > num4) {
                    greatest = num3;
                } else {
                    greatest = num4;
                }
            }
        } else {
            if (num2 > num3) {
                if (num2 > num4) {
                    greatest = num2;
                } else {
                    greatest = num4;
                }
            } else {
                if (num3 > num4) {
                    greatest = num3;
                } else {
                    greatest = num4;
                }
            }
        }

        // Print result
        System.out.println("The greatest number is: " + greatest);

        sc.close();
    }
}
