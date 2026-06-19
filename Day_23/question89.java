// Question 89 - WAP to Find First Non-Repeating Character

import java.util.Scanner;

public class question89 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Input string
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        int freq[] = new int[256];

        //freq count
        for(int i=0; i<str.length(); ++i){
            freq[str.charAt(i)]++;
        }

        //first non-repeating character
        for(int i=0; i<str.length(); ++i){
            if(freq[str.charAt(i)]==1){
                System.out.println("First Non-Repeating Character: " + str.charAt(i));
                return;
            }
        }

        System.out.println("No Non-Repeating Character Found");
    }
}