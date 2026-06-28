// Question 118 -- WAP to Create Mini Library Management System

import java.util.Scanner;

public class question118 {

    static Scanner sc = new Scanner(System.in);

    static int bookId[] = new int[100];
    static String title[] = new String[100];
    static String author[] = new String[100];
    static boolean issued[] = new boolean[100];

    static int count = 0;

    public static void main(String[] args) {

        // Admin login
        System.out.print("Enter admin password: ");
        String password = sc.nextLine();

        if(!password.equals("admin123")){
            System.out.println("Access denied.");
            return;
        }

        while(true){
            System.out.println("\n===== Mini Library Management System =====");
            System.out.println("1. Add book");
            System.out.println("2. View books");
            System.out.println("3. Search book by Id");
            System.out.println("4. Search book by title");
            System.out.println("5. Search book by author");
            System.out.println("6. Issue book");
            System.out.println("7. Return book");
            System.out.println("8. Display total books");
            System.out.println("9. Display issued books");
            System.out.println("10. Exit");

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
                    searchById();
                    break;

                case 4:
                    searchByTitle();
                    break;

                case 5:
                    searchByAuthor();
                    break;

                case 6:
                    issueBook();
                    break;

                case 7:
                    returnBook();
                    break;

                case 8:
                    displayTotalBooks();
                    break;

                case 9:
                    displayIssuedBooks();
                    break;

                case 10:
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
            System.out.println("No books found.");
            return;
        }

        System.out.println("\n----------------------------------------------------------------------------");
        System.out.printf("%-10s %-28s %-20s %-12s\n","Id","Title","Author","Status");
        System.out.println("----------------------------------------------------------------------------");

        for(int i = 0; i < count; ++i){
            String status;

            if(issued[i]){
                status = "Issued";
            }
            else{
                status = "Available";
            }

            System.out.printf("%-10d %-28s %-20s %-12s\n",bookId[i],title[i],author[i],status);
        }
    }

    // Search book by Id
    static void searchById(){
        if(count == 0){
            System.out.println("No books found.");
            return;
        }

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


    // Search book by title
    static void searchByTitle(){
        if(count == 0){
            System.out.println("No books found.");
            return;
        }

        sc.nextLine();

        System.out.print("Enter book title: ");
        String searchTitle = sc.nextLine();

        boolean found = false;
        for(int i = 0; i < count; ++i){
            if(title[i].equalsIgnoreCase(searchTitle)){

                if(!found){
                    System.out.println("\nBooks found");
                }

                found = true;

                System.out.println("--------------------------------------");
                System.out.println("Book Id : " + bookId[i]);
                System.out.println("Title   : " + title[i]);
                System.out.println("Author  : " + author[i]);

                if(issued[i]){
                    System.out.println("Status  : Issued");
                }
                else{
                    System.out.println("Status  : Available");
                }
            }
        }

        if(!found){
            System.out.println("Book not found.");
        }
    }


    // Search book by author
    static void searchByAuthor(){
        if(count == 0){
            System.out.println("No books found.");
            return;
        }

        sc.nextLine();

        System.out.print("Enter author name: ");
        String searchAuthor = sc.nextLine();

        boolean found = false;

        for(int i = 0; i < count; ++i){
            if(author[i].equalsIgnoreCase(searchAuthor)){

                if(!found){
                    System.out.println("\nBooks found");
                }

                found = true;

                System.out.println("--------------------------------------");
                System.out.println("Book Id : " + bookId[i]);
                System.out.println("Title   : " + title[i]);

                if(issued[i]){
                    System.out.println("Status  : Issued");
                }
                else{
                    System.out.println("Status  : Available");
                }
            }
        }

        if(!found){
            System.out.println("Book not found.");
        }
    }


    // Issue book
    static void issueBook(){
        if(count == 0){
            System.out.println("No books found.");
            return;
        }

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
        if(count == 0){
            System.out.println("No books found.");
            return;
        }

        System.out.print("Enter book Id: ");
        int searchId = sc.nextInt();

        for(int i = 0; i < count; ++i){
            if(bookId[i] == searchId){

                if(!issued[i]){
                    System.out.println("Book not issued. Book is already available.");
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

    // Display total books
    static void displayTotalBooks(){

        System.out.println("Total books : " + count);
    }


    // Display issued books
    static void displayIssuedBooks(){
        if(count == 0){
            System.out.println("No books found.");
            return;
        }

        int issuedCount = 0;

        System.out.println("\n==========================================================");
        System.out.printf("%-10s %-28s %-20s\n","Id","Title","Author");
        System.out.println("==========================================================");

        for(int i = 0; i < count; ++i){
            if(issued[i]){
                issuedCount++;

                System.out.printf("%-10d %-28s %-20s\n",
                        bookId[i],
                        title[i],
                        author[i]);
            }
        }

        if(issuedCount == 0){
            System.out.println("No books are currently issued.");
        }
        else{
            System.out.println("\nTotal issued books : " + issuedCount);
        }
    }

}