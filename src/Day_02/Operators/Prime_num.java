package Day_02.Operators;

import java.util.Scanner;

public class Prime_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println("Not Prime");
            return;
        }
        boolean res=false;
        for (int i = 2; i <=Math.sqrt(num); i++) {
            if (num % i == 0) {
                res=true;
                break;
            }
        }
        if(!res)
        {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}
