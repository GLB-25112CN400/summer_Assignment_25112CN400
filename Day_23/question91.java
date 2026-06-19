// Question 91 - WAP to Check Anagram Strings

import java.util.Scanner;

public class question91 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Input first string
        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();

        //Input second string
        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        if(str1.length()!=str2.length()){
            System.out.println("Not Anagram");
            return;
        }

        int freq[] = new int[256];

        for(int i=0; i<str1.length(); ++i){
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }

        for(int i=0; i<256; ++i){
            if(freq[i]!=0){
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Anagram");
    }
}