// Question 76 -- Write a program to Find diagonal sum

import java.util.Scanner;

public class question76 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Input size of square matrix  (assuming it to be square)
        System.out.print("Enter size of matrix: ");
        int n = sc.nextInt();

        int matrix[][] = new int[n][n];

        //input matrix
        System.out.println("Enter matrix:");
        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                matrix[i][j] = sc.nextInt();
            }
        }

        int diagSum = 0;
        // Primary diagonal --> matrix[i][i]
        // Secondary diagonal--> matrix[i][n-1-i]

        for(int i=0; i<n; ++i){
            //add primary diagonal
            diagSum += matrix[i][i];

            //add secondary diagonal
            if(i != n-1-i){          //to avoid double entering of center element
                diagSum += matrix[i][n-1-i];
            }
        }
        System.out.println("Diagonal Sum = " + diagSum);
    }
}