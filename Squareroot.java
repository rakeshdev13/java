package AllProgram;

public class Squareroot {
	public static void main(String[] args) {
		int num =36;
    	int sqr =(int)Math.sqrt(num); //using the math Operator to find the square root of num
		int temp =sqr*sqr; // here we're multiplying two times the sqr value and storing in temp
		         
		
		System.out.println(sqr);
		
		if(temp==num) {
			System.out.println("It is a Perfect Square number");
			System.out.println(num+" " + "is thwe sqaure root of" +" "+  sqr);
			
		}else {
			System.out.println("It is not a Perfect Square number");
		}
	}

}
