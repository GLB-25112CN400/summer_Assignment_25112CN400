// Question 115 -- WAP to Create Inventory Management System

import java.util.Scanner;

public class question115 {

    static Scanner sc = new Scanner(System.in);

    static int productId[] = new int[100];
    static String productName[] = new String[100];
    static int quantity[] = new int[100];
    static double price[] = new double[100];

    static int count = 0;

    public static void main(String[] args) {

        while(true){
            System.out.println("\n===== Inventory Management System =====");
            System.out.println("1. Add product");
            System.out.println("2. View products");
            System.out.println("3. Search product");
            System.out.println("4. Update stock");
            System.out.println("5. Remove product");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    addProduct();
                    break;

                case 2:
                    viewProducts();
                    break;

                case 3:
                    searchProduct();
                    break;

                case 4:
                    updateStock();
                    break;

                case 5:
                    removeProduct();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Add product
    static void addProduct(){
        if(count == 100){
            System.out.println("Inventory is full.");
            return;
        }

        System.out.print("Enter product Id: ");
        int newId = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < count; ++i){
            if(productId[i] == newId){
                System.out.println("Product Id already exists.");
                return;
            }
        }

        productId[count] = newId;

        System.out.print("Enter product name: ");
        productName[count] = sc.nextLine();

        System.out.print("Enter quantity: ");
        quantity[count] = sc.nextInt();

        System.out.print("Enter price: ");
        price[count] = sc.nextDouble();

        count++;
        System.out.println("Product added successfully.");
    }

    // View products
    static void viewProducts(){
        if(count == 0){
            System.out.println("No products found.");
            return;
        }

        System.out.println("\n----------------------------------------------------------------");
        System.out.printf("%-12s %-20s %-12s %-12s\n","Id","Product","Quantity","Price");
        System.out.println("----------------------------------------------------------------");

        for(int i = 0; i < count; ++i){
            System.out.printf("%-12d %-20s %-12d %-12.2f\n",productId[i], productName[i], quantity[i], price[i]);
        }
    }

    // Search product
    static void searchProduct(){
        System.out.print("Enter product Id: ");
        int searchId = sc.nextInt();

        for(int i = 0; i < count; ++i){
            if(productId[i] == searchId){
                System.out.println("\nProduct found");
                System.out.println("Product Id   : " + productId[i]);
                System.out.println("Product name : " + productName[i]);
                System.out.println("Quantity     : " + quantity[i]);
                System.out.println("Price        : " + price[i]);

                return;
            }
        }

        System.out.println("Product not found.");
    }

    // Update stock
    static void updateStock(){
        System.out.print("Enter product Id: ");
        int searchId = sc.nextInt();

        for(int i = 0; i < count; ++i){
            if(productId[i] == searchId){
                System.out.print("Enter new quantity: ");
                quantity[i] = sc.nextInt();

                System.out.print("Enter new price: ");
                price[i]=sc.nextDouble();


                System.out.println("Stock updated successfully.");
                return;
            }
        }

        System.out.println("Product not found.");
    }

    // Remove product
    static void removeProduct(){
        System.out.print("Enter product Id: ");
        int searchId = sc.nextInt();

        for(int i = 0; i < count; ++i){
            if(productId[i] == searchId){

                for(int j = i; j < count - 1; ++j){
                    productId[j] = productId[j + 1];
                    productName[j] = productName[j + 1];
                    quantity[j] = quantity[j + 1];
                    price[j] = price[j + 1];
                }

                count--;
                System.out.println("Product removed successfully.");
                return;
            }
        }

        System.out.println("Product not found.");
    }
}