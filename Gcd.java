package pre_launch;
import java.util.Scanner;

public class Gcd {
	public static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return findGCD(num2, num1 % num2);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

       
        int gcd = findGCD(number1, number2);

        
        System.out.println("The GCD or HCF of " + number1 + " and " + number2 + " is: " + gcd);

        sc.close();
        

	}

}
