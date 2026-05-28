//Question 1 -- Write a program to calculate sum of first N Natural numbers.

import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        n=sc.nextInt();       //Input N (As sum of N natural numbers is to be calculated)

        for(int i=1;i<=n;++i){
            sum+=i;           //Calculating sum of first N natural numbers, 1 to n;
        }

        System.out.println("Sum of first "+ n+" natural numbers= "+sum);


        
    }
}
