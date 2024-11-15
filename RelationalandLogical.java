package AllProgram;

public class RelationalandLogical {
	public static void main(String[] args) {
		
		int a =15; int b=10;
		System.out.println("RelationalOperators");
		System.out.println("Greater than (a>b)"+(a>b));
		System.out.println("Lesser than(b<a))" +(b<a));
		System.out.println("Lesser than equal(b<=a))" +(b<=a));
		System.out.println("Equals too(a==b)"+(a==b));
		System.out.println("Not equal to(a!=b)"+(a!=b));
		
		System.out.println("LogicalOperators");
        System.out.println("And operator && (a < b) && (a==b)"+((a < b) && (a == b)));
        System.out.println("Or operator(a > b) || (a != b):"+((a > b) || (a != b)));
        System.out.println("Not operator!(a == b) :"+(a == b));
	}

}
