// Question 109 -- WAP to Create Library Management System

import java.util.Scanner;

public class question109 {
    // All static to share memory among all methods/functions
    static Scanner sc = new Scanner(System.in);

    static int bookId[] = new int[100];
    static String title[] = new String[100];
    static String author[] = new String[100];
    static boolean issued[] = new boolean[100];

    static int count = 0;

    public static void main(String[] args) {

        while(true){
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add book");
            System.out.println("2. View books");
            System.out.println("3. Search book");
            System.out.println("4. Issue book");
            System.out.println("5. Return book");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    addBook();
                    break;

                case 2:
                    viewBooks();
                    break;

                case 3:
                    searchBook();
                    break;

                case 4:
                    issueBook();
                    break;

                case 5:
                    returnBook();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Add book
    static void addBook(){
        if(count == 100){
            System.out.println("Library is full.");
            return;
        }

        System.out.print("Enter book Id: ");
        int newId = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < count; ++i){
            if(bookId[i] == newId){
                System.out.println("Book Id already exists.");
                return;
            }
        }

        bookId[count] = newId;

        System.out.print("Enter book title: ");
        title[count] = sc.nextLine();

        System.out.print("Enter author name: ");
        author[count] = sc.nextLine();

        issued[count] = false;

        count++;
        System.out.println("Book added successfully.");
    }

    // View books
    static void viewBooks(){
        if(count == 0){
            System.out.println("No books available.");
            return;
        }

        System.out.println("\n------------------------------------------------------------------");
        System.out.printf("%-10s %-25s %-20s %-10s\n","Id","Title","Author","Status");
        System.out.println("------------------------------------------------------------------");

        for(int i = 0; i < count; ++i){
            String status;

            if(issued[i]){
                status = "Issued";
            }
            else{
                status = "Available";
            }

            System.out.printf("%-10d %-25s %-20s %-10s\n",bookId[i], title[i], author[i], status);
        }
    }

    // Search book
    static void searchBook(){

        System.out.print("Enter book Id: ");
        int searchId = sc.nextInt();

        for(int i = 0; i < count; ++i){
            if(bookId[i] == searchId){
                System.out.println("\nBook found");
                System.out.println("Book Id : " + bookId[i]);
                System.out.println("Title   : " + title[i]);
                System.out.println("Author  : " + author[i]);

                if(issued[i]){
                    System.out.println("Status  : Issued");
                }
                else{
                    System.out.println("Status  : Available");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    // Issue book
    static void issueBook(){

        System.out.print("Enter book Id: ");
        int searchId = sc.nextInt();

        for(int i = 0; i < count; ++i){
            if(bookId[i] == searchId){
                if(issued[i]){
                    System.out.println("Book is already issued.");
                }
                else{
                    issued[i] = true;
                    System.out.println("Book issued successfully.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    // Return book
    static void returnBook(){

        System.out.print("Enter book Id: ");
        int searchId = sc.nextInt();

        for(int i = 0; i < count; ++i){
            if(bookId[i] == searchId){

                if(!issued[i]){
                    System.out.println("cannot return. Book has not been issued.");
                } 
                else{
                    issued[i] = false;
                    System.out.println("Book returned successfully.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }
}