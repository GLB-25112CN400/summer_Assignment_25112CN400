//Question 25-- Write a program to Recursive factorial. 

import java.util.Scanner;

public class question25{
    public static void main(String[] args) {
        int n;

        //Input number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();
        
        //printing factorial
        System.out.println("Factorial of entered number is: "+factorial(n)); 
    }

    //calculating factorial recursively
    public static int factorial(int n) {
        if (n==0) return 1;
        // int fnm1=factorial(n-1);
        int fn=n*factorial(n-1); 
        return fn;

    }
}