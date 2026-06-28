//q120 -- Mini Project

//Project : Ledgora
//Banking Management System


import java.util.Scanner;

public class MiniProject_Ledgora {

    static Scanner sc = new Scanner(System.in);

    //Account Details

    static int accountNo[] = new int[100];
    static String holderName[] = new String[100];
    static String accountType[] = new String[100];

    static String mobile[] = new String[100];
    static String aadhaar[] = new String[100];

    static int pin[] = new int[100];

    static double balance[] = new double[100];

    static boolean blocked[] = new boolean[100];

    static String remarks[] = new String[100];

    static String lastTransaction[] = new String[100];
    static double lastAmount[] = new double[100];

    static int count = 0;

    //Admin
    static int adminPin = 4231;

    
    public static void main(String[] args) {

        while (true) {
            System.out.println("\n==========================================================");
            System.out.println("                    LEDGORA");
            System.out.println("             Banking Management System");
            System.out.println("==========================================================");

            System.out.println("1. Admin login");
            System.out.println("2. Customer login");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    adminLogin();
                    break;

                case 2:
                    customerLogin();
                    break;

                case 3:
                    System.out.println("Thank you for using Ledgora.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Admin login
    static void adminLogin() {
        System.out.print("Enter admin PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == adminPin) {
            System.out.println("Login successful.");
            adminMenu();
        }
        else {
            System.out.println("Incorrect admin PIN.");
        }
    }

    // Customer login
    static void customerLogin() {
        if (count == 0) {
            System.out.println("No accounts found.");
            return;
        }

        System.out.print("Enter account number: ");
        int searchAccount = sc.nextInt();

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        for (int i = 0; i < count; ++i) {
            if (accountNo[i] == searchAccount) {

                if (blocked[i]) {
                    System.out.println("Account is blocked.");
                    return;
                }

                if (pin[i] != enteredPin) {
                    System.out.println("Incorrect PIN.");
                    return;
                }

                System.out.println("\nWelcome " + holderName[i] + "!");
                customerMenu(i);

                return;
            }
        }

        System.out.println("Account not found.");
    }

    // Admin menu
    static void adminMenu() {

        while (true) {
            System.out.println("\n================ Admin Menu ================");

            System.out.println("1. Create account");
            System.out.println("2. View accounts");
            System.out.println("3. Search account");
            System.out.println("4. Update account");
            System.out.println("5. Delete account");
            System.out.println("6. Block account");
            System.out.println("7. Unblock account");
            System.out.println("8. Reports");
            System.out.println("9. Change admin PIN");
            System.out.println("10. Logout");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    createAccount();
                    break;

                case 2:
                    viewAccounts();
                    break;

                case 3:
                    searchMenu();
                    break;

                case 4:
                    updateAccount();
                    break;

                case 5:
                    deleteAccount();
                    break;

                case 6:
                    blockAccount();
                    break;

                case 7:
                    unblockAccount();
                    break;

                case 8:
                    reportsMenu();
                    break;

                case 9:
                    changeAdminPin();
                    break;

                case 10:
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Customer menu

    static void customerMenu(int index) {

        while (true) {
            System.out.println("\n============== Customer Menu ==============");

            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer money");
            System.out.println("4. Check balance");
            System.out.println("5. View last transaction");
            System.out.println("6. Calculate yearly interest");
            System.out.println("7. Change PIN");
            System.out.println("8. Logout");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    deposit(index);
                    break;

                case 2:
                    withdraw(index);
                    break;

                case 3:
                    transfer(index);
                    break;

                case 4:
                    checkBalance(index);
                    break;

                case 5:
                    viewLastTransaction(index);
                    break;

                case 6:
                    calculateInterest(index);
                    break;

                case 7:
                    changeCustomerPin(index);
                    break;

                case 8:
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }


    // Create account

    static void createAccount() {
        if (count == 100) {
            System.out.println("Bank database is full.");
            return;
        }

        // Account No.
        System.out.print("Enter account number: ");
        int newAccount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; ++i) {
            if (accountNo[i] == newAccount) {
                System.out.println("Account number already exists.");
                return;
            }
        }

        accountNo[count] = newAccount;

        // Holder name
        System.out.print("Enter account holder name: ");
        holderName[count] = sc.nextLine();

        // Account type
        while (true) {
            System.out.print("Enter account type (Savings/Current): ");
            String type = sc.nextLine();

            if (type.equalsIgnoreCase("Savings") ||
                type.equalsIgnoreCase("Current")) {

                accountType[count] = type;
                break;
            }

            System.out.println("Invalid account type.");
        }

        // Mobile number
        while (true) {
            System.out.print("Enter mobile number: ");
            String mob = sc.nextLine();

            if (mob.length() == 10) {
                mobile[count] = mob;
                break;
            }

            System.out.println("Mobile number must contain exactly 10 digits.");
        }

        // Aadhaar number
        while (true) {

            System.out.print("Enter Aadhaar number: ");
            String ad = sc.nextLine();

            if (ad.length() == 12) {
                aadhaar[count] = ad;
                break;
            }

            System.out.println("Aadhaar number must contain exactly 12 digits.");
        }

        // Customer PIN
        while (true) {

            System.out.print("Create 4-digit PIN: ");
            int newPin = sc.nextInt();

            if (newPin >= 1000 && newPin <= 9999) {
                pin[count] = newPin;
                break;
            }

            System.out.println("PIN must be exactly 4 digits.");
        }

        // Initial deposit
        while (true) {

            System.out.print("Enter initial deposit: ");
            double amount = sc.nextDouble();

            if (amount < 500) {
                System.out.println("Minimum opening balance is ₹500.");
            }
            else {
                balance[count] = amount;
                break;
            }
        }

        blocked[count] = false;
        remarks[count] = "-";
        lastTransaction[count] = "Account created";
        lastAmount[count] = balance[count];

        count++;
        System.out.println("\n==========================================");
        System.out.println("Account created successfully.");
        System.out.println("Welcome to Ledgora!");
        System.out.println("==========================================");
    }

    // View all accounts

    static void viewAccounts() {
        if (count == 0) {
            System.out.println("No accounts found.");
            return;
        }

        System.out.println("\n---------------------------------------------------------------------------------------------------------------");

        System.out.printf("%-10s %-20s %-12s %-15s %-15s %-12s\n","Acc No","Holder","Type","Mobile","Balance","Status");

        System.out.println("---------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < count; ++i) {
            String status;

            if (blocked[i]) {
                status = "Blocked";
            }
            else {
                status = "Active";
            }

            System.out.printf("%-10d %-20s %-12s %-15s %-15.2f %-12s\n",accountNo[i],holderName[i],accountType[i],mobile[i],
                    balance[i],status);
        }
    }



    // Search menu

    static void searchMenu() {

        System.out.println("\nSearch account by");

        System.out.println("1. Account number");
        System.out.println("2. Holder name");
        System.out.println("3. Account type");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                searchByAccountNumber();
                break;

            case 2:
                searchByHolderName();
                break;

            case 3:
                searchByAccountType();
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    // Search by account number
    static void searchByAccountNumber() {
        if (count == 0) {
            System.out.println("No accounts found.");
            return;
        }

        System.out.print("Enter account number: ");
        int searchAccount = sc.nextInt();

        for (int i = 0; i < count; ++i) {
            if (accountNo[i] == searchAccount) {

                System.out.println("\n============= Account Details =============");
                System.out.println("Account number : " + accountNo[i]);
                System.out.println("Holder name    : " + holderName[i]);
                System.out.println("Account type   : " + accountType[i]);
                System.out.println("Mobile number  : " + mobile[i]);
                System.out.println("Aadhaar number : " + aadhaar[i]);
                System.out.printf("Balance        : ₹%.2f\n", balance[i]);
                System.out.println("Status         : " + (blocked[i] ? "Blocked" : "Active"));
                System.out.println("Remarks        : " + remarks[i]);

                return;
            }
        }

        System.out.println("Account not found.");
    }

    // Search by holder name
    static void searchByHolderName() {
        if (count == 0) {
            System.out.println("No accounts found.");
            return;
        }

        sc.nextLine();

        System.out.print("Enter holder name: ");
        String searchName = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < count; ++i) {
            if (holderName[i].equalsIgnoreCase(searchName)) {

                if (!found) {
                    System.out.println("\nMatching accounts");
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.printf("%-10s %-20s %-12s %-15s\n",
                            "Acc No", "Holder", "Type", "Balance");
                    System.out.println("----------------------------------------------------------------------------");
                }

                found = true;

                System.out.printf("%-10d %-20s %-12s %-15.2f\n",
                        accountNo[i],
                        holderName[i],
                        accountType[i],
                        balance[i]);
            }
        }

        if (!found) {
            System.out.println("Account not found.");
        }
    }

    // Search by account type
    static void searchByAccountType() {
        if (count == 0) {
            System.out.println("No accounts found.");
            return;
        }

        sc.nextLine();

        System.out.print("Enter account type (Savings/Current): ");
        String type = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < count; ++i) {
            if (accountType[i].equalsIgnoreCase(type)) {

                if (!found) {
                    System.out.println("\nMatching accounts");
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.printf("%-10s %-20s %-15s\n",
                            "Acc No", "Holder", "Balance");
                    System.out.println("----------------------------------------------------------------------------");
                }

                found = true;

                System.out.printf("%-10d %-20s %-15.2f\n",
                        accountNo[i],
                        holderName[i],
                        balance[i]);
            }
        }

        if (!found) {
            System.out.println("No matching accounts found.");
        }
    }



    // Update account

    static void updateAccount() {
        if (count == 0) {
            System.out.println("No accounts found.");
            return;
        }

        System.out.print("Enter account number: ");
        int searchAccount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; ++i) {
            if (accountNo[i] == searchAccount) {

                System.out.println("Enter 'same' if you don't want to change a field.");

                System.out.print("Enter new holder name: ");
                String newName = sc.nextLine();

                if (!newName.equalsIgnoreCase("same")) {
                    holderName[i] = newName;
                }

                while (true) {
                    System.out.print("Enter new mobile number (or same): ");
                    String newMobile = sc.nextLine();

                    if (newMobile.equalsIgnoreCase("same")) {
                        break;
                    }

                    if (newMobile.length() == 10) {
                        mobile[i] = newMobile;
                        break;
                    }

                    System.out.println("Mobile number must contain exactly 10 digits.");
                }

                while (true) {
                    System.out.print("Enter new Aadhaar number (or same): ");
                    String newAadhaar = sc.nextLine();

                    if (newAadhaar.equalsIgnoreCase("same")) {
                        break;
                    }

                    if (newAadhaar.length() == 12) {
                        aadhaar[i] = newAadhaar;
                        break;
                    }

                    System.out.println("Aadhaar number must contain exactly 12 digits.");
                }

                System.out.println("Account updated successfully.");
                return;
            }
        }

        System.out.println("Account not found.");
    }

    

    // Delete account

    static void deleteAccount() {
        if (count == 0) {
            System.out.println("No accounts found.");
            return;
        }

        System.out.print("Enter account number: ");
        int searchAccount = sc.nextInt();

        for (int i = 0; i < count; ++i) {
            if (accountNo[i] == searchAccount) {

                System.out.println("\n============= Account Details =============");
                System.out.println("Account number : " + accountNo[i]);
                System.out.println("Holder name    : " + holderName[i]);
                System.out.printf("Current balance: ₹%.2f\n", balance[i]);

                System.out.print("\nAre you sure you want to delete this account? (Y/N): ");
                char choice = sc.next().charAt(0);

                if (choice != 'Y' && choice != 'y') {
                    System.out.println("Account deletion cancelled.");
                    return;
                }

                for (int j = i; j < count - 1; ++j) {
                    accountNo[j] = accountNo[j + 1];
                    holderName[j] = holderName[j + 1];
                    accountType[j] = accountType[j + 1];
                    mobile[j] = mobile[j + 1];
                    aadhaar[j] = aadhaar[j + 1];
                    pin[j] = pin[j + 1];
                    balance[j] = balance[j + 1];
                    blocked[j] = blocked[j + 1];
                    remarks[j] = remarks[j + 1];
                    lastTransaction[j] = lastTransaction[j + 1];
                    lastAmount[j] = lastAmount[j + 1];
                }


                count--;
                System.out.println("Account deleted successfully.");
                return;
            }
        }

        System.out.println("Account not found.");
    }



    // Deposit money

    static void deposit(int index) {

        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
            return;
        }

        balance[index] += amount;

        lastTransaction[index] = "Deposit";
        lastAmount[index] = amount;

        System.out.printf("₹%.2f deposited successfully.\n", amount);
        System.out.printf("Available balance : ₹%.2f\n", balance[index]);
    }


    // Withdraw money
    static void withdraw(int index) {

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
            return;
        }

        double minimumBalance;
        if (accountType[index].equalsIgnoreCase("Savings")) {
            minimumBalance = 500;
        }
        else {
            minimumBalance = 1000;
        }

        if (balance[index] - amount < minimumBalance) {
            System.out.printf(
                    "Minimum balance of ₹%.2f must be maintained.\n",
                    minimumBalance);

            return;
        }

        balance[index] -= amount;

        lastTransaction[index] = "Withdrawal";
        lastAmount[index] = amount;

        System.out.printf("₹%.2f withdrawn successfully.\n", amount);
        System.out.printf("Available balance : ₹%.2f\n", balance[index]);
    }


    // Transfer money
    static void transfer(int senderIndex) {

        System.out.print("Enter receiver account number: ");
        int receiverAccount = sc.nextInt();

        if (receiverAccount == accountNo[senderIndex]) {
            System.out.println("Cannot transfer to the same account.");
            return;
        }

        int receiverIndex = -1;

        for (int i = 0; i < count; ++i) {
            if (accountNo[i] == receiverAccount) {
                receiverIndex = i;
                break;
            }
        }

        if (receiverIndex == -1) {
            System.out.println("Receiver account not found.");
            return;
        }

        if (blocked[receiverIndex]) {
            System.out.println("Receiver account is blocked.");
            return;
        }

        System.out.print("Enter transfer amount: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
            return;
        }

        double minimumBalance;
        if (accountType[senderIndex].equalsIgnoreCase("Savings")) {
            minimumBalance = 500;
        }
        else {
            minimumBalance = 1000;
        }

        if (balance[senderIndex] - amount < minimumBalance) {

            System.out.println("Insufficient balance.");

            return;
        }

        balance[senderIndex] -= amount;
        balance[receiverIndex] += amount;

        lastTransaction[senderIndex] ="Transferred to " + accountNo[receiverIndex];

        lastAmount[senderIndex] = amount;

        lastTransaction[receiverIndex] ="Received from " + accountNo[senderIndex];

        lastAmount[receiverIndex] = amount;

        System.out.println("Money transferred successfully.");
        System.out.printf("Available balance : ₹%.2f\n",
                balance[senderIndex]);
    }




    // Check balance

    static void checkBalance(int index) {

        System.out.println("\n============= Account Summary =============");

        System.out.println("Account number : " + accountNo[index]);
        System.out.println("Holder name    : " + holderName[index]);
        System.out.println("Account type   : " + accountType[index]);

        System.out.printf("Available balance : ₹%.2f\n",
                balance[index]);
    }


    // View last transaction

    static void viewLastTransaction(int index) {

        System.out.println("\n=========== Last Transaction ===========");

        System.out.println("Transaction : " +lastTransaction[index]);

        System.out.printf("Amount      : ₹%.2f\n",lastAmount[index]);
    }



    // Block account

    static void blockAccount() {
        if (count == 0) {
            System.out.println("No accounts found.");
            return;
        }

        System.out.print("Enter account number: ");
        int searchAccount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; ++i) {
            if (accountNo[i] == searchAccount) {

                if (blocked[i]) {
                    System.out.println("Account is already blocked.");
                    return;
                }

                blocked[i] = true;

                System.out.print("Enter reason for blocking: ");
                remarks[i] = sc.nextLine();

                System.out.println("Account blocked successfully.");

                return;
            }
        }

        System.out.println("Account not found.");
    }
    
