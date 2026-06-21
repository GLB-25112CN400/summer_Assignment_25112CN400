// Question 97 -- WAP to Merge Two Sorted Arrays

import java.util.Scanner;

public class question97 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Input size of first array
        System.out.print("Input Size of First Array: ");
        int n = sc.nextInt();

        // Input size of second array
        System.out.print("Input Size of Second Array: ");
        int m = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[m];
        int c[] = new int[n + m];

        //Input first sorted array
        System.out.println("Input First Sorted Array:");
        for(int i = 0; i < n; ++i){
            a[i] = sc.nextInt();
        }

        //Input second sorted array
        System.out.println("Input Second Sorted Array:");
        for(int i = 0; i < m; ++i){
            b[i] = sc.nextInt();
        }

        //merge
        int i = 0, j = 0, k = 0;
        while(i < a.length && j < b.length){
            if(a[i] >= b[j]){
                c[k] = b[j];
                ++j;
            }
            else{
                c[k] = a[i];
                ++i;
            }
            ++k;
        }

        // add leftover elements of first array
        while(i < a.length){
            c[k++] = a[i++];
        }

        // add leftover elements of second array
        while(j < b.length){
            c[k++] = b[j++];
        }

        
        System.out.print("Merged Array: ");
        for(int x : c){
            System.out.print(x + " ");
        }
    }
}