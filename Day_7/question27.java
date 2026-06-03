//Question 27-- WAP to find Recursive sum of digits 

import java.util.Scanner;

public class question27 {
    public static void main(String[] args) {

        int n;

        //Input number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();

        //printing sum of digits
        System.out.println("Sum of digits is: " + sumOfDigits(n));
    }

    //calculating sum of digits recursively
    public static int sumOfDigits(int n) {

        if(n == 0) {
            return 0;
        }

        return (n % 10) + sumOfDigits(n / 10);
    }
}