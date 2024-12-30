package Day_01;

import java.util.Scanner;

public class Ternary_operator {
        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            String result = (a % 2 == 0) ? "Even" : "Odd";
            System.out.println(result);
        }
}
