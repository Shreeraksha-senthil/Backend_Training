package Day_02.Program_Control;

import java.util.Scanner;

public class Print_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=n1;i<=n2;i++)
        {
            if(i%5==0)
            {
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
