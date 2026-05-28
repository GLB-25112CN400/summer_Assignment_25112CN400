//Question 3 -- Write a program to find factorial of a number.

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        int n,fact=1;   

        //Input number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        n=sc.nextInt();       

        //Calculating Factorial
        for(int i=n;i>=1;--i){
            fact*=i;
        }

        System.out.println("Factorial of "+n+" = "+fact);

    }
}
