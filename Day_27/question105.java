// Question 105 -- WAP to Create Student Record Management System

import java.util.Scanner;

public class question105 {
    //all static to share the memory of these to all functions
    static Scanner sc = new Scanner(System.in);   

    static int id[] = new int[100];
    static String name[] = new String[100];
    static String branch[] = new String[100];
    static double marks[] = new double[100];

    static int count = 0;

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== Student Record Management System =====");
            System.out.println("1. Add student");
            System.out.println("2. View students");
            System.out.println("3. Search student");
            System.out.println("4. Update student");
            System.out.println("5. Delete student");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    System.out.println("Thank You!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Add Student
    static void addStudent() {
        if(count == 100){
            System.out.println("Database is full.");
            return;
        }

        System.out.print("Enter student Id: ");
        int newId = sc.nextInt();
        sc.nextLine();   //to remove newline character(because of enter key typing) from the buffer, otherwise will lead to no input take in for name

        for(int i = 0; i < count; ++i){
            if(id[i] == newId){
                System.out.println("Student Id already exists.");
                return;
            }
        }
        id[count] = newId;


        System.out.print("Enter student name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter student branch: ");
        branch[count] = sc.nextLine();

        System.out.print("Enter student marks: ");
        marks[count] = sc.nextDouble();

        count++;
        System.out.println("Student added successfully.");
    }

    // View Students
    static void viewStudents() {
        if (count == 0) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\n------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-15s %-10s\n", "ID", "Name", "Branch", "Marks");       //formatted printing 
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-10d %-20s %-15s %-10.2f\n\n",
                    id[i], name[i], branch[i], marks[i]);
        }
    }

    // Search Student
    static void searchStudent() {
        System.out.print("Enter student Id: ");
        int searchId = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (id[i] == searchId) {
                System.out.println("\nStudent found");
                System.out.println("ID      : " + id[i]);
                System.out.println("Name    : " + name[i]);
                System.out.println("Branch  : " + branch[i]);
                System.out.println("Marks   : " + marks[i]);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Update Student
    static void updateStudent() {

        System.out.print("Enter Student ID: ");
        int searchId = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < count; ++i){
            if(id[i] == searchId){
                System.out.println("Enter 'same' if you don't want to change a field.");

                //update name
                System.out.print("Enter new name: ");
                String newName = sc.nextLine();

                if(!newName.equals("same")){
                    name[i] = newName;
                }

                //update branch
                System.out.print("Enter new branch: ");
                String newBranch = sc.nextLine();

                if(!newBranch.equals("same")){
                    branch[i] = newBranch;
                }

                //update marks
                System.out.print("Update marks? (y/n): ");
                char ch = sc.next().charAt(0);

                if(ch == 'y' || ch == 'Y'){
                    System.out.print("Enter new marks: ");
                    marks[i] = sc.nextDouble();
                }

                System.out.println("Record Updated Successfully.");
                return;
            }
        }

        System.out.println("Student Not Found.");
}

    // Delete Student
    static void deleteStudent() {

        System.out.print("Enter student Id: ");
        int searchId = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (id[i] == searchId) {
                for (int j = i; j < count - 1; j++) {
                    id[j] = id[j + 1];
                    name[j] = name[j + 1];
                    branch[j] = branch[j + 1];
                    marks[j] = marks[j + 1];
                }
                count--;

                System.out.println("Student deleted successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}