//Question 20-- WAP to find largest prime factor

import java.util.Scanner;

public class question20 {
    public static void main(String[] args) {

        int n, largestPrimeFactor = 1;

        //Input number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();

        //finding largest prime factor
        for(int i = 2; i <= n; ++i) {

            if(n % i == 0) {

                boolean isPrime = true;

                for(int j = 2; j <= Math.sqrt(i); ++j) {

                    if(i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if(isPrime==true) {
                    largestPrimeFactor = i;
                }
            }
        }

        System.out.println("Largest Prime Factor is: " + largestPrimeFactor);
    }
}