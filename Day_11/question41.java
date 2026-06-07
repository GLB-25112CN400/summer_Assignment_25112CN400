// Question 41 -- WAP to Write Function to Find Sum of Two Numbers

import java.util.Scanner;

public class question41 {

    public static void main(String[] args) {

        int num1, num2;

        //Input numbers
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        //printing sum
        System.out.println("Sum = " + sum(num1, num2));
    }

    //function to find sum
    public static int sum(int a, int b) {
        return a + b;
    }
}