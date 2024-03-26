package com.java.enumuration;

enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

public class EnumDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Month currentMonth = Month.MARCH;
	        System.out.println("We are in " + currentMonth);
	}

}
