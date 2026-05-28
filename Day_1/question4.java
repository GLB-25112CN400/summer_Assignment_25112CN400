//Question 4-- Write a program to Count digits in a number. 

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        int n,count=0;

        //Input number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        n=sc.nextInt();       

        //Count digits
        while(n>0){
            count++;
            n/=10;
        }

        System.out.println("No. of digits = "+count);
    }
}
