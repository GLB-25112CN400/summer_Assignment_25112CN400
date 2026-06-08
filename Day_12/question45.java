// Question 45 -- WAP to Write Function for Palindrome Number

import java.util.Scanner;

public class question45 {
    public static void main(String[] args) {
        int n;

        //Input no.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();

        //checking palindrome
        if(isPalindrome(n)==true) {
            System.out.println("Entered Number is a Palindrome Number");
        }
        else {
            System.out.println("Entered Number is not a Palindrome Number");
        }
    }

    //function to check palindrome
    public static boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;

        while(temp > 0) {
            int lastdigit=temp%10;
            rev=(rev*10)+lastdigit;
            temp/=10;
        }
        if(rev==n) return true;
        else return false;
    }
}