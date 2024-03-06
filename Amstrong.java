package pre_launch;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Armstrong numbers between 100 and 500:");
        for (int i = 100; i <= 500; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }


    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0;
        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        return result == number;
    }


	}


