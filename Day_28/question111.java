// Question 111 -- WAP to Create Ticket Booking System

import java.util.Scanner;

public class question111 {
    // All static to share memory among all methods/functions
    static Scanner sc = new Scanner(System.in);

    static int ticketId[] = new int[100];
    static String passengerName[] = new String[100];
    static String source[] = new String[100];
    static String destination[] = new String[100];
    static boolean booked[] = new boolean[100];

    static int count = 0;

    public static void main(String[] args) {

        while(true){

            System.out.println("\n===== Ticket Booking System =====");
            System.out.println("1. Book ticket");
            System.out.println("2. View tickets");
            System.out.println("3. Search ticket");
            System.out.println("4. Cancel ticket");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    bookTicket();
                    break;

                case 2:
                    viewTickets();
                    break;

                case 3:
                    searchTicket();
                    break;

                case 4:
                    cancelTicket();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Book ticket
    static void bookTicket(){
        if(count == 100){
            System.out.println("Database is full.");
            return;
        }

        System.out.print("Enter ticket Id: ");
        int newId = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < count; ++i){
            if(ticketId[i] == newId){
                System.out.println("Ticket Id already exists.");
                return;
            }
        }

        ticketId[count] = newId;

        System.out.print("Enter passenger name: ");
        passengerName[count] = sc.nextLine();

        System.out.print("Enter source: ");
        source[count] = sc.nextLine();

        System.out.print("Enter destination: ");
        destination[count] = sc.nextLine();

        booked[count] = true;

        count++;
        System.out.println("Ticket booked successfully.");
    }

    // View tickets
    static void viewTickets(){
        if(count == 0){
            System.out.println("No tickets found.");
            return;
        }

        System.out.println("\n----------------------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-15s %-15s %-10s\n","Id","Passenger","Source","Destination","Status");
        System.out.println("----------------------------------------------------------------------------");

        for(int i = 0; i < count; ++i){
            String status;

            if(booked[i]){
                status = "Booked";
            }
            else{
                status = "Cancelled";
            }

            System.out.printf("%-10d %-20s %-15s %-15s %-10s\n",ticketId[i], passengerName[i], source[i], destination[i], status);
        }
    }

    // Search ticket
    static void searchTicket(){

        System.out.print("Enter ticket Id: ");
        int searchId = sc.nextInt();

        for(int i = 0; i < count; ++i){
            if(ticketId[i] == searchId){
                System.out.println("\nTicket found");
                System.out.println("Ticket Id   : " + ticketId[i]);
                System.out.println("Passenger   : " + passengerName[i]);
                System.out.println("Source      : " + source[i]);
                System.out.println("Destination : " + destination[i]);

                if(booked[i]){
                    System.out.println("Status      : Booked");
                }
                else{
                    System.out.println("Status      : Cancelled");
                }

                return;
            }
        }

        System.out.println("Ticket not found.");
    }

    // Cancel ticket
    static void cancelTicket(){

        System.out.print("Enter ticket Id: ");
        int searchId = sc.nextInt();

        for(int i = 0; i < count; ++i){
            if(ticketId[i] == searchId){

                if(!booked[i]){
                    System.out.println("Ticket is already cancelled.");
                }
                else{
                    booked[i] = false;
                    System.out.println("Ticket cancelled successfully.");
                }

                return;
            }
        }

        System.out.println("Ticket not found.");
    }
}