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
        int Dig1 = s.nextInt();
        System.out.println("Enter 2nd Number: ");
        int Dig2 = s.nextInt();
        
        System.out.println("Math Operations Results:");
        System.out.println("Numbers: " + Dig1 + " and " + Dig2);
        System.out.println("Addition: " + add(Dig1, Dig2));
        System.out.println("Subtraction: " + subtract(Dig1, Dig2));
        System.out.println("Multiplication: " + multiply(Dig1, Dig2));
        System.out.println("Division: " + divide(Dig1, Dig2));
        s.close();
    }
}