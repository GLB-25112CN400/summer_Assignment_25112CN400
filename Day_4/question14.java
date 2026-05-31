//Question 14--WAP to find nth fibonacci term

import java.util.Scanner;

public class question14 {
    public static void main(String[] args) {
        int term1=0,term2=1,n;

        //Input number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n to print nth fibonacci term: ");
        n=sc.nextInt(); 

        //nth fibonacci term
        if(n==1){
            System.out.println(term1);
            return;
        } 
        if(n==2) {
            System.out.println(term2);
            return;
        }

        for(int i=3;i<=n;++i){
            int term3=term1+term2;
            if(i==n) System.out.println(term3);
            term1=term2;
            term2=term3;
        }


    }
}
