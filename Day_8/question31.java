// Question 31 -- WAP to Print Character Triangle

import java.util.Scanner;

public class question31 {
    public static void main(String[] args) {

        int n;

        //Input no. of rows
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        n = sc.nextInt();

        //printing pattern
        for(int i = 1; i <= n; ++i) {

            for(int j = 1; j <= i; ++j) {
                System.out.print((char)(64+j));
            }

            System.out.println();
        }
    }
}