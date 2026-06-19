// Question 90 - WAP to Find First Repeating Character

import java.util.Scanner;

public class question90 {
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

        //first repeating character
        for(int i=0; i<str.length(); ++i){
            if(freq[str.charAt(i)]>1){
                System.out.println("First Repeating Character: " + str.charAt(i));
                return;
            }
        }

        System.out.println("No Repeating Character Found");
    }
}