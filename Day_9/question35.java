// Question 35 -- WAP to Print Repeated Character Pattern

import java.util.Scanner;

public class question35 {
    public static void main(String[] args) {

        int n;

        //Input number of rows
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        n = sc.nextInt();

        //printing pattern
        for(int i = 1; i <= n; ++i) {

            for(int j = 1; j <= i; ++j) {
                System.out.print((char)(64 + i));
            }

            System.out.println();
        }
    }
}