package pre_launch;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        
        int sum = 0;
        int numberOfIntegers = 10;

        
        for (int i = 0; i < numberOfIntegers; i++) {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            sum += num;
        }

      
        double average = (double) sum / numberOfIntegers;


        System.out.println("The average value of the 10 integers is: " + average);

        scanner.close();

	}

}
