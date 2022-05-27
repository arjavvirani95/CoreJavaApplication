package javaQuations;

public class NumberofDigitfromString {

	public static void main(String[] args) {
		
		//12345 -- 5
		//123 -- 3
		
		int num = 1234;
		int count = 0;
		
		while(num != 0) {
			num = num/10;
			++count;
		}
		System.out.println("number of digit is :"+count);
	}
}
