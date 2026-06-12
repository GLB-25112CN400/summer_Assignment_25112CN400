// Question 62 -- WAP to Find Maximum Frequency Element

import java.util.Scanner;

public class question62 {
    public static void main(String[] args) {

        int n;
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

        int max = 0;
        int ans = arr[0];

        //finding maximum frequency element
        for(int i=0; i<n; ++i) {
            int freq = 0;

            for(int j=0; j<n; ++j) {
                if(arr[i] == arr[j]) {
                    freq++;
                }
            }
            if(freq > max) {
                max = freq;
                ans = arr[i];
            }
        }

        System.out.println("Maximum frequency element is: " + ans);    }
}