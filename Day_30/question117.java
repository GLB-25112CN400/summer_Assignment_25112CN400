// Question 117 -- WAP to create student record system using array and strings

//Note: all day 30 solutions are as considerably advanced to previous solutions. (previous management systems also included array, strings)
import java.util.Scanner;

public class question117 {

    static Scanner sc = new Scanner(System.in);

    static int id[] = new int[100];
    static String name[] = new String[100];
    static String branch[] = new String[100];
    static double marks[] = new double[100];

    static String grade[] = new String[100];
    static String result[] = new String[100];

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
            System.out.println("\n===== Student Record System =====");   
            System.out.println("1. Add student");
            System.out.println("2. View students");
            System.out.println("3. Search student by Id");
            System.out.println("4. Search student by name");
            System.out.println("5. Update student");
            System.out.println("6. Delete student");
            System.out.println("7. Display topper");
            System.out.println("8. Display average marks");
            System.out.println("9. Total students");
            System.out.println("10. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchById();
                    break;

                case 4:
                    searchByName();
                    break;

                case 5:
                    updateStudent();
                    break;

                case 6:
                    deleteStudent();
                    break;

                case 7:
                    displayTopper();
                    break;

                case 8:
                    displayAverage();
                    break;

                case 9:
                    totalStudents();
                    break;

                case 10:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Add student
    static void addStudent(){
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

        System.out.print("Enter branch: ");
        branch[count] = sc.nextLine();

        System.out.print("Enter marks: ");
        marks[count] = sc.nextDouble();

        grade[count] = calculateGrade(marks[count]);
        result[count] = calculateResult(marks[count]);

        count++;
        System.out.println("Student added successfully.");
    }

    // View students
    static void viewStudents(){
        if(count == 0){
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.printf("%-8s %-20s %-15s %-10s %-10s %-10s\n","Id","Name","Branch","Marks","Grade","Result");
        System.out.println("-------------------------------------------------------------------------------------");

        for(int i = 0; i < count; ++i){
            System.out.printf("%-8d %-20s %-15s %-10.2f %-10s %-10s\n",id[i],name[i],branch[i],marks[i],grade[i],result[i]);
        }
    }

    // Search student by Id
    static void searchById(){
        if(count == 0){
            System.out.println("No student records found.");
            return;
        }

        System.out.print("Enter student Id: ");
        int searchId = sc.nextInt();

        for(int i = 0; i < count; ++i){
            if(id[i] == searchId){
                System.out.println("\nStudent found");
                System.out.println("Student Id : " + id[i]);
                System.out.println("Name       : " + name[i]);
                System.out.println("Branch     : " + branch[i]);
                System.out.println("Marks      : " + marks[i]);
                System.out.println("Grade      : " + grade[i]);
                System.out.println("Result     : " + result[i]);

                return;
            }
        }

        System.out.println("Student not found.");
    }


    // Search student by name
    static void searchByName(){
        if(count == 0){
            System.out.println("No student records found.");
            return;
        }

        sc.nextLine();

        System.out.print("Enter student name: ");
        String searchName = sc.nextLine();

        for(int i = 0; i < count; ++i){
            if(name[i].equalsIgnoreCase(searchName)){
                System.out.println("\nStudent found");
                System.out.println("Student Id : " + id[i]);
                System.out.println("Name       : " + name[i]);
                System.out.println("Branch     : " + branch[i]);
                System.out.println("Marks      : " + marks[i]);
                System.out.println("Grade      : " + grade[i]);
                System.out.println("Result     : " + result[i]);

                return;
            }
        }

        System.out.println("Student not found.");
    }


    // Update student
    static void updateStudent(){
        if(count == 0){
            System.out.println("No student records found.");
            return;
        }

        System.out.print("Enter student Id: ");
        int searchId = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < count; ++i){
            if(id[i] == searchId){

                System.out.println("Enter 'same' if you don't want to change a field.");

                //update name
                System.out.print("Enter new name: ");
                String newName = sc.nextLine();

                if(!newName.equalsIgnoreCase("same")){
                    name[i] = newName;
                }

                //update branch
                System.out.print("Enter new branch: ");
                String newBranch = sc.nextLine();

                if(!newBranch.equalsIgnoreCase("same")){
                    branch[i] = newBranch;
                }

                //update marks
                System.out.print("Update marks? (y/n): ");
                char ch = sc.next().charAt(0);

                if(ch == 'y' || ch == 'Y'){
                    System.out.print("Enter new marks: ");
                    marks[i] = sc.nextDouble();

                    grade[i] = calculateGrade(marks[i]);
                    result[i] = calculateResult(marks[i]);
                }

                System.out.println("Record updated successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }


    // Delete student
    static void deleteStudent(){
        if(count == 0){
            System.out.println("No student records found.");
            return;
        }

        System.out.print("Enter student Id: ");
        int searchId = sc.nextInt();

        for(int i = 0; i < count; ++i){
            if(id[i] == searchId){

                for(int j = i; j < count - 1; ++j){
                    id[j] = id[j + 1];
                    name[j] = name[j + 1];
                    branch[j] = branch[j + 1];
                    marks[j] = marks[j + 1];
                    grade[j] = grade[j + 1];
                    result[j] = result[j + 1];
                }

                count--;

                System.out.println("Student deleted successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Display topper
    static void displayTopper(){
        if(count == 0){
            System.out.println("No student records found.");
            return;
        }

        int topper = 0;

        for(int i = 1; i < count; ++i){
            if(marks[i] > marks[topper]){
                topper = i;
            }
        }

        System.out.println("\n===== Topper =====");
        System.out.println("Student Id : " + id[topper]);
        System.out.println("Name       : " + name[topper]);
        System.out.println("Branch     : " + branch[topper]);
        System.out.println("Marks      : " + marks[topper]);
        System.out.println("Grade      : " + grade[topper]);
        System.out.println("Result     : " + result[topper]);
    }


    // Display average marks
    static void displayAverage(){
        if(count == 0){
            System.out.println("No student records found.");
            return;
        }

        double sum = 0;
        for(int i = 0; i < count; ++i){
            sum += marks[i];
        }

        double average = sum / count;

        System.out.printf("Average marks : %.2f\n", average);
    }


    // Total students
    static void totalStudents(){

        System.out.println("Total number of students : " + count);
    }


    // Calculate grade
    static String calculateGrade(double marks){
        if(marks >= 90){
            return "A+";
        }
        else if(marks >= 80){
            return "A";
        }
        else if(marks >= 70){
            return "B";
        }
        else if(marks >= 60){
            return "C";
        }
        else if(marks >= 50){
            return "D";
        }
        else{
            return "F";
        }
    }


    // Calculate result
    static String calculateResult(double marks){

        if(marks >= 33){
            return "Pass";
        }

        return "Fail";
    }
}