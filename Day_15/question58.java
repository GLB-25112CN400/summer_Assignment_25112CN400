// Question 58 -- WAP to Rotate Array Left by One Position

import java.util.Scanner;

public class question58 {
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

        //Left rotation
        int firstEle = arr[0];
        for(int i = 0; i < n - 1; ++i) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = firstEle;


        System.out.print("Array after left rotation: ");
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}