package xxx;

public class PalindromeNum {
	public static void main(String[] Args) {
//	public boolean isPalindrome(int x) {
		int x = 121;
		if (x <= 0) {
//			return false;
			System.out.println("false");
		}
		String input = Integer.toString(x);
		StringBuilder input1 = new StringBuilder();

		// append a string into StringBuilder input1
		input1.append(input);

		// reverse StringBuilder input1
		input1 = input1.reverse();

		// print reversed String
		System.out.println(input1);
		System.out.println(input);
		String input2 = input1.toString();
		System.out.println(input.equals(input2));
		
//		if(x == y) {
//			System.out.println("true");
//			return true;
//		}
//		else {
//			System.out.println("false");
//			return false;
//		}
	}
}
