// Question 56 -- WAP to Find Duplicates in Array

import java.util.Scanner;

public class question56 {
    public static void main(String[] args) {
        int n;

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

        //finding duplicates
        System.out.print("Duplicate elements are: ");
        for(int i = 0; i < n; ++i) {
            boolean duplicateFound = false;

            for(int j = 0; j < i; ++j) { //for checking if duplicates already found of the element(due to previous index)
                if(arr[i] == arr[j]) {
                    duplicateFound = true;
                    break;
                }
            }

            if(duplicateFound) continue;

            for(int j = i + 1; j < n; ++j) {
                if(arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}