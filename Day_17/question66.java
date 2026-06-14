// Question 66 -- WAP to Union of Arrays

import java.util.Scanner;

public class question66 {
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
        System.out.println("Enter first array:");
        for(int i=0;i<n1;++i){
            arr1[i]=sc.nextInt();
        }
        //Input 2nd array
        System.out.println("Enter second array:");
        for(int i=0;i<n2;++i){
            arr2[i]=sc.nextInt();
        }

        System.out.print("Union: ");
        //Print first array
        for(int ele : arr1){
            System.out.print(ele+" ");
        }
        //Print only unique elements from second array
        for(int i=0;i<n2;++i){
            boolean duplicate=false;

            for(int j=0;j<n1;++j){
                if(arr2[i]==arr1[j]){
                    duplicate=true;
                    break;
                }
            }

            if(duplicate==false){
                System.out.print(arr2[i]+" ");
            }
        }
    }
}