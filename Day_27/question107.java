// Question 107 -- WAP to Create Salary Management System


//considering basic salary, hra, da, gross in salary management
import java.util.Scanner;

public class question107 {

    // All static to share memory among all methods/functions
    static Scanner sc = new Scanner(System.in);

    static int id[] = new int[100];
    static String name[] = new String[100];
    static double basicSalary[] = new double[100];
    static double hra[] = new double[100];
    static double da[] = new double[100];
    static double grossSalary[] = new double[100];

    static int count = 0;

    public static void main(String[] args) {

        while(true){
            System.out.println("\n===== Salary Management System =====");
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
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Add employee
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

        System.out.print("Enter basic salary: ");
        basicSalary[count] = sc.nextDouble();

        hra[count] = basicSalary[count] * 0.20;   //hra=20% of basic salary,  da=10% of basic salary
        da[count] = basicSalary[count] * 0.10;
        grossSalary[count] = basicSalary[count] + hra[count] + da[count];  //gross salary=basic+hra+da

        count++;

        System.out.println("Employee added successfully.");
    }

    // View employees
    static void viewEmployees(){
        if(count == 0){
            System.out.println("No employee records found.");
            return;
        }

        System.out.println("\n-----------------------------------------------------------------------------------------");
        System.out.printf("%-8s %-18s %-12s %-12s %-12s %-12s\n","Id","Name","Basic","HRA","DA","Gross");
        System.out.println("-----------------------------------------------------------------------------------------");

        for(int i = 0; i < count; ++i){
            System.out.printf("%-8d %-18s %-12.2f %-12.2f %-12.2f %-12.2f\n",id[i], name[i], basicSalary[i], hra[i], da[i], grossSalary[i]);
        }
    }

    // Search employee
    static void searchEmployee(){
        System.out.print("Enter employee Id: ");
        int searchId = sc.nextInt();

        for(int i = 0; i < count; ++i){
            if(id[i] == searchId){
                System.out.println("\nEmployee found");
                System.out.println("Employee Id : " + id[i]);
                System.out.println("Name        : " + name[i]);
                System.out.println("Basic salary: " + basicSalary[i]);
                System.out.println("HRA         : " + hra[i]);
                System.out.println("DA          : " + da[i]);
                System.out.println("Gross salary: " + grossSalary[i]);
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    // Update employee
    static void updateEmployee(){

        System.out.print("Enter employee Id: ");
        int searchId = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < count; ++i){
            if(id[i] == searchId){
                System.out.println("Enter 'same' if you don't want to change the name.");

                System.out.print("Enter new name: ");
                String newName = sc.nextLine();

                if(!newName.equals("same")){
                    name[i] = newName;
                }

                System.out.print("Update salary? (y/n): ");
                char ch = sc.next().charAt(0);

                if(ch == 'y' || ch == 'Y'){

                    System.out.print("Enter new basic salary: ");
                    basicSalary[i] = sc.nextDouble();

                    hra[i] = basicSalary[i] * 0.20;
                    da[i] = basicSalary[i] * 0.10;
                    grossSalary[i] = basicSalary[i] + hra[i] + da[i];
                }

                System.out.println("Record updated successfully.");
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    // Delete employee
    static void deleteEmployee(){

        System.out.print("Enter employee Id: ");
        int searchId = sc.nextInt();

        for(int i = 0; i < count; ++i){
            if(id[i] == searchId){

                for(int j = i; j < count - 1; ++j){
                    id[j] = id[j + 1];
                    name[j] = name[j + 1];
                    basicSalary[j] = basicSalary[j + 1];
                    hra[j] = hra[j + 1];
                    da[j] = da[j + 1];
                    grossSalary[j] = grossSalary[j + 1];
                }

                count--;

                System.out.println("Employee deleted successfully.");
                return;
            }
        }

        System.out.println("Employee not found.");
    }
}