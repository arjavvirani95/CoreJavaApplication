package javaQuations;

public class PrimeNumber {

	public static void main(String[] args) {
		//prime num is division by him self and 1; 1,13
		int num = 127;
		boolean flag = false;
		
		for(int i=2; i<=num/2; i++) {
			if(num % i == 0) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println(num +" is a prime number");
		}else {
			System.out.println(num +" is not a prime number");
		}
		
		//print length of string without using length method
		String str = "pankaj";
		System.out.println(str.toCharArray().length);
		System.out.println(str.lastIndexOf(""));
	}

}
