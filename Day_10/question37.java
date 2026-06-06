// Question 37 -- WAP to Print Star Pyramid

import java.util.Scanner;

public class question37 {
    public static void main(String[] args) {

        int n;

        //Input no. of rows
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        n = sc.nextInt();

        //printing pattern
        for(int i = 1; i <= n; ++i) {
            for(int j=1;j<=n+i-1;j++){
                if(j>=n+1-i) {
                    System.out.print("*");
                }  
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}