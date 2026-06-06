// Question 38 -- Reverse Star Pyramid

import java.util.Scanner;

public class question38 {
    public static void main(String[] args) {

        int n;

        //Input no. of rows
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        n = sc.nextInt();

        //printing pattern
        for(int i = n; i >= 1; --i) {
            for(int j = 1; j <= n + i - 1; ++j) {

                if(j >= n - i + 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}