import java.util.Scanner;
public class Taking_Input {
    public static void main (String[] args) {
        System.out.println("taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");

        // float fl = sc.nextFloat();
        // System.out.println("enter number 3");

        // float fl = sc.next();
        // System.out.println("enter number 3");
        
        int a = sc.nextInt();
        System.out.println("enter number 2");

        int b = sc.nextInt();
        int sum = a + b;

        System.out.println("this sum os these number is");
        System.out.println(sum);
    }
}