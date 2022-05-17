package javaQuations;

public class PrintFibbonaciSeries {

	public static void main(String[] args) {

		//0 1 1 2 3 5 8 13 21 34
		
		int num = 10;
		int t1 = 0;
		int t2 = 1;
		
		for(int i=1; i<=num; i++) {
			System.out.println(t1);
			int sum = t1+t2; //1
			t1 = t2; 		//1
			t2 = sum;		//1
		}
		System.out.println("------------------");
		int k1=0;
		int k2=1;
		int j = 1;
		while(j<=num) {
			System.out.println(k1);
			int sum2 = k1+k2;
			k1 = k2;
			k2 = sum2;
			j++;
		}
	}

}
