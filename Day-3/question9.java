//Question 9-- WAP to check whether a number is prime
import java.util.Scanner;
public class question9 {
    public static void main(String[] args) {
        int n;
        boolean isPrime=true;

        //Input number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        n=sc.nextInt(); 

        //Check whether prime or not
        for(int i=2;i<=Math.sqrt(n);++i){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        
        //printing whether prime or not
        if(isPrime){
            System.out.println("Entered Number is a prime number");

        }
        else{
            System.out.println("Entered Number is not a prime number");
        }

    }
}
