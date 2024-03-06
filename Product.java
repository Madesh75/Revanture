package pre_launch;
import java.util.Scanner;
public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        long product = 1;
        String input;

        System.out.println("Enter integers or press 'q' to quit:");

        while (true) {
            input = sc.next();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
                int number = Integer.parseInt(input);
                sum += number;
                product *= number;
                count++;
        }

        double average = count > 0 ? (double) sum / count : 0;

        System.out.println("Average of the given numbers : " + average);
        System.out.println("Product of the given num: " + product);

        sc.close();

	}

}
