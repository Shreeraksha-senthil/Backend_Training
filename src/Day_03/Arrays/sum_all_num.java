package Day_03.Arrays;

import java.util.Scanner;

public class sum_all_num {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n= s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of  all numbers: "+sum);
    }
}
