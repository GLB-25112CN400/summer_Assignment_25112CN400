// Question 81 -- WAP to find string length without strlen()

import java.util.Scanner;

public class question81 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int len = 0;
        //traverse string and know length
        for(char ch : str.toCharArray()){
            len++;
        }
        System.out.println("Length = " + len);
    }
}