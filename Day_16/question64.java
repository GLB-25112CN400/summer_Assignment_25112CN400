// Question 64 -- WAP to Remove Duplicates from Array

import java.util.Scanner;

public class question64 {
    public static void main(String[] args) {

        int n;

        //Input size
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        //input elements
        System.out.println("Enter array elements:");
        for(int i=0; i<n; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array after removing duplicates: ");
        for(int i=0; i<n; ++i) {
            boolean duplicate = false;

            for(int j=0; j<i; ++j) {
                if(arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if(duplicate==false) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}