// Question 49 — Write a program to Input and Display Array

import java.util.Scanner;

public class question49 {
    public static void main(String[] args) {

        int n;

        // Input size
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        //input elements
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        //printing elements
        System.out.println("Array elements are:");
        for(int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}