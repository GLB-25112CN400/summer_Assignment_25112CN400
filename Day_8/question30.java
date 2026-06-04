// Question 30 -- WAP to Print Number Triangle

import java.util.Scanner;

public class question30 {
    public static void main(String[] args) {

        int n;

        //Input no. of rows
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        n = sc.nextInt();

        //printing pattern
        for(int i = 1; i <= n; ++i) {

            for(int j = 1; j <= i; ++j) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}