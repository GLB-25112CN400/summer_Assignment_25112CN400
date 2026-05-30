//Question 11-- WAP to find GCD of two numbers
import java.util.Scanner;
public class question11 {
    public static void main(String[] args) {
        int n1,n2,gcd=1;

        //Input two numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        n2 = sc.nextInt();

        //Finding GCD
        int smallest=Math.min(n1, n2); // finding smallest betweeen the two
        for(int i=2;i<=smallest;++i){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }

        System.out.println("Greatest Common Divisor(GCD) of two numbers is: "+gcd);



    }
}
