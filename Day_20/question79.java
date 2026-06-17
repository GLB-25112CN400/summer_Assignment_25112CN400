// Q79 -- Write a program to Find row-wise sum

import java.util.Scanner;

public class question79 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        //input matrix
        System.out.println("Enter matrix:");
        for(int i=0; i<rows; ++i){
            for(int j=0; j<cols; ++j){
                matrix[i][j] = sc.nextInt();
            }
        }

        //row-wise sum
        for(int i=0; i<rows; ++i){
            int sum = 0;

            for(int j=0; j<cols; ++j){
                sum += matrix[i][j];
            }

            System.out.println("Sum of Row " + (i+1) + " = " + sum);
        }
    }
}