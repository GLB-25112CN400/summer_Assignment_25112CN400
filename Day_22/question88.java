// Question 88 -- WAP to Concatenate Two Strings

import java.util.Scanner;

public class question88 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Input first string
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        // Input second string
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        //concatenate
        String result = str1 + str2;

        System.out.println("Concatenated String = " + result);
    }
}