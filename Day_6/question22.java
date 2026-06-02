//Question 22-- WAP to convert binary to decimal

import java.util.Scanner;

public class question22 {
    public static void main(String[] args) {

        int n;

        //Input binary number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number: ");
        n = sc.nextInt();

        int dec = 0;
        int pow = 1;

        //converting binary to decimal
        while(n > 0) {

            int digit = n % 10;

            dec += digit * pow;

            pow *= 2;
            n /= 10;
        }

        //printing decimal number
        System.out.println("Decimal number is: " + dec);
    }
}