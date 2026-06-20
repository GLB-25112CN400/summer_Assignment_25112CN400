// Question 95 -- WAP to Find Longest Word in a Sentence

import java.util.Scanner;

public class question95 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Input sentence
        System.out.print("Enter Sentence: ");
        String str = sc.nextLine();

        String words[] = str.split(" ");

        String longest = "";
        for(int i = 0; i < words.length; ++i){
            if(words[i].length() > longest.length()){
                longest = words[i];
            }
        }

        System.out.println("Longest word: " + longest);
    }
}