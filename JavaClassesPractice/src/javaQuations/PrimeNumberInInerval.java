package javaQuations;

public class PrimeNumberInInerval {

	public static void main(String[] args) {

		//20 to 50 
		int low = 23;
		int high = 53;
		
		while(low <= high) {
			boolean flag = false;
			for(int i=2; i<low/2; i++)
			{
				if(low % i == 0) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.println(low + "");
			}
			low++;
		}
		
	}

}
