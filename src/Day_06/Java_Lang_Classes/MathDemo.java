package Day_06.Java_Lang_Classes;

public class MathDemo {
    public static void main(String[] args) {
        double num1 = 25.0;
        double num2 = 3.0;
        double sqrt = Math.sqrt(num1);
        System.out.println("Square root of " + num1 + " is: " + sqrt);
        double power = Math.pow(num1, num2);
        System.out.println(num1 + " raised to the power of " + num2 + " is: " + power);
        double max = Math.max(num1, num2);
        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + max);
    }
}
