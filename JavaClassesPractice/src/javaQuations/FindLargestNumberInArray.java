package javaQuations;

public class FindLargestNumberInArray {
	
	static int array[]= {21,98,13,34,100,101,45};

	public static void main(String[] args) {
		
		int maxNumber = findLargestNumber();
		System.out.println("Maximum number in the array "+ maxNumber);
		
		
	}
	
	public static int findLargestNumber() {
		int max = array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		return max;
	}

}
