//Question 7--WAP to find product of digits

import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        int n,prod=1;

        //Input number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        n=sc.nextInt();    

        int temp=n;

        //calculating product of every digit
        while(temp>0){
            int lastdigit=temp%10;
            prod*=lastdigit;
            temp/=10;
        }

        System.out.println("Product of digits of "+n+" = "+prod);
    }
}
