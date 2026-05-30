//Question 12-- WAP to find LCM of two numbers
import java.util.Scanner;

public class question12 {
    public static void main(String[] args) {
        int n1, n2, lcm;

        // Input two numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        n2 = sc.nextInt();

        // Finding LCM
        int largest = Math.max(n1, n2);

        for(int i = largest; ; ++i) {

            if(i % n1 == 0 && i % n2 == 0) {
                lcm = i;
                break;
            }
        }

        System.out.println("Least Common Multiple(LCM) of two numbers is: " + lcm);
    }
}