    // Unblock account
    static void unblockAccount() {
        if (count == 0) {
            System.out.println("No accounts found.");
            return;
        }

        System.out.print("Enter account number: ");
        int searchAccount = sc.nextInt();

        for (int i = 0; i < count; ++i) {
            if (accountNo[i] == searchAccount) {

                if (!blocked[i]) {
                    System.out.println("Account is already active.");
                    return;
                }

                blocked[i] = false;
                remarks[i] = "-";

                System.out.println("Account unblocked successfully.");
                return;
            }
        }

        System.out.println("Account not found.");
    }

    // Change admin PIN
    static void changeAdminPin() {

        System.out.print("Enter current admin PIN: ");
        int currentPin = sc.nextInt();

        if (currentPin != adminPin) {
            System.out.println("Incorrect admin PIN.");
            return;
        }

        while (true) {
            System.out.print("Enter new 4-digit admin PIN: ");
            int newPin = sc.nextInt();

            if (newPin >= 1000 && newPin <= 9999) {
                adminPin = newPin;

                System.out.println("Admin PIN changed successfully.");
                return;
            }

            System.out.println("PIN must be exactly 4 digits.");
        }
    }


    // Change customer PIN
    static void changeCustomerPin(int index) {

        System.out.print("Enter current PIN: ");
        int currentPin = sc.nextInt();

        if (currentPin != pin[index]) {
            System.out.println("Incorrect PIN.");
            return;
        }

        while (true) {
            System.out.print("Enter new 4-digit PIN: ");
            int newPin = sc.nextInt();

            if (newPin >= 1000 && newPin <= 9999) {
                pin[index] = newPin;

                System.out.println("PIN changed successfully.");
                return;
            }

            System.out.println("PIN must be exactly 4 digits.");
        }
    }


