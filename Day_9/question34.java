// Question 34 -- WAP to Print Reverse Number Triangle

import java.util.Scanner;

public class question34 {
    public static void main(String[] args) {

        int n;

        //Input no. of rows
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        n = sc.nextInt();

        //printing pattern
        for(int i = n; i >= 1; --i) {

            for(int j = 1; j <= i; ++j) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}