//Question 18-- WAP to check Strong Number

import java.util.Scanner;

public class question18 {
    public static void main(String[] args) {

        int n;

        //Input number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();

        int sum = 0;
        int temp = n;

        //finding sum of factorials of digits
        while(temp > 0) {

            int digit = temp % 10;

            int fact = 1;
            for(int i = 1; i <= digit; ++i) {
                fact *= i;
            }

            sum += fact;

            temp /= 10;
        }

        //Checking Strong Number
        if(sum == n) {
            System.out.println("Entered Number is a Strong Number");
        }
        else {
            System.out.println("Entered Number is not a Strong Number");
        }
    }
}