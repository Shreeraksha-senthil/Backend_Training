package Day_01;

import java.util.Scanner;

public class Arithmetic_operators {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a= s.nextInt();
        int b= s.nextInt();
        int add=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        int mod=a%b;
        System.out.println("Addition:"+add);
        System.out.println("Subtraction:"+sub);
        System.out.println("Multiplication:"+mul);
        System.out.println("Division:"+div);
        System.out.println("Modulus:"+mod);
    }
}
