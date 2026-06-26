// Question 110 -- WAP to Create Bank Account System

import java.util.Scanner;

public class question110 {
    // All static to share memory among all methods/functions
    static Scanner sc = new Scanner(System.in);

    static int accountNo[] = new int[100];
    static String name[] = new String[100];
    static double balance[] = new double[100];

    static int count = 0;

    public static void main(String[] args) {

        while(true){
            System.out.println("\n===== Bank Account System =====");
            System.out.println("1. Create account");
            System.out.println("2. View accounts");
            System.out.println("3. Search account");
            System.out.println("4. Deposit money");
            System.out.println("5. Withdraw money");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    createAccount();
                    break;

                case 2:
                    viewAccounts();
                    break;

                case 3:
                    searchAccount();
                    break;

                case 4:
                    depositMoney();
                    break;

                case 5:
                    withdrawMoney();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Create account
    static void createAccount(){
        if(count == 100){
            System.out.println("Database is full.");
            return;
        }

        System.out.print("Enter account number: ");
        int newAccount = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < count; ++i){
            if(accountNo[i] == newAccount){
                System.out.println("Account number already exists.");
                return;
            }
        }

        accountNo[count] = newAccount;

        System.out.print("Enter account holder name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter opening balance: ");
        balance[count] = sc.nextDouble();

        count++;

        System.out.println("Account created successfully.");
    }

    // View accounts
    static void viewAccounts(){
        if(count == 0){
            System.out.println("No accounts found.");
            return;
        }

        System.out.println("\n----------------------------------------------------------");
        System.out.printf("%-15s %-25s %-15s\n","Account No","Name","Balance");
        System.out.println("----------------------------------------------------------");

        for(int i = 0; i < count; ++i){
            System.out.printf("%-15d %-25s %-15.2f\n",accountNo[i], name[i], balance[i]);
        }
    }

    // Search account
    static void searchAccount(){

        System.out.print("Enter account number: ");
        int searchAcc = sc.nextInt();

        for(int i = 0; i < count; ++i){
            if(accountNo[i] == searchAcc){
                System.out.println("\nAccount found");
                System.out.println("Account number : " + accountNo[i]);
                System.out.println("Name           : " + name[i]);
                System.out.println("Balance        : " + balance[i]);

                return;
            }
        }

        System.out.println("Account not found.");
    }

    // Deposit money
    static void depositMoney(){

        System.out.print("Enter account number: ");
        int searchAcc = sc.nextInt();

        for(int i = 0; i < count; ++i){
            if(accountNo[i] == searchAcc){

                System.out.print("Enter deposit amount: ");
                double amount = sc.nextDouble();

                if(amount <= 0){
                    System.out.println("Invalid amount.");
                    return;
                }

                balance[i] += amount;

                System.out.println("Amount deposited successfully.");
                System.out.println("Updated balance : " + balance[i]);

                return;
            }
        }

        System.out.println("Account not found.");
    }

    // Withdraw money
    static void withdrawMoney(){

        System.out.print("Enter account number: ");
        int searchAcc = sc.nextInt();

        for(int i = 0; i < count; ++i){
            if(accountNo[i] == searchAcc){

                System.out.print("Enter withdrawal amount: ");
                double amount = sc.nextDouble();

                if(amount <= 0){
                    System.out.println("Invalid amount.");
                }
                else if(amount > balance[i]){
                    System.out.println("Insufficient balance.");
                }
                else{
                    balance[i] -= amount;

                    System.out.println("Amount withdrawn successfully.");
                    System.out.println("Updated balance : " + balance[i]);
                }

                return;
            }
        }

        System.out.println("Account not found.");
    }
}