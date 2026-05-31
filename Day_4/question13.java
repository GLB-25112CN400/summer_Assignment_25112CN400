package Day_4;
//Question 13-- WAP to generate Fibonacci series

import java.util.Scanner;

public class question13{
    public static void main(String[] args) {
        int term1=0,term2=1,n;

        //Input number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        n=sc.nextInt(); 

        //Printing Fibonacci series with n terms
        System.out.print(term1+" "+term2+" ");
        for(int i=1;i<=n-2;++i){
            int term3=term1+term2;
            System.out.print(term3+" ");
            term1=term2;
            term2=term3;
        }
        System.out.println();
    }
}