// Question 71 -- WAP to Binary Search

import java.util.Scanner;
public class question71 {
    public static void main(String[] args) {
        int n,key;

        //Input size
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        //input array
        System.out.println("Enter sorted array elements: (Note: elements should be sorted)");
        for(int i=0; i<n; ++i){
            arr[i] = sc.nextInt();
        }

        //Input key
        System.out.print("Enter element to search: ");
        key = sc.nextInt();

        int start = 0;
        int end = n-1;
        int idx = -1;

        while(start <= end){
            int mid = (start + end)/2;
            if(key == arr[mid]){
                idx = mid;
                break;
            }

            else if(key > arr[mid]){   //right
                start = mid + 1;
            }

            else{                      //left
                end = mid - 1;
            }
        }

        if(idx == -1){
            System.out.println("Element not found");
        }

        else{
            System.out.println("Element found at index: " + idx);
        }
    }
}