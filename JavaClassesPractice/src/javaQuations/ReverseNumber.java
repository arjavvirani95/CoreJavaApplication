package javaQuations;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 159870036;	//321
		int rev = 0;
		
		while(num != 0) {
			int n = num % 10;
			rev = rev * 10 + n; //4
			num = num/10;	//123
			
		}
		System.out.println("Reverse Num is :"+rev);
	}

}
