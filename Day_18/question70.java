// Question 70 -- WAP to Selection Sort

import java.util.Scanner;
public class question70 {
    public static void main(String[] args) {
        int n;

        //Input size
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        //input array
        System.out.println("Enter array elements:");
        for(int i=0; i<n; ++i){
            arr[i] = sc.nextInt();
        }

        //Selection Sort
        for(int i=0; i<=n-2; ++i){
            int minPos = i;

            //finding minimum element
            for(int j=i+1; j<=n-1; ++j){
                if(arr[j] < arr[minPos]){
                    minPos = j;
                }
            }

            //swap
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }

        System.out.print("Sorted Array: ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}