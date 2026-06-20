// Question 94 -- WAP to Compress a String

import java.util.Scanner;

public class question94 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Input string
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        String ans = "";
        int count = 1;

        for(int i = 1; i < str.length(); ++i){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }
            else{
                ans += str.charAt(i-1);
                ans += count;   
                count = 1;
            }
        }

        ans += str.charAt(str.length()-1);
        ans += count;

        System.out.println("Compressed string: " + ans);
    }
}