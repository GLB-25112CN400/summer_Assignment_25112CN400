// Question 54 -- WAP to Find Frequency of an Element

import java.util.Scanner;

public class question54 {
    public static void main(String[] args) {
        int n, key;
        int f = 0;

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

        //input key element for which freq is to be found
        System.out.print("Enter element: ");
        key = sc.nextInt();

        //counting frequency
        for(int i = 0; i < n; ++i) {
            if(arr[i] == key) {
                f++;
            }
        }

        System.out.println("Frequency = " + f);
    }
}