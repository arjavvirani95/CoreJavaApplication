package javaQuations;

public class PrintLPatter {
	public static void main(String[] args) {
		
		solution(5);
		
	}
	public static void solution(int N) {
        for(int i=1; i<N; i++){
            System.out.println("L");
        }
        for(int i=1; i<=N; i++){
            System.out.print("L");
        }
    }
}
