// Question 67 -- WAP to Intersection of Arrays

import java.util.Scanner;

public class question67 {
    public static void main(String[] args) {
        int n1,n2;

        //Input sizes
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

        System.out.print("Intersection: ");
        for(int i=0;i<n1;++i){
            for(int j=0;j<n2;++j){

                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    break;
                }
            }
        }
    }
}