//Question 23-- WAP to count set bits in a number

import java.util.Scanner;

public class question23 {
    public static void main(String[] args) {

        int n, count = 0;

        //Input number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();

        //Counting set bits
        while(n > 0) {

            if(n % 2 == 1) {
                count++;
            }

            n /= 2;
        }

        //Printing count of set bits
        System.out.println("Number of set bits: " + count);
    }
}