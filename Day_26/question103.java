// Question 103 -- WAP to Create ATM Simulation

import java.util.Scanner;

public class question103 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 50000;

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        //input choice
        System.out.print("Input Choice: ");
        int choice = sc.nextInt();

        while(choice != 4){
            if(choice == 1){
                System.out.println("Balance: " + balance);
            }

            else if(choice == 2){

                // Input deposit amount
                System.out.print("Input Deposit Amount: ");
                int amount = sc.nextInt();
                balance += amount;

                System.out.println("Updated Balance: " + balance);
            }

            else if(choice == 3){

                // Input withdraw amount
                System.out.print("Input Withdraw Amount: ");
                int amount = sc.nextInt();

                if(amount <= balance){
                    balance -= amount;
                    System.out.println("Updated Balance: " + balance);
                }
                else{
                    System.out.println("Insufficient Balance");
                }
            }

            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            //Input choice again
            System.out.print("Input Choice: ");
            choice = sc.nextInt();
        }

        System.out.println("Thank You! ");
    }
}