// Question 106 -- WAP to Create Employee Management System

import java.util.Scanner;

public class question106 {

    //All static to share memory among all methods/functions
    static Scanner sc = new Scanner(System.in);

    static int id[] = new int[100];
    static String name[] = new String[100];
    static String dept[] = new String[100];
    static double salary[] = new double[100];

    static int count = 0;

    public static void main(String[] args) {

        while(true){
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add employee");
            System.out.println("2. View employees");
            System.out.println("3. Search employee");
            System.out.println("4. Update employee");
            System.out.println("5. Delete employee");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    searchEmployee();
                    break;
                case 4:
                    updateEmployee();
                    break;
                case 5:
                    deleteEmployee();
                    break;
                case 6:
                    System.out.println("Thank You!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Add Employee
    static void addEmployee(){
        if(count == 100){
            System.out.println("Database is full.");
            return;
        }

        System.out.print("Enter employee Id: ");
        int newId = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < count; ++i){
            if(id[i] == newId){
                System.out.println("Employee Id already exists.");
                return;
            }
        }
        id[count] = newId;


        System.out.print("Enter employee name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter department: ");
        dept[count] = sc.nextLine();

        System.out.print("Enter salary: ");
        salary[count] = sc.nextDouble();

        count++;

        System.out.println("Employee added successfully.");
    }

    // View Employees
    static void viewEmployees(){
        if(count == 0){
            System.out.println("No employee records found.");
            return;
        }

        System.out.println("\n----------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-10s\n","ID","Name","Department","Salary");
        System.out.println("----------------------------------------------------------------");

        for(int i = 0; i < count; ++i){
            System.out.printf("%-10d %-20s %-20s %-10.2f\n", id[i], name[i], dept[i], salary[i]);
        }
    }

    // Search Employee
    static void searchEmployee(){

        System.out.print("Enter employee Id: ");
        int searchId = sc.nextInt();

        for(int i = 0; i < count; ++i){
            if(id[i] == searchId){
                System.out.println("\nEmployee found");
                System.out.println("Employee ID : " + id[i]);
                System.out.println("Name        : " + name[i]);
                System.out.println("Department  : " + dept[i]);
                System.out.println("Salary      : " + salary[i]);

                return;
            }
        }

        System.out.println("Employee not found.");
    }

    // Update Employee
    static void updateEmployee(){

        System.out.print("Enter employee Id: ");
        int searchId = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < count; ++i){
            if(id[i] == searchId){
                System.out.println("Enter 'same' if you don't want to change a field.");

                System.out.print("Enter new name: ");
                String newName = sc.nextLine();

                if(!newName.equals("same")){
                    name[i] = newName;
                }

                System.out.print("Enter new department: ");
                String newDepartment = sc.nextLine();

                if(!newDepartment.equals("same")){
                    dept[i] = newDepartment;
                }


                System.out.print("Update salary? (y/n): ");
                char ch = sc.next().charAt(0);

                if(ch == 'y' || ch == 'Y'){
                    System.out.print("Enter new salary: ");
                    salary[i] = sc.nextDouble();
                }

                System.out.println("Record updated successfully.");
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    // Delete Employee
    static void deleteEmployee(){

        System.out.print("Enter employee Id: ");
        int searchId = sc.nextInt();

        for(int i = 0; i < count; ++i){
            if(id[i] == searchId){

                for(int j = i; j < count - 1; ++j){
                    id[j] = id[j + 1];
                    name[j] = name[j + 1];
                    dept[j] = dept[j + 1];
                    salary[j] = salary[j + 1];
                }

                count--;

                System.out.println("Employee deleted successfully.");
                return;
            }
        }

        System.out.println("Employee not found.");
    }
}