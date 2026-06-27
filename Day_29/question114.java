// Question 114 -- WAP to Create Hospital Management System

import java.util.Scanner;

public class question114 {

    // All static to share memory among all methods/functions
    static Scanner sc = new Scanner(System.in);

    static int patientId[] = new int[100];
    static String patientName[] = new String[100];
    static int age[] = new int[100];
    static String disease[] = new String[100];
    static boolean admitted[] = new boolean[100];

    static int count = 0;

    public static void main(String[] args) {

        while(true){
            System.out.println("\n===== Hospital Management System =====");
            System.out.println("1. Admit patient");
            System.out.println("2. View patients");
            System.out.println("3. Search patient");
            System.out.println("4. Discharge patient");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    admitPatient();
                    break;

                case 2:
                    viewPatients();
                    break;

                case 3:
                    searchPatient();
                    break;

                case 4:
                    dischargePatient();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Admit patient
    static void admitPatient(){
        if(count == 100){
            System.out.println("Hospital occupancy is full.");
            return;
        }

        System.out.print("Enter patient Id: ");
        int newId = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < count; ++i){
            if(patientId[i] == newId){
                System.out.println("Patient Id already exists.");
                return;
            }
        }

        patientId[count] = newId;

        System.out.print("Enter patient name: ");
        patientName[count] = sc.nextLine();

        System.out.print("Enter age: ");
        age[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter disease: ");
        disease[count] = sc.nextLine();

        admitted[count] = true;

        count++;
        System.out.println("Patient admitted successfully.");
    }

    // View patients
    static void viewPatients(){
        if(count == 0){
            System.out.println("No patient records found.");
            return;
        }

        System.out.println("\n----------------------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-8s %-20s %-12s\n","Id","Name","Age","Disease","Status");
        System.out.println("----------------------------------------------------------------------------");

        for(int i = 0; i < count; ++i){
            String status;

            if(admitted[i]){
                status = "Admitted";
            }
            else{
                status = "Discharged";
            }

            System.out.printf("%-10d %-20s %-8d %-20s %-12s\n",patientId[i], patientName[i], age[i], disease[i], status);
        }
    }

    // Search patient
    static void searchPatient(){
        System.out.print("Enter patient Id: ");
        int searchId = sc.nextInt();

        for(int i = 0; i < count; ++i){
            if(patientId[i] == searchId){
                System.out.println("\nPatient found");
                System.out.println("Patient Id : " + patientId[i]);
                System.out.println("Name       : " + patientName[i]);
                System.out.println("Age        : " + age[i]);
                System.out.println("Disease    : " + disease[i]);

                if(admitted[i]){
                    System.out.println("Status     : Admitted");
                }
                else{
                    System.out.println("Status     : Discharged");
                }

                return;
            }
        }

        System.out.println("Patient not found.");
    }

    // Discharge patient
    static void dischargePatient(){
        System.out.print("Enter patient Id: ");
        int searchId = sc.nextInt();

        for(int i = 0; i < count; ++i){
            if(patientId[i] == searchId){

                if(!admitted[i]){
                    System.out.println("Patient is already discharged.");
                }
                else{
                    admitted[i] = false;
                    System.out.println("Patient discharged successfully.");
                }

                return;
            }
        }

        System.out.println("Patient not found.");
    }
}