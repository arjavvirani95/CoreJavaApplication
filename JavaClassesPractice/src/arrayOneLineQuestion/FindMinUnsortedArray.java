package arrayOneLineQuestion;

public class FindMinUnsortedArray {
	public static void main(String[] args) {
		int [] arr = {1,45,68,455,985};
		int min = Integer.MAX_VALUE;
		
		for(int element : arr) {
			if(element<min) {
				min = element;
			}
		}
		System.out.println("Minumum value is "+min);
	}
}
