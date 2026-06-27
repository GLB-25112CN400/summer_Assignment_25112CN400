// Question 113 -- WAP to Create Hotel Management System

import java.util.Scanner;

public class question113 {

    static Scanner sc = new Scanner(System.in);
    //concept -- The hotel has 10 fixed rooms (101–110). Occupancy is managed
    static int roomNo[] = {101,102,103,104,105,106,107,108,109,110};
    static String guestName[] = new String[10];
    static boolean booked[] = new boolean[10];

    public static void main(String[] args) {

        while(true){
            System.out.println("\n===== Hotel Management System =====");
            System.out.println("1. Check in guest");
            System.out.println("2. View rooms");
            System.out.println("3. Search room");
            System.out.println("4. Check out guest");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    checkIn();
                    break;

                case 2:
                    viewRooms();
                    break;

                case 3:
                    searchRoom();
                    break;

                case 4:
                    checkOut();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Check in guest
    static void checkIn(){
        System.out.print("Enter room number: ");
        int searchRoom = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<roomNo.length;++i){
            if(roomNo[i]==searchRoom){
                if(booked[i]){
                    System.out.println("Room is already booked.");
                }
                else{
                    System.out.print("Enter guest name: ");
                    guestName[i]=sc.nextLine();

                    booked[i]=true;
                    System.out.println("Guest checked in successfully.");
                }

                return;
            }
        }

        System.out.println("Room not found.");
    }

    // View rooms
    static void viewRooms(){

        System.out.println("\n-------------------------------------------------------");
        System.out.printf("%-12s %-20s %-12s\n","Room No","Guest","Status");
        System.out.println("-------------------------------------------------------");

        for(int i=0;i<roomNo.length;++i){
            String status;
            String guest;

            if(booked[i]){
                status="Booked";
                guest=guestName[i];
            }
            else{
                status="Available";
                guest="-";
            }

            System.out.printf("%-12d %-20s %-12s\n",roomNo[i],guest,status);
        }
    }

    // Search room
    static void searchRoom(){
        System.out.print("Enter room number: ");
        int searchRoom=sc.nextInt();

        for(int i=0;i<roomNo.length;++i){
            if(roomNo[i]==searchRoom){

                System.out.println("\nRoom found");
                System.out.println("Room number : "+roomNo[i]);

                if(booked[i]){
                    System.out.println("Status      : Booked");
                    System.out.println("Guest       : "+guestName[i]);
                }
                else{
                    System.out.println("Status      : Available");
                    System.out.println("Guest       : -");
                }

                return;
            }
        }

        System.out.println("Room not found.");
    }

    // Check out guest
    static void checkOut(){
        System.out.print("Enter room number: ");
        int searchRoom=sc.nextInt();

        for(int i=0;i<roomNo.length;++i){
            if(roomNo[i]==searchRoom){

                if(!booked[i]){
                    System.out.println("Room not booked. Room is already available.");
                }
                else{
                    booked[i]=false;
                    guestName[i]=null;

                    System.out.println("Guest checked out successfully.");
                }

                return;
            }
        }

        System.out.println("Room not found.");
    }
}