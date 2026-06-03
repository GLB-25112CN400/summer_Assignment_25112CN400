//Question 26-- Write a program to Recursive fibonacci. 

import java.util.Scanner;

public class question26{
    public static void main(String[] args) {
        int n;

        //Input number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();
        
        //printing nth fibonacci term
        System.out.println("Nth fibonacci term is: "+fibonacciRec(n)); 
    }

    //finding nth Fibonacci recursively
    public static int fibonacciRec(int n) {
        if (n==1) return 0;
        if(n==2) return 1;

        int fibo=fibonacciRec(n-1)+fibonacciRec(n-2);
        return fibo;
    }
}