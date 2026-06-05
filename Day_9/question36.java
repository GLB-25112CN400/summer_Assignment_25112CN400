// Question 36 -- WAP to Print Hollow Square Pattern

import java.util.Scanner;

public class question36 {
    public static void main(String[] args) {

        int n;

        //Input size
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square: ");
        n = sc.nextInt();

        //printing pattern
        for(int i = 1; i <= n; ++i) {

            for(int j = 1; j <= n; ++j) {

                if(i == 1 || i == n || j == 1 || j == n) {
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