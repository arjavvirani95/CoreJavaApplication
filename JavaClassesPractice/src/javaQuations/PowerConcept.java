package javaQuations;

public class PowerConcept {

	public static void main(String[] args) {

		//3^4 = 81
		int base = 2;
		int power = 9;
		System.out.println(Math.pow(base, power)); // Direct Function

		long result = 1;
		
		while(power != 0) {
			result *= base; //result * power
			--power; 
		}
		System.out.println(result);
		
	}

}
