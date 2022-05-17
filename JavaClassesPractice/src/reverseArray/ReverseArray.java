package reverseArray;

public class ReverseArray {
	
	public static void main(String[] args) {
		int [] arr = {10,20,30,40};
		int k = arr.length-1;
			for(int i = k; k>=0; k--) {
				System.out.println(arr[k]);
			}
		}
		
		
}
