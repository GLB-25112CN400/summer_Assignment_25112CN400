// Question 47 -- WAP to Write Function for Fibonacci

import java.util.Scanner;

public class question47 {
    public static void main(String[] args) {
        int n;

        //Input term no.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter term number: ");
        n = sc.nextInt();

        //print nth fibonacci
        System.out.println("Nth Fibonacci Term is: " + fibonacci(n));
    }

    //function to find nth fibonacci term
    public static int fibonacci(int n) {

        int term1 = 0;
        int term2 = 1;

        if(n == 1) return term1;
        if(n == 2) return term2;

        for(int i = 3; i <= n; ++i) {
            int term3 = term1 + term2;
            term1 = term2;
            term2 = term3;
        }

        return term2;   //term2=term3
    }
}