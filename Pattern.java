package pre_launch;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        for (int i = 1; i <= 4; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        for (int i = 1; i <= 4; i++) {
	          
	            for (int j = 1; j < i; j++) {
	                System.out.print(" ");
	            }
	      
	            for (int k = 1; k <= 2 * (5 - i) - 1; k++) {
	                if ((k % 2) == 0)
	                    System.out.print("0");
	                else
	                    System.out.print("1");
	            }
	            System.out.println();
	        }

	}

}
