// Question 60 -- WAP to Move Zeroes to End

import java.util.Scanner;

public class question60 {
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

        //Moving zeroes to end
        int idx = 0;
        for(int i = 0; i < n; ++i) {
            if(arr[i] != 0) {
                arr[idx] = arr[i];
                ++idx;
            }
        }
        for(int i = idx; i < n; ++i) {
            arr[i] = 0;
        }

        System.out.print("Array after moving zeroes to end: ");
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}