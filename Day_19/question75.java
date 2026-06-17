// Question 75 -- Write a program to Transpose matrix

import java.util.Scanner;

public class question75 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];   //matrix for transpose

        //input matrix
        System.out.println("Enter matrix: ");
        for(int i=0; i<rows; ++i){
            for(int j=0; j<cols; ++j){
                matrix[i][j] = sc.nextInt();
            }
        }

        //Transpose    //row--> cols , col--> rows
        System.out.println("Transpose Matrix: ");
        for(int j=0; j<cols; ++j){
            for(int i=0; i<rows; ++i){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}