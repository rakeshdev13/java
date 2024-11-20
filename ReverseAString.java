package AllProgram;

public class ReverseAString {
	public static void main(String[] args) {
		String word ="LEVEL";
		int l =word.length(); // using length method to store length of the word Here l=5
		String Palindrome =""; 
		
		for(int i=l-1; i>=0; i-- ) { // here i=l-1-- i=5-1,--i=4
			
			char chr =word.charAt(i); // 1st it chr will be L
			Palindrome =Palindrome+chr; // here =L
		}
		if(Palindrome.equals(word)) {
			System.out.println( Palindrome);
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}
	}

}
