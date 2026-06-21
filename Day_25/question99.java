// Question 99 -- WAP to Sort Names Alphabetically

import java.util.Scanner;

public class question99 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Input number of names
        System.out.print("Input no. of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        String names[] = new String[n];

        //Input names
        System.out.println("Input names:");
        for(int i = 0; i < n; ++i){
            names[i] = sc.nextLine();
        }

        //Bubble Sort on Strings
        for(int i = 0; i < n - 1; ++i){
            for(int j = 0; j < n - 1 - i; ++j){

                if(names[j].compareTo(names[j + 1]) > 0){
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        System.out.println("Names in Alphabetical Order:");
        for(String name : names){
            System.out.println(name);
        }
    }
}