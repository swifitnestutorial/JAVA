import java.util.Scanner;

class GreatestOfFive {
    
    // Method to return greater of two numbers
    static int greater(int a, int b) {
        return (a > b) ? a : b;
    }

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

        // Nested function calls
        int greatest = greater(
                            greater(
                                greater(
                                    greater(num1, num2), 
                                    num3), 
                                num4), 
                            num5);

        // Output
        System.out.println("The greatest number is: " + greatest);

        sc.close();
    }
}
