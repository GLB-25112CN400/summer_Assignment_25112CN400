// Question 112 -- WAP to Create Contact Management System

import java.util.Scanner;

public class question112 {

    // All static to share memory among all methods/functions
    static Scanner sc = new Scanner(System.in);

    static String name[] = new String[100];
    static String phone[] = new String[100];
    static String email[] = new String[100];

    static int count = 0;

    public static void main(String[] args) {

        while(true){
            System.out.println("\n===== Contact Management System =====");
            System.out.println("1. Add contact");
            System.out.println("2. View contacts");
            System.out.println("3. Search contact");
            System.out.println("4. Update contact");
            System.out.println("5. Delete contact");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    addContact();
                    break;

                case 2:
                    viewContacts();
                    break;

                case 3:
                    searchContact();
                    break;

                case 4:
                    updateContact();
                    break;

                case 5:
                    deleteContact();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Add contact
    static void addContact(){

        if(count == 100){
            System.out.println("Contact list is full.");
            return;
        }

        sc.nextLine();

        System.out.print("Enter contact name: ");
        String newName = sc.nextLine();

        System.out.print("Enter phone number: ");
        String newPhone = sc.nextLine();

        for(int i = 0; i < count; ++i){
            if(phone[i].equals(newPhone)){
                System.out.println("Phone number already exists.");
                return;
            }
        }

        System.out.print("Enter email: ");
        String newEmail = sc.nextLine();

        name[count] = newName;
        phone[count] = newPhone;
        email[count] = newEmail;

        count++;
        System.out.println("Contact added successfully.");
    }

    // View contacts
    static void viewContacts(){
        if(count == 0){
            System.out.println("No contacts found.");
            return;
        }

        System.out.println("\n--------------------------------------------------------------");
        System.out.printf("%-20s %-18s %-25s\n","Name","Phone","Email");
        System.out.println("--------------------------------------------------------------");

        for(int i = 0; i < count; ++i){
            System.out.printf("%-20s %-18s %-25s\n",name[i], phone[i], email[i]);
        }
    }

    // Search contact
    static void searchContact(){

        sc.nextLine();

        System.out.print("Enter contact name: ");
        String searchName = sc.nextLine();

        for(int i = 0; i < count; ++i){
            if(name[i].equalsIgnoreCase(searchName)){
                System.out.println("\nContact found");
                System.out.println("Name  : " + name[i]);
                System.out.println("Phone : " + phone[i]);
                System.out.println("Email : " + email[i]);

                return;
            }
        }

        System.out.println("Contact not found.");
    }

    // Update contact
    static void updateContact(){

        sc.nextLine();

        System.out.print("Enter contact name: ");
        String searchName = sc.nextLine();

        for(int i = 0; i < count; ++i){
            if(name[i].equalsIgnoreCase(searchName)){
                System.out.println("Enter 'same' if you don't want to change a field.");

                System.out.print("Enter new phone number: ");
                String newPhone = sc.nextLine();

                if(!newPhone.equalsIgnoreCase("same")){
                    phone[i] = newPhone;
                }

                System.out.print("Enter new email: ");
                String newEmail = sc.nextLine();

                if(!newEmail.equalsIgnoreCase("same")){
                    email[i] = newEmail;
                }

                System.out.println("Contact updated successfully.");
                return;
            }
        }

        System.out.println("Contact not found.");
    }

    // Delete contact
    static void deleteContact(){

        sc.nextLine();

        System.out.print("Enter contact name: ");
        String searchName = sc.nextLine();

        for(int i = 0; i < count; ++i){
            if(name[i].equalsIgnoreCase(searchName)){
                
                for(int j = i; j < count - 1; ++j){
                    name[j] = name[j + 1];
                    phone[j] = phone[j + 1];
                    email[j] = email[j + 1];
                }

                count--;

                System.out.println("Contact deleted successfully.");
                return;
            }
        }

        System.out.println("Contact not found.");
    }
}