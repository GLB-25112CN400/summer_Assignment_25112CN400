//Question 2 -- Write a program to Print Multiplication table of a given number.
import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {

        int n;                     //Input number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        n=sc.nextInt();       

        //Printing Multiplication Table
        for(int i=1;i<=10;++i){
            System.out.println(n+"*"+i+" = "+n*i);
        }
}   
}
