import static java.lang.Math.*;
import java.util.Scanner;

public class Task9 {

    public static int add(int a, int b) {
        return Math.addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return Math.subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return Math.floorDiv(a, b);
    }

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int a = s.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = s.nextInt();
        
        System.out.println("Math Operations Results:");
        System.out.println("Numbers: " + a + " and " + b);
        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));
        s.close();
    }
}