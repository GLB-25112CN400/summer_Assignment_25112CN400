//Question 21-- WAP to convert decimal to binary

import java.util.Scanner;

public class question21 {
    public static void main(String[] args) {

        int n;

        //Input decimal number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        n = sc.nextInt();

        int bin = 0;
        int place = 1;

        //converting decimal to binary
        while(n > 0) {

            int rem = n % 2;

            bin += rem * place;

            place *= 10;
            n /= 2;
        }

        //printing binary number
        System.out.println("Binary number is: " + bin);
    }
}