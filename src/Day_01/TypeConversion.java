package Day_01;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        float a=s.nextFloat();
        int b=(int)a;
        System.out.println("Before Conversion:"+a);
        System.out.println("After Conversion:"+b);
    }
}
