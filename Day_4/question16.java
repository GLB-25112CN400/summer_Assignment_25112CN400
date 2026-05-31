//Question 16-- WAP to print Armstrong numbers in a range

import java.util.Scanner;

public class question16 {
    public static void main(String[] args) {

        int start, end;

        // Input range (Starting number, ending number)
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        start = sc.nextInt();

        System.out.print("Enter ending number: ");
        end = sc.nextInt();

        // Printing Armstrong numbers in the range
        System.out.println("Armstrong numbers are:");

        for(int n = start; n <= end; n++) {

            int sum = 0;
            int temp = n;
            int count = 0;

            // Count digits
            while(temp > 0) {
                count++;
                temp /= 10;
            }

            temp = n;

            // Calculate sum
            while(temp > 0) {

                int digit = temp % 10;

                sum += Math.pow(digit, count);

                temp /= 10;
            }

            // Check Armstrong number
            if(sum == n) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}