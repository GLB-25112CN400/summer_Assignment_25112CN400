// Question 78 -- Write a program to Check symmetric matrix

import java.util.Scanner;

public class question78 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Input size of square matrix
        System.out.print("Enter size of matrix: ");
        int n = sc.nextInt();

        int matrix[][] = new int[n][n];

        //input matrix
        System.out.println("Enter matrix: ");
        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean symmetric = true;

        // Check if symmetrical or not
        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                if(matrix[i][j] != matrix[j][i]){
                    symmetric = false;
                    break;
                }
            }

            if(symmetric==false){
                break;
            }
        }

        if(symmetric){
            System.out.println("Matrix is symmetric");
        }
        else{
            System.out.println("Matrix is not symmetric");
        }
    }
}