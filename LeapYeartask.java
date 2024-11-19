package AllProgram;
import java.util.Scanner;

public class LeapYeartask {
	public static void main(String[] args) {
	 Scanner obj = new Scanner (System.in);
	 System.out.println("Enter a Year");
	 int Year =obj.nextInt();
	 
	 if(Year%4==0) {
		 System.out.println("It is a Leap Year");
	
	 }
	 else {
		 System.out.println("It is not a Leap Year");
	 }
		
	}

}
