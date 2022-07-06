package javaQuations;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 2896;	//4321
		int rev = 0;
		
		while(num != 0) {	//check num its not 0
			int n = num % 10;	
			rev = rev * 10 + n; //4
			num = num/10;	//123
			
		}
		System.out.println("Reverse Num is :"+rev);
	}

}
