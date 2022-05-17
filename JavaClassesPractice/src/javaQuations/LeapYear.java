package javaQuations;

public class LeapYear {

	public static void main(String[] args) {

		//divisible by 4 for all the century years --  edngin with 00
		
		//century year is leap year only when its perfectly divisible by 400
		
		//1900 is not leap year
		//2004 is a leap year 
		//1600 is a leap year
		
		int year = 2012;
		boolean leap = false;
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					leap = true;
				}else {
					leap = false;
				}
			}else {
				leap = true;
			}
		}else {
			leap = false;
		}
		if(leap) {
			System.out.println(year + " is a leap year");
		}else {
			System.out.println(year+ " is not leap year");
		}
	}

}
