package Day_02.Program_Control;

import java.util.Scanner;

public class Exit_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0)
            {
                break;
            }
            System.out.print(arr[i]+" ");
        }
    }
}