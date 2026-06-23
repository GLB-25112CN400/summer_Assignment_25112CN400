// Question 104 -- WAP to Create Quiz Application

import java.util.Scanner;

public class question104 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("Q1. Capital of Australia?");
        System.out.println("1. Sydney");
        System.out.println("2. Canberra");
        System.out.println("3. Melbourne");

        int ans = sc.nextInt();
        if(ans == 2){
            score++;
        }


        System.out.println("\nQ2. 67+49 = ?");
        System.out.println("1. 115");
        System.out.println("2. 123");
        System.out.println("3. 113");

        ans = sc.nextInt();
        if(ans == 3){
            score++;
        }


        System.out.println("\nQ3. Java is a ?");
        System.out.println("1. Programming Language");
        System.out.println("2. Browser");
        System.out.println("3. Operating System");

        ans = sc.nextInt();
        if(ans == 1){
            score++;
        }


        System.out.println("\nQ4. Who is the current External Affairs Minister (Foreign Minister) of India?");
        System.out.println("1. Amit Shah");
        System.out.println("2. Rajnath Singh");
        System.out.println("3. Subrahmanyam Jaishankar");


        ans = sc.nextInt();
        if(ans ==3){
            score++;
        }

        System.out.println("\nQ6. Which country won the 2011 Cricket World Cup?");
        System.out.println("1. Australia");
        System.out.println("2. India");
        System.out.println("3. Sri Lanka");

        ans = sc.nextInt();
        if(ans ==2){
            score++;
        }


        System.out.println("\nQ6. Which currency is considered the world's primary reserve currency?");
        System.out.println("1. Euro");
        System.out.println("2. Chinese Yuan");
        System.out.println("3. US Dollar");

        ans = sc.nextInt();
        if(ans ==3){
            score++;
        }


        System.out.println("\nQ7. Which country won the FIFA World Cup 2022?");
        System.out.println("1. Argentina");
        System.out.println("2. France");
        System.out.println("3. Brazil");

        ans = sc.nextInt();
        if(ans ==1){
            score++;
        }


        System.out.println("\nFinal Score: " + score + "/7");
    }
}