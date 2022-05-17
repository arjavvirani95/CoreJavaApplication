package javaString;

public class SubString {
	
	public static void main(String[] args) {
		
		String name = "Selenium And Java Interview Questions";
		System.out.println(name.contains("Java")); // true
		System.out.println(name.contains("java")); // false
		System.out.println(name.contains("Interview")); // true
		System.out.println(name.contains("questions")); // false
	}
}
