package Day_01;

import java.util.Scanner;

public class Logical_operators {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(a>b){
            System.out.println(a+"Greater than "+b);
        }
        else{
            System.out.println(a+" Smaller than "+b);
        }
    }
}
