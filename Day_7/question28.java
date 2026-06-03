//Question 28-- WAP to recursive reverse a number 

import java.util.Scanner;

public class question28 {

    static int reverse = 0;

    public static void main(String[] args) {

        int n;

        //Input number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();

        reverseNo(n);

        //Printing reversed number
        System.out.println("Reversed number is: " + reverse);
    }

    //reversing number recursively
    public static void reverseNo(int n) {

        if(n == 0) {
            return;
        }

        reverse = reverse * 10 + (n % 10);

        reverseNo(n / 10);
    }
}