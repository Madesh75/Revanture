package pre_launch;
import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		if(length == breadth) {
			System.out.println("It is a square");
		}else {
			System.out.println("It is a rectangle");
		}

	}

}
