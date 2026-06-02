//Question 24-- WAP to find x^n without using Math.pow()

import java.util.Scanner;

public class question24 {
    public static void main(String[] args) {

        int x, n;

        //Input base and exponent
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x: ");
        x = sc.nextInt();

        System.out.print("Enter value of n: ");
        n = sc.nextInt();

        int ans = 1;

        //Calculating x^n
        for(int i = 1; i <= n; ++i) {
            ans *= x;
        }

        //Printing power
        System.out.println("Value of " + x + "^" + n + " is: " + ans);
    }
}