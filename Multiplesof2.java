package AllProgram;
import java.util.Scanner;

public class Multiplesof2 {
	public static void main(String[] args) {
		System.out.println("Enter a Whole number");
		Scanner obj = new Scanner(System.in);
		int num =obj.nextInt();
		
		if(num%2==0) {
			System.out.println("Entered Number is multiple of 2");
		}
		else {
			System.out.println("Entered Number is not multiple of 2");
			obj.close();
		}
	}

}
