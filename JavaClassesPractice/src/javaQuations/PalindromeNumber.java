package javaQuations;

public class PalindromeNumber {

	public static void main(String[] args) {

		int number  = 1001;
		int rev = 0;
		int actualnum = number; 
		while(number != 0) {
			int n = number % 10;
			rev = rev * 10 + n;
			number = number/10;
		}
		System.out.println(actualnum);
		if(actualnum == rev) {
			System.out.println("Number is palindrome number");
		}else {
			System.out.println("Number is not a palindrome number");
		}
		
	}

}
