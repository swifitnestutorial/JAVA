import java.util.Scanner;

class GreatestOfFiveNestedIf {
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

        int greatest;

        // Nested if logic
        if (num1 > num2) {
            if (num1 > num3) {
                if (num1 > num4) {
                    if (num1 > num5) {
                        greatest = num1;
                    } else {
                        greatest = num5;
                    }
                } else {
                    if (num4 > num5) {
                        greatest = num4;
                    } else {
                        greatest = num5;
                    }
                }
            } else {
                if (num3 > num4) {
                    if (num3 > num5) {
                        greatest = num3;
                    } else {
                        greatest = num5;
                    }
                } else {
                    if (num4 > num5) {
                        greatest = num4;
                    } else {
                        greatest = num5;
                    }
                }
            }
        } else {
            if (num2 > num3) {
                if (num2 > num4) {
                    if (num2 > num5) {
                        greatest = num2;
                    } else {
                        greatest = num5;
                    }
                } else {
                    if (num4 > num5) {
                        greatest = num4;
                    } else {
                        greatest = num5;
                    }
                }
            } else {
                if (num3 > num4) {
                    if (num3 > num5) {
                        greatest = num3;
                    } else {
                        greatest = num5;
                    }
                } else {
                    if (num4 > num5) {
                        greatest = num4;
                    } else {
                        greatest = num5;
                    }
                }
            }
        }

        // Output
        System.out.println("The greatest number is: " + greatest);

        sc.close();
    }
}
