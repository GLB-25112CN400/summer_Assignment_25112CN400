// Question 29 -- WAP to Print Half Pyramid Pattern

import java.util.Scanner;

public class question29 {
    public static void main(String[] args) {

        int n;

        //Input no. of rows
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        n = sc.nextInt();

        //printing pattern
        for(int i = 1; i <= n; ++i) {

            for(int j = 1; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}