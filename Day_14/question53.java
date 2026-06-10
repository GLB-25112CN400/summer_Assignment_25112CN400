// Question 53 -- WAP to Linear Search

import java.util.Scanner;

public class question53 {
    public static void main(String[] args) {
        int n, key;

        //Input size
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        //input elements
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        //Input key to search for
        System.out.print("Enter element to search: ");
        key = sc.nextInt();

        //linear Search
        int idx = -1;
        for(int i = 0; i < n; ++i) {
            if(arr[i] == key) {
                idx = i;
                break;
            }
        }

        if(idx == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at index: " + idx);
        }
    }
}