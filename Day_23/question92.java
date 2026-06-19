// Question 92 - WAP to Find Maximum Occurring Character

import java.util.Scanner;

public class question92 {
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

        int maxFreq = 0;
        char ans = ' ';

        //find maximum occurring character
        for(int i=0; i<str.length(); ++i){
            if(freq[str.charAt(i)] > maxFreq){
                maxFreq = freq[str.charAt(i)];
                ans = str.charAt(i);
            }
        }

        System.out.println("maximum Occurring Character: " + ans);
        System.out.println("frequency: " + maxFreq);
    }
}