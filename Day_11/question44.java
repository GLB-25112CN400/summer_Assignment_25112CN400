// Question 44 -- WAP to Write Function to Find Factorial

import java.util.Scanner;

public class question44 {
    public static void main(String[] args) {

        int n;

        //Input no.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();

        //printing factorial
        System.out.println("Factorial = " + factorial(n));
    }

    //function to find factorial
    public static int factorial(int n) {

        int fact = 1;

        for(int i = n; i >= 1; --i) {
            fact *= i;
        }

        return fact;
    }

    
}