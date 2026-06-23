// Question 101 -- WAP to Create Number Guessing Game

import java.util.Scanner;

public class question101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secretNo = 7;

        //Input guess
        System.out.print("Input Guess: ");
        int guess = sc.nextInt();

        int attempts = 1;

        while(guess != secretNo){
            if(guess > secretNo){
                System.out.println("Too High");
            }
            else{
                System.out.println("Too Low");
            }

            //input next guess
            System.out.print("Input Guess: ");
            guess = sc.nextInt();

            attempts++;
        }

        System.out.println("Correct Guess! in attempts: "+attempts);
    }
}