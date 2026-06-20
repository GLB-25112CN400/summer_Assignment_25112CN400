// Question 93 -- WAP to Check String Rotation

import java.util.Scanner;

public class question93 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Input first string
        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();

        // Input second string
        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        if(str1.length() != str2.length()){
            System.out.println("No rotation");
            return;
        }

        String temp = str1 + str1;

        if(temp.contains(str2)){
            System.out.println("Rotated string");
        }
        else{
            System.out.println("No rotation");
        }
    }
}