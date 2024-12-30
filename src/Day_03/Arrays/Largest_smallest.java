package Day_03.Arrays;

import java.util.Scanner;

public class Largest_smallest {
    public  static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Largest num:"+largest);
        System.out.println("Smallest num:"+smallest);
    }
}
