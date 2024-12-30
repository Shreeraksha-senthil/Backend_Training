package Day_01;

import java.util.Scanner;

public class Bitwise_operator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int ls = a << 2;
        int rs = a >> 2;
        int xor = a ^ b;
        System.out.println("Leftshift: " + ls);
        System.out.println("Rightshift: " + rs);
        System.out.println("xor: " + xor);
    }
}
