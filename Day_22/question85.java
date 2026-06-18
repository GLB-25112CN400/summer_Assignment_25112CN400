// Question 85 -- WAP to Check Palindrome String

import java.util.Scanner;

public class question85 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int start = 0;
        int end = str.length()-1;

        boolean isPalindrome = true;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if(isPalindrome==true){
            System.out.println("Palindrome String");
        }
        else{
            System.out.println("Not a Palindrome String");
        }
    }
}