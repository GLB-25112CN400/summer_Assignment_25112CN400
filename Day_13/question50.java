// Question 50 -- WAP to Find Sum and Average of Array

import java.util.Scanner;

public class question50 {
    public static void main(String[] args) {

        int n;
        int sum = 0;

        //Input size
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        //input elements & calculating sum 
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        //calculating average
        float avg = (float)sum / n;

        
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}