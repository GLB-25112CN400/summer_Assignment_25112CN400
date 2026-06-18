// Question 82 -- WAP to Reverse a String

import java.util.Scanner;

public class question82 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Reversed String: ");
        //traverse string from end to beginning
        for(int i=str.length()-1; i>=0; --i){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}