package javaQuations;

public class ContainAlphaOrNot {

	public static void main(String[] args) {

		char c = 's';
		
		if((c>='a' && c<='z') || (c>='A' && c<='Z')) {
			System.out.println(c+" is an aphabate");
		}else {
			System.out.println(c+" is not an aphabate");
		}
	}

}
