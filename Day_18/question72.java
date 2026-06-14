// Question 72 -- WAP to Sort Array in Descending Order

// Bubble Sort Descending
import java.util.Scanner;
public class question72 {
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

        //Descending Bubble Sort   (just change in relational operator)
        for(int turn=0; turn<=n-2; ++turn){
            for(int j=0; j<=n-2-turn; ++j){
                if(arr[j] < arr[j+1]){

                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("Array in Descending Order: ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}