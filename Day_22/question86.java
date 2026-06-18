// Question 86 -- WAP to Count Words in a String

import java.util.Scanner;

public class question86 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int words = 1;

        // Count spaces for as to determine no. of words
        for(int i=0; i<str.length(); ++i){
            if(str.charAt(i)==' '){
                words++;
            }
        }

        System.out.println("Total Words = " + words);
    }
}