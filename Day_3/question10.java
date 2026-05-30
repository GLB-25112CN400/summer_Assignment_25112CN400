//Question 10-- WAP to print prime numbers in a range

import java.util.Scanner;
public class question10 {
    public static void main(String[] args) {
        int start,end;

        //Input range (Starting number, ending number)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        start = sc.nextInt();

        System.out.print("Enter ending number: ");
        end = sc.nextInt();


        //Printing Prime numbers in the range
        System.out.println("Prime numbers are:");

        for(int n = start; n <= end; n++) {

            if(n < 2) {
                continue;
            }

            boolean isPrime = true;

            for(int i = 2; i <= Math.sqrt(n); i++) {     //Checking for each number in the range whether it's prime or not

                if(n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.print(n + " ");
            }
        }
    }
}
