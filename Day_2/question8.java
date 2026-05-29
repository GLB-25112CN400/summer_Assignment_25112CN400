//Question 8-- WAP to check whether a number is palindrome

import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        int n,rev=0;

        //Input number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        n=sc.nextInt();    

        int temp=n;

        //finding reverse
        while(temp>0){
            int lastdigit=temp%10;
            rev=(rev*10)+lastdigit;
            temp/=10;
        }

        //checking if number==reverse  (palindrome)
        if(n==rev){
            System.out.println("Number is a palindrome");
        }
        else{
            System.out.println("Number is not a palindrome");
        }
    }
}
