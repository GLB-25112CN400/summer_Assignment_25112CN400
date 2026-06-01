//Question 17-- WAP to check Perfect Number

import java.util.Scanner;

public class question17 {
    public static void main(String[] args) {

        int n, sum = 0;

        //Input number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();

        //finding sum of proper divisors
        for(int i = 1; i <= (n/2); ++i) {

            if(n % i == 0) {
                sum += i;
            }
        }

        //Checking Perfect Number
        if(sum == n) {
            System.out.println("Entered Number is a Perfect Number");
        }
        else {
            System.out.println("Entered Number is not a Perfect Number");
        }
    }
}