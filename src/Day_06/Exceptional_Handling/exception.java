package Day_06.Exceptional_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first integer: ");
            int dividend = scanner.nextInt();
            System.out.print("Enter the second integer: ");
            int divisor = scanner.nextInt();
            int result = dividend / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }
    }
}
