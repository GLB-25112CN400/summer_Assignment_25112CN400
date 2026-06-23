// Question 102 -- WAP to Create Voting Eligibility System

import java.util.Scanner;

public class question102 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //input age
        System.out.print("Input Age: ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Eligible For Voting");
        }
        else{
            System.out.println("Not Eligible For Voting");
        }
    }
}