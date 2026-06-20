// Question 96 -- WAP to Remove Duplicate Characters from a String

import java.util.Scanner;

public class question96 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        boolean visited[] = new boolean[256];

        String ans = "";
        for(int i = 0; i < str.length(); ++i){
            char ch = str.charAt(i);

            if(visited[ch] == false){
                ans += ch;
                visited[ch] = true;
            }
        }

        System.out.println("String after removing duplicates: " + ans);
    }
}