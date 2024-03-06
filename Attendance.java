package pre_launch;
import java.util.Scanner;
public class Attendance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number of classes held:");
	        int classesHeld = scanner.nextInt();
	        
	        System.out.println("Enter the number of classes attended:");
	        int classesAttended = scanner.nextInt();
	        
	        double attendancePercentage = (double) (classesAttended / classesHeld )* 100;
	        
	        System.out.printf("Attendance percentage: %.2f%%\n", attendancePercentage);
	        
	        System.out.println("Do you have a medical cause? (Y/N):");
	        char medicalCause = scanner.next().charAt(0);
	        
	        if (attendancePercentage >= 75 || medicalCause == 'Y' || medicalCause == 'y') {
	            System.out.println("The student is allowed to sit in the exam.");
	        } else {
	            System.out.println("The student is not allowed to sit in the exam.");
	        }
	        
	        scanner.close();
      
	}

}
