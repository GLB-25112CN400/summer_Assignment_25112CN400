// Question 42 -- WAP to Write Function to Find Maximum

import java.util.Scanner;

public class question42 {
    public static void main(String[] args) {

        int num1, num2;

        //Input numbers
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        //printing max
        System.out.println("Maximum Number = " + maximum(num1, num2));
    }
    //function to find maximum
    public static int maximum(int a, int b) {
        if(a > b) {
            return a;
        }

        return b;
    }

}