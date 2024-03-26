package com.java.enumuration;

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day today = Day.MONDAY;

		// Switch statement to perform different actions based on the day
		switch (today) {
		case MONDAY:
			System.out.println("Today is Monday");
			break;
		case TUESDAY:
			System.out.println("Today is Tuesday");
			break;
		// More cases for other days...
		default:
			System.out.println("It's not a weekday");
		}
	}

}
