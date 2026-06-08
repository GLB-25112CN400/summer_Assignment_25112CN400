// Question 46 -- WAP to Write Function for Armstrong Number

import java.util.Scanner;

public class question46 {
    public static void main(String[] args) {
        int n;

        //Input no.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();

        //checking Armstrong
        if(isArmstrong(n)==true) {
            System.out.println("Entered Number is an Armstrong Number");
        }
        else {
            System.out.println("Entered Number is not an Armstrong Number");
        }
    }

    //function to check Armstrong
    public static boolean isArmstrong(int n) {
        int sum = 0;

        int count = 0;
        int temp = n;
        while(temp > 0){
            count++;
            temp /= 10;
        }

        temp = n;
        while(temp > 0){
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }

        if(sum==n) return true;
        else return false;
    }
}