    // Calculate yearly interest

    static void calculateInterest(int index) {
        double rate;

        if (accountType[index].equalsIgnoreCase("Savings")) {
            rate = 4.0;
        }
        else {
            rate = 2.5;
        }

        double interest = balance[index] * rate / 100.0;
        double futureBalance = balance[index] + interest;

        System.out.println("\n========== Interest Calculation ==========");

        System.out.printf("Current balance      : ₹%.2f\n", balance[index]);
        System.out.printf("Interest rate        : %.2f%%\n", rate);
        System.out.printf("Interest earned      : ₹%.2f\n", interest);
        System.out.printf("Balance after 1 year : ₹%.2f\n", futureBalance);
    }


    // Reports menu

    static void reportsMenu() {

        while (true) {
            System.out.println("\n=============== Reports Menu ===============");
            System.out.println("1. Display total accounts");
            System.out.println("2. Display total bank balance");
            System.out.println("3. Display savings accounts");
            System.out.println("4. Display current accounts");
            System.out.println("5. Display highest balance account");
            System.out.println("6. Display lowest balance account");
            System.out.println("7. Display average account balance");
            System.out.println("8. Back");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    displayTotalAccounts();
                    break;

                case 2:
                    displayTotalBankBalance();
                    break;

                case 3:
                    displaySavingsAccounts();
                    break;

                case 4:
                    displayCurrentAccounts();
                    break;

                case 5:
                    displayHighestBalanceAccount();
                    break;

                case 6:
                    displayLowestBalanceAccount();
                    break;

                case 7:
                    displayAverageBalance();
                    break;
                case 8:
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    
    // Display total accounts
    static void displayTotalAccounts() {

        System.out.println("Total accounts : " + count);
    }

    // Display total bank balance
    static void displayTotalBankBalance() {
        double total = 0;

        for (int i = 0; i < count; ++i) {
            total += balance[i];
        }

        System.out.printf("Total bank balance : ₹%.2f\n", total);
    }

    // Display savings accounts
    static void displaySavingsAccounts() {

        int savings = 0;

        for (int i = 0; i < count; ++i) {
            if (accountType[i].equalsIgnoreCase("Savings")) {
                savings++;
            }
        }

        System.out.println("Savings accounts : " + savings);
    }

    // Display current accounts
    static void displayCurrentAccounts() {

        int current = 0;

        for (int i = 0; i < count; ++i) {
            if (accountType[i].equalsIgnoreCase("Current")) {
                current++;
            }
        }

        System.out.println("Current accounts : " + current);
    }

    // Display highest balance account
    static void displayHighestBalanceAccount() {
        if (count == 0) {
            System.out.println("No accounts found.");
            return;
        }

        int index = 0;

        for (int i = 1; i < count; ++i) {
            if (balance[i] > balance[index]) {
                index = i;
            }
        }

        System.out.println("\nHighest balance account");

        System.out.println("Account number : " + accountNo[index]);
        System.out.println("Holder name    : " + holderName[index]);

        System.out.printf("Balance        : ₹%.2f\n", balance[index]);
    }

    // Display lowest balance account

    static void displayLowestBalanceAccount() {
        if (count == 0) {
            System.out.println("No accounts found.");
            return;
        }

        int index = 0;

        for (int i = 1; i < count; ++i) {
            if (balance[i] < balance[index]) {
                index = i;
            }
        }

        System.out.println("\nLowest balance account");

        System.out.println("Account number : " + accountNo[index]);
        System.out.println("Holder name    : " + holderName[index]);

        System.out.printf("Balance        : ₹%.2f\n", balance[index]);
    }

    // Display average balance
    static void displayAverageBalance() {
        if (count == 0) {
            System.out.println("No accounts found.");
            return;
        }

        double total = 0;

        for (int i = 0; i < count; ++i) {
            total += balance[i];
        }

        System.out.printf("Average account balance : ₹%.2f\n",total / count);
    }


}