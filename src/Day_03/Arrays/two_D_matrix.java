package Day_03.Arrays;

import java.util.Scanner;

public class two_D_matrix {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int rows=s.nextInt();
        int columns=s.nextInt();
        int[][] mat1 = new int[rows][columns];
        int[][] mat2 = new int[rows][columns];
        int[][] result = new int[rows][columns];
        //getting values for matrix1
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                mat1[i][j]=s.nextInt();
            }
        }
        //getting values for matrix2
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                mat2[i][j]=s.nextInt();
            }
        }
        //sum of 2d matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        //print output
        System.out.println();
        System.out.println("Sum of matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}