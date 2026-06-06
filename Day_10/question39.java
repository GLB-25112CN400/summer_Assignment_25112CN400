// Question 39 -- WAP to Print Number Pyramid
import java.util.Scanner;

public class question39 {
    public static void main(String[] args) {

        int n;

        //Input no. of rows
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        n = sc.nextInt();

        //printing pattern
        for(int i = 1; i <= n; ++i) {
            int temp=1;
            for(int j = 1; j <= n + i - 1; ++j) {
                
                if(j <= n - i) {
                    System.out.print(" ");
                }
                else {

                    if(j<n) {
                        System.out.print(temp++);
                    }
                    else {
                        System.out.print(temp--);
                    }
                }
            }

            System.out.println();
        }
    }
}