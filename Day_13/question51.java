// Question 51 -- WAP to Find Largest and Smallest Element

import java.util.Scanner;

public class question51 {
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

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        //finding largest & smallest
        for(int i = 0; i < n; ++i) {
            if(arr[i] > largest) {
                largest = arr[i];
            }

            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest element = " + largest);
        System.out.println("Smallest element = " + smallest);
    }
}