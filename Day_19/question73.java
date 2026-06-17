// Question 73 -- Write a program to Add matrices

import java.util.Scanner;

public class question73 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        //matrices
        int a[][] = new int[rows][cols];
        int b[][] = new int[rows][cols];

        //input first matrix
        System.out.println("Enter first matrix: ");
        for(int i=0; i<rows; ++i){
            for(int j=0; j<cols; ++j){
                a[i][j] = sc.nextInt();
            }
        }

        //input second matrix
        System.out.println("Enter second matrix: ");
        for(int i=0; i<rows; ++i){
            for(int j=0; j<cols; ++j){
                b[i][j] = sc.nextInt();
            }
        }

        //addition of matrices
        System.out.println("Sum Matrix:");
        for(int i=0; i<rows; ++i){
            for(int j=0; j<cols; ++j){
                System.out.print((a[i][j] + b[i][j]) + " ");
            }
            System.out.println();
        }
    }
}