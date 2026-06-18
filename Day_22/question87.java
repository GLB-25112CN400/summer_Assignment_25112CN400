// Question 87 -- WAP to Compare Two Strings

import java.util.Scanner;

public class question87 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Input first string
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        //Input second string
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        boolean same = true;

        if(str1.length()!=str2.length()){
            same = false;
        }
        else{
            for(int i=0; i<str1.length(); ++i){
                if(str1.charAt(i)!=str2.charAt(i)){
                    same = false;
                    break;
                }
            }
        }

        if(same){
            System.out.println("Strings are Equal");
        }
        else{
            System.out.println("Strings are Not Equal");
        }
    }
}