// Question 59 -- WAP to Rotate Array Right by One Position

import java.util.Scanner;

public class question59 {
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

        //right rotation
        int lastEle = arr[n - 1];
        for(int i = n - 1; i > 0; --i) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastEle;


        System.out.print("Array after right rotation: ");
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}