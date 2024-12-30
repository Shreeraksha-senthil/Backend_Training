package Day_02.Operators;

import java.util.Scanner;

public class largest_three_num {
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int max = a > b ? a : b;
    max = c > max ? c : max;
    System.out.println("Maximum : " +max);
}
