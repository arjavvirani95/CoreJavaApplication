package javaQuations;

public class FindFactorialNum {

	public static void main(String[] args) {
		
		//!5 > 5*4*3*2*1 = 120
		//!4 = 20
		//!0 = 1
		int num = 5;
		getFact(num);
		
	}
	public static void getFact(int num) {
		int fact = 1;
		for(int i=1; i<=num; i++) {
			fact = fact * i;
			
		}
		System.out.println("Fact of num is "+ fact);
	}

}
