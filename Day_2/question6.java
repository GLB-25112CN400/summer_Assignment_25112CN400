//Question 6-- WAP to reverse a number

import java.util.Scanner;

public class question6 {
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

        System.out.println("Reverse of "+n+" = "+rev);
    }
}
