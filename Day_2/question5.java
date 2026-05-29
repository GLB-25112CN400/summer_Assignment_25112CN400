//Question 5-- WAP to find sum of digits of a given number;

import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        int n,sum=0;

        //Input number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        n=sc.nextInt();    

        int temp=n;

        //calculating sum of every digit
        while(temp>0){
            int lastdigit=temp%10;
            sum+=lastdigit;
            temp/=10;
        }

        System.out.println("Sum of digits of "+n+" = "+sum);
    }
}
