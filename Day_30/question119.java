// Question 119 -- WAP to Create mini employee management system 

import java.util.Scanner;

public class question119 {

    static Scanner sc = new Scanner(System.in);

    static int id[] = new int[100];
    static String name[] = new String[100];
    static String department[] = new String[100];

    static double basicSalary[] = new double[100];
    static double bonus[] = new double[100];
    static double netSalary[] = new double[100];

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
            System.out.println("\n=====Mini Employee Management System =====");
            System.out.println("1. Add employee");
            System.out.println("2. View employees");
            System.out.println("3. Search employee by Id");
            System.out.println("4. Search employee by name");
            System.out.println("5. Search employee by department");
            System.out.println("6. Update employee");
            System.out.println("7. Delete employee");
            System.out.println("8. Display total salary expenses");
            System.out.println("9. Total employees");
            System.out.println("10. Exit");

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
                    searchById();
                    break;

                case 4:
                    searchByName();
                    break;

                case 5:
                    searchByDepartment();
                    break;

                case 6:
                    updateEmployee();
                    break;

                case 7:
                    deleteEmployee();
                    break;

                case 8:
                    displaySalaryExpenses();
                    break;

                case 9:
                    totalEmployees();
                    break;

                case 10:
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

        System.out.print("Enter department: ");
        department[count] = sc.nextLine();

        System.out.print("Enter basic salary: ");
        basicSalary[count] = sc.nextDouble();

        bonus[count] = calculateBonus(basicSalary[count]);
        netSalary[count] = calculateNetSalary(basicSalary[count]);

        count++;
        System.out.println("Employee added successfully.");
    }

    // View employees
    static void viewEmployees(){
        if(count == 0){
            System.out.println("No employee records found.");
            return;
        }

        System.out.println("\n------------------------------------------------------------------------------------------------");
        System.out.printf("%-8s %-20s %-18s %-15s %-12s %-15s\n","Id","Name","Department","Basic","Bonus","Net salary");
        System.out.println("------------------------------------------------------------------------------------------------");

        for(int i = 0; i < count; ++i){
            System.out.printf("%-8d %-20s %-18s %-15.2f %-12.2f %-15.2f\n",id[i],name[i],department[i],basicSalary[i],bonus[i],netSalary[i]);
        }
    }

    // Search employee by Id
    static void searchById(){
        if(count == 0){
            System.out.println("No employee records found.");
            return;
        }

        System.out.print("Enter employee Id: ");
        int searchId = sc.nextInt();

        for(int i = 0; i < count; ++i){
            if(id[i] == searchId){
                System.out.println("\nEmployee found");
                System.out.println("Employee Id  : " + id[i]);
                System.out.println("Name         : " + name[i]);
                System.out.println("Department   : " + department[i]);
                System.out.println("Basic salary : " + basicSalary[i]);
                System.out.println("Bonus        : " + bonus[i]);
                System.out.println("Net salary   : " + netSalary[i]);

                return;
            }
        }

        System.out.println("Employee not found.");
    }


    // Search employee by name
    static void searchByName(){
        if(count == 0){
            System.out.println("No employee records found.");
            return;
        }

        sc.nextLine();

        System.out.print("Enter employee name: ");
        String searchName = sc.nextLine();

        for(int i = 0; i < count; ++i){
            if(name[i].equalsIgnoreCase(searchName)){
                System.out.println("\nEmployee found");
                System.out.println("Employee Id  : " + id[i]);
                System.out.println("Name         : " + name[i]);
                System.out.println("Department   : " + department[i]);
                System.out.println("Basic salary : " + basicSalary[i]);
                System.out.println("Bonus        : " + bonus[i]);
                System.out.println("Net salary   : " + netSalary[i]);

                return;
            }
        }

        System.out.println("Employee not found.");
    }


    // Search employee by department
    static void searchByDepartment(){
        if(count == 0){
            System.out.println("No employee records found.");
            return;
        }

        sc.nextLine();

        System.out.print("Enter department: ");
        String searchDepartment = sc.nextLine();

        boolean found = false;
        for(int i = 0; i < count; ++i){
            if(department[i].equalsIgnoreCase(searchDepartment)){
                if(!found){
                    System.out.println("\nEmployees found");
                    System.out.println("-----------------------------------------------------------------------------------------------");
                    System.out.printf("%-8s %-20s %-18s %-15s %-12s %-15s\n","Id","Name","Department","Basic","Bonus","Net salary");
                    System.out.println("-----------------------------------------------------------------------------------------------");
                }

                found = true;

                System.out.printf("%-8d %-20s %-18s %-15.2f %-12.2f %-15.2f\n",id[i],name[i],department[i],basicSalary[i],bonus[i],netSalary[i]);
            }
        }

        if(!found){
            System.out.println("No employees found in this department.");
        }
    }


    // Update employee
    static void updateEmployee(){
        if(count == 0){
            System.out.println("No employee records found.");
            return;
        }

        System.out.print("Enter employee Id: ");
        int searchId = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < count; ++i){
            if(id[i] == searchId){

                System.out.println("Enter 'same' if you don't want to change the name or department.");

                //update name
                System.out.print("Enter new name: ");
                String newName = sc.nextLine();

                if(!newName.equalsIgnoreCase("same")){
                    name[i] = newName;
                }

                //update department
                System.out.print("Enter new department: ");
                String newDepartment = sc.nextLine();

                if(!newDepartment.equalsIgnoreCase("same")){
                    department[i] = newDepartment;
                }

                //update salary
                System.out.print("Update basic salary? (y/n): ");
                char ch = sc.next().charAt(0);

                if(ch == 'y' || ch == 'Y'){

                    System.out.print("Enter new basic salary: ");
                    basicSalary[i] = sc.nextDouble();

                    bonus[i] = calculateBonus(basicSalary[i]);
                    netSalary[i] = calculateNetSalary(basicSalary[i]);
                }

                System.out.println("Record updated successfully.");
                return;
            }
        }

        System.out.println("Employee not found.");
    }


    // Delete employee
    static void deleteEmployee(){
        if(count == 0){
            System.out.println("No employee records found.");
            return;
        }

        System.out.print("Enter employee Id: ");
        int searchId = sc.nextInt();

        for(int i = 0; i < count; ++i){
            if(id[i] == searchId){

                for(int j = i; j < count - 1; ++j){
                    id[j] = id[j + 1];
                    name[j] = name[j + 1];
                    department[j] = department[j + 1];
                    basicSalary[j] = basicSalary[j + 1];
                    bonus[j] = bonus[j + 1];
                    netSalary[j] = netSalary[j + 1];
                }

                count--;
                System.out.println("Employee deleted successfully.");
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    // Display total salary expenses
    static void displaySalaryExpenses(){
        if(count == 0){
            System.out.println("No employee records found.");
            return;
        }

        double totalExpenses = 0;
        for(int i = 0; i < count; ++i){
            totalExpenses += netSalary[i];
        }

        System.out.printf("Total salary expenses : %.2f\n", totalExpenses);
    }


    // Total employees
    static void totalEmployees(){
        System.out.println("Total employees : " + count);
    }


    // Calculate bonus
    static double calculateBonus(double basicSalary){

        if(basicSalary >= 100000){
            return basicSalary * 0.20;
        }
        else if(basicSalary >= 50000){
            return basicSalary * 0.10;
        }
        else{
            return basicSalary * 0.05;
        }
    }


    // Calculate net salary
    static double calculateNetSalary(double basicSalary){

        return basicSalary + calculateBonus(basicSalary);
    }

}