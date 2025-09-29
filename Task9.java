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
        int num1 = s.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = s.nextInt();
        
        System.out.println("Results");
        System.out.println("Numbers: " + num1 + " and " + num2);
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
        s.close();
    }
}