package javaQuations;

import java.util.Scanner;

public class PrintInteger {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Please Enter One Number: ");
		
		int num = reader.nextInt();
		System.out.println("Your num is: " +num);
	}
}
