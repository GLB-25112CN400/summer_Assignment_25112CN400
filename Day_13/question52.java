// Question 52 -- WAP to Count Even and Odd Elements

import java.util.Scanner;

public class question52 {
    public static void main(String[] args) {

        int n;
        int even = 0;
        int odd = 0;

        //Input size
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        //Input elements
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        //counting even and odd elements
        for(int i = 0; i < n; ++i) {
            if(arr[i] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }

        System.out.println("Even elements = " + even);
        System.out.println("Odd elements = " + odd);
    }
}