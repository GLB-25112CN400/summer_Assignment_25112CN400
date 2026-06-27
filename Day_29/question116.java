// Question 116 -- WAP to Create Online Shopping Cart System

import java.util.Scanner;

public class question116 {

    static Scanner sc = new Scanner(System.in);

    static int productId[] = new int[100];
    static String productName[] = new String[100];
    static int quantity[] = new int[100];
    static double price[] = new double[100];

    static int count = 0;

    public static void main(String[] args) {

        while(true){
            System.out.println("\n===== Online Shopping Cart System =====");
            System.out.println("1. Add product to cart");
            System.out.println("2. View cart");
            System.out.println("3. Search product");
            System.out.println("4. Remove product from cart");
            System.out.println("5. Calculate total bill");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    addProduct();
                    break;

                case 2:
                    viewCart();
                    break;

                case 3:
                    searchProduct();
                    break;

                case 4:
                    removeProduct();
                    break;

                case 5:
                    calculateBill();
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
            System.out.println("Cart is full.");
            return;
        }

        System.out.print("Enter product Id: ");
        int newId = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < count; ++i){
            if(productId[i] == newId){
                System.out.println("Product Id already exists in cart.");
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
        System.out.println("Product added to cart successfully.");
    }

    // View cart
    static void viewCart(){
        if(count == 0){
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("\n--------------------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-10s %-10s %-12s\n","Id","Product","Quantity","Price","Total");
        System.out.println("--------------------------------------------------------------------------");

        for(int i = 0; i < count; ++i){
            double total = quantity[i] * price[i];

            System.out.printf("%-10d %-20s %-10d %-10.2f %-12.2f\n",productId[i], productName[i], quantity[i], price[i], total);
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
                System.out.println("Total        : " + (quantity[i] * price[i]));

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
                System.out.println("Product removed from cart successfully.");
                return;
            }
        }

        System.out.println("Product not found.");
    }

    // Calculate total bill
    static void calculateBill(){
        if(count == 0){
            System.out.println("Cart is empty.");
            return;
        }
        double bill = 0;

        for(int i = 0; i < count; ++i){
            bill += quantity[i] * price[i];
        }

        System.out.println("----------------------------");
        System.out.printf("Total bill : %.2f\n", bill);
        System.out.println("----------------------------");
    }
}