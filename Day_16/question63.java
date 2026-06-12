// Question 63 -- WAP to Find Pair with Given Sum

import java.util.Scanner;

public class question63 {
    public static void main(String[] args) {
        int n,target;

        //Input size
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        //input elements
        System.out.println("Enter array elements:");
        for(int i=0; i<n; ++i) {
            arr[i] = sc.nextInt();
        }

        //input target sum
        System.out.print("Enter target sum: ");
        target = sc.nextInt();

        boolean found = false;

        //finding pair with given sum
        for(int i=0; i<n; ++i){
            for(int j=i+1; j<n; ++j) {
                if(arr[i] + arr[j] == target) {
                    System.out.println("Pair is: " + arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }
        if(!found) {
            System.out.println("No pair found");
        }
    }
}