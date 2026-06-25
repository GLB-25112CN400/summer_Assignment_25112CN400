// Question 108 -- WAP to Create Marksheet Generation System

import java.util.Scanner;

public class question108 {

    static Scanner sc = new Scanner(System.in);

    static int id[] = new int[100];
    static String name[] = new String[100];

    static double maths[] = new double[100];
    static double phy[] = new double[100];
    static double chem[] = new double[100];
    static double eng[] = new double[100];
    static double comp[] = new double[100];

    static double tot[] = new double[100];
    static double percentage[] = new double[100];
    static String grade[] = new String[100];
    static String result[] = new String[100];

    static int count = 0;

    public static void main(String[] args) {

        while(true){
            System.out.println("\n===== Marksheet Generation System =====");
            System.out.println("1. Generate marksheet");
            System.out.println("2. View marksheets");
            System.out.println("3. Search student");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    generateMarksheet();
                    break;

                case 2:
                    viewMarksheets();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Generate marksheet
    static void generateMarksheet(){

        if(count == 100){
            System.out.println("Database is full.");
            return;
        }

        System.out.print("Enter student Id: ");
        int newId = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < count; ++i){
            if(id[i] == newId){
                System.out.println("Student Id already exists.");
                return;
            }
        }

        id[count] = newId;

        System.out.print("Enter student name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter maths marks: ");
        maths[count] = sc.nextDouble();

        System.out.print("Enter physics marks: ");
        phy[count] = sc.nextDouble();

        System.out.print("Enter chemistry marks: ");
        chem[count] = sc.nextDouble();

        System.out.print("Enter english marks: ");
        eng[count] = sc.nextDouble();

        System.out.print("Enter computer marks: ");
        comp[count] = sc.nextDouble();

        tot[count] = maths[count] + phy[count] + chem[count] + eng[count] + comp[count];

        percentage[count] = tot[count] / 5.0;


        if(maths[count] >= 33 &&
           phy[count] >= 33 &&
           chem[count] >= 33 &&
           eng[count] >= 33 &&
           comp[count] >= 33){
            result[count] = "Pass";
        }
        else{
            result[count] = "Fail";
        }

        if(result[count].equals("Fail")){
            grade[count] = "F";
        }
        else if(percentage[count] >= 90){
            grade[count] = "A+";
        }
        else if(percentage[count] >= 80){
            grade[count] = "A";
        }
        else if(percentage[count] >= 70){
            grade[count] = "B";
        }
        else if(percentage[count] >= 60){
            grade[count] = "C";
        }
        else if(percentage[count] >= 50){
            grade[count] = "D";
        }
        else{
            grade[count] = "F";
        }


        count++;

        System.out.println("Marksheet generated successfully.");
    }

    // View marksheets
    static void viewMarksheets(){
        if(count == 0){
            System.out.println("No marksheets found.");
            return;
        }

        for(int i = 0; i < count; ++i){
            System.out.println("\n========================================");
            System.out.println("Student Id      : " + id[i]);
            System.out.println("Student name    : " + name[i]);
            System.out.println("----------------------------------------");
            System.out.println("Maths           : " + maths[i]);
            System.out.println("Physics         : " + phy[i]);
            System.out.println("Chemistry       : " + chem[i]);
            System.out.println("English         : " + eng[i]);
            System.out.println("Computer        : " + comp[i]);
            System.out.println("----------------------------------------");
            System.out.println("Total           : " + tot[i] + " / 500");
            System.out.printf("Percentage      : %.2f%%\n", percentage[i]);
            System.out.println("Grade           : " + grade[i]);
            System.out.println("Result          : " + result[i]);
            System.out.println("========================================\n\n");
        }
    }

    // Search student
    static void searchStudent(){
        System.out.print("Enter student Id: ");
        int searchId = sc.nextInt();

        for(int i = 0; i < count; ++i){
            if(id[i] == searchId){
                System.out.println("\nStudent found");
                System.out.println("----------------------------------------");
                System.out.println("Student Id      : " + id[i]);
                System.out.println("Student name    : " + name[i]);
                System.out.println("Maths           : " + maths[i]);
                System.out.println("Physics         : " + phy[i]);
                System.out.println("Chemistry       : " + chem[i]);
                System.out.println("English         : " + eng[i]);
                System.out.println("Computer        : " + comp[i]);
                System.out.println("Total           : " + tot[i] + " / 500");
                System.out.printf("Percentage      : %.2f%%\n", percentage[i]);
                System.out.println("Grade           : " + grade[i]);
                System.out.println("Result          : " + result[i]);

                return;
            }
        }

        System.out.println("Student not found.");
    }
}