// Question 83 -- WAP to Count Vowels and Consonants

import java.util.Scanner;

public class question83 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();  //to avoid miscalculation due to different capitalised letters

        int vow = 0;
        int cons = 0;

        //traverse string
        for(int i=0; i<str.length(); ++i){
            char ch = str.charAt(i);

            //check alphabet
            if(ch>='a' && ch<='z'){

                //check vowels
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vow++;
                }
                else{
                    cons++;
                }
            }
        }

        System.out.println("Vowels = " + vow);
        System.out.println("Consonants = " + cons);
    }
}