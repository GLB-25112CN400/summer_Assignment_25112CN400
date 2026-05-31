//Question 15-- WAP to check Armstrong number
import java.util.Scanner;

public class question15 {
    public static void main(String[] args) {

        int n,sum=0;

        // Input number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();

        // Count digits
        int count = 0;
        int temp = n;

        while(temp > 0){
            count++;
            temp /= 10;
        }

        // Calculate Armstrong sum
        temp = n;

        while(temp > 0){

            int digit = temp % 10;

            sum += Math.pow(digit, count);

            temp /= 10;
        }

        // Check Armstrong number
        if(sum == n){
            System.out.println("Entered Number is an Armstrong number");
        }
        else{
            System.out.println("Entered Number is not an Armstrong number");
        }
    }
}