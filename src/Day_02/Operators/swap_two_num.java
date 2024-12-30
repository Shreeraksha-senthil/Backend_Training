package Day_02.Operators;

import java.util.Scanner;

public class swap_two_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a=a^b;
        b=b^a;
        a=a^b;
        System.out.println("Value of a after swap :" +a);
        System.out.println("Value of b after swap :" +b);
    }
}
