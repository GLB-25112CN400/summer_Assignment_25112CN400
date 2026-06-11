// Question 57 -- WAP to Reverse Array

import java.util.Scanner;

public class question57 {
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

        //Array reverse -- two pointer approach
        int i = 0, j = n - 1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.print("Reversed array: ");
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}