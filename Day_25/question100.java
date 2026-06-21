// Question 100 -- WAP to Sort Words by Length

import java.util.Scanner;

public class question100 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Input sentence
        System.out.print("Input sentence: ");
        String str = sc.nextLine();

        String words[] = str.split(" ");

        //Bubble Sort according to word length
        for(int i = 0; i < words.length - 1; ++i){
            for(int j = 0; j < words.length - 1 - i; ++j){

                if(words[j].length() > words[j + 1].length()){
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        System.out.println("Words Sorted by Length:");
        for(String word : words){
            System.out.print(word + " ");
        }
    }
}