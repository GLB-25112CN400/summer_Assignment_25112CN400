// Question 65 -- WAP to Merge Arrays

import java.util.Scanner;

public class question65 {
    public static void main(String[] args) {
        int n1,n2;

        //Input size of both arrays
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        n1 = sc.nextInt();

        System.out.print("Enter size of second array: ");
        n2 = sc.nextInt();

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        //Input 1st array
        System.out.println("Enter first array elements:");
        for(int i=0;i<n1;++i){
            arr1[i]=sc.nextInt();
        }

        //Input 2nd array
        System.out.println("Enter second array elements:");
        for(int i=0;i<n2;++i){
            arr2[i]=sc.nextInt();
        }

        //merging array
        int merge[] = new int[n1+n2];
        int idx=0;

        for(int ele : arr1){
            merge[idx++]=ele;
        }

        for(int ele : arr2){
            merge[idx++]=ele;
        }

        //printing merged array
        System.out.print("Merged Array: ");
        for(int ele : merge){
            System.out.print(ele+" ");
        }
    }
}