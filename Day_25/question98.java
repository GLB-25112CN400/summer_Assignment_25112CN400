// Question 98 -- WAP to Find Common Characters in Strings

import java.util.Scanner;

public class question98 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Input first string
        System.out.print("Input First String: ");
        String str1 = sc.nextLine();

        // Input second string
        System.out.print("Input Second String: ");
        String str2 = sc.nextLine();

        int freq[] = new int[256];

        for(int i = 0; i < str1.length(); ++i){
            freq[str1.charAt(i)] = 1;
        }

        System.out.print("Common Characters: ");
        for(int i = 0; i < str2.length(); ++i){
            char ch = str2.charAt(i);

            if(freq[ch] == 1){
                System.out.print(ch + " ");
                freq[ch] = 0;
            }
        }
        System.out.println();
    }
}