package javaQuations;

public class PostiveOrNegative {

	public static void main(String[] args) {

		double number = 55;
		
		if(number < 0.0) {
			System.out.println(number +" is nagative number");
		}else if(number > 0.0){
			System.out.println(number +" is positive number");
		}else {
			System.out.println(number +" is zero");
		}
	}

}
