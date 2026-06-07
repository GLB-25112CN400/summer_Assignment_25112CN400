// Question 43 -- WAP to Write Function to Check Prime

import java.util.Scanner;

public class question43 {
    public static void main(String[] args) {

        int n;

        //Input no.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();

        //checking prime
        if(isPrime(n)) {
            System.out.println("Entered Number is a Prime Number");
        }
        else {
            System.out.println("Entered Number is not a Prime Number");
        }
    }
    //Function to check prime
    public static boolean isPrime(int n) {

        if(n < 2) { 
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); ++i) {

            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    
}