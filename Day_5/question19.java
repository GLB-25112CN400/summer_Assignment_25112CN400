//Question 19-- WAP to print factors of a number

import java.util.Scanner;

public class question19 {
    public static void main(String[] args) {

        int n;

        //Input number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();

        //printing factors
        System.out.println("Factors are:");

        for(int i = 1; i <= n; ++i) {

            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}