// Question 48 -- WAP to Write Function for Perfect Number

import java.util.Scanner;

public class question48 {
    public static void main(String[] args) {
        int n;

        //Input no.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();

        //checking Perfect Number
        if(isPerfect(n)) {
            System.out.println("Entered Number is a Perfect Number");
        }
        else {
            System.out.println("Entered Number is not a Perfect Number");
        }
    }

    //function to check Perfect Number
    public static boolean isPerfect(int n) {

        int sum = 0;
        for(int i = 1; i <= (n / 2); ++i) {

            if(n % i == 0) {
                sum += i;
            }
        }

        if(sum==n) return true;
        else return false;
    }
}