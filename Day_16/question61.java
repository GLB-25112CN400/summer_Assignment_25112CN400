// Question 61 -- WAP to Find Missing Number in Array

import java.util.Scanner;

public class question61 {
    public static void main(String[] args) {

        //assuming a number from 1 to n is missing , 

        int n;
        //Input n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        n = sc.nextInt();

        int arr[] = new int[n-1];   //as 1 is missing, n-1 elements in the array

        //input elements
        System.out.println("Enter array elements:");
        for(int i=0; i<arr.length; ++i) {
            arr[i] = sc.nextInt();
        }

        //concept--> missing no.=expected sum - array Sum

        //expected sum
        int expectedSum = n*(n+1)/2;

        // actual array sum
        int arraySum = 0;
        for(int ele : arr) {
            arraySum += ele;
        }

        //missing number
        int missing = expectedSum - arraySum;
        System.out.println("Missing number is: " + missing);
    }
}