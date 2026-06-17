// Q77 -- Write a program to Multiply matrices

import java.util.Scanner;

public class question77 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input rows and columns of first matrix
        System.out.print("Enter rows of first matrix: ");
        int r1 = sc.nextInt();

        System.out.print("Enter columns of first matrix: ");
        int c1 = sc.nextInt();

        // Input rows and columns of second matrix
        System.out.print("Enter rows of second matrix: ");
        int r2 = sc.nextInt();

        System.out.print("Enter columns of second matrix: ");
        int c2 = sc.nextInt();


        // Matrix multiplication possible only when c1 == r2
        if(c1 != r2){
            System.out.println("Matrix multiplication not possible.");
            return;
        }

        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        int product[][] = new int[r1][c2];

        //input first matrix
        System.out.println("Enter first matrix:");
        for(int i=0; i<r1; ++i){
            for(int j=0; j<c1; ++j){
                a[i][j] = sc.nextInt();
            }
        }

        //input second matrix
        System.out.println("Enter second matrix:");
        for(int i=0; i<r2; ++i){
            for(int j=0; j<c2; ++j){
                b[i][j] = sc.nextInt();
            }
        }

        //matrix multiplication
        for(int i=0; i<r1; ++i){
            for(int j=0; j<c2; ++j){
                for(int k=0; k<c1; ++k){
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        //print product matrix
        System.out.println("Product Matrix:");
        for(int i=0; i<r1; ++i){
            for(int j=0; j<c2; ++j){
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}