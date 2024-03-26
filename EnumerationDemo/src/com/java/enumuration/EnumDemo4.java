package com.java.enumuration;

enum CoffeeSize {
    SMALL(8), MEDIUM(12), LARGE(16);

    private int ounces;

    CoffeeSize(int ounces) {
        this.ounces = ounces;
    }

    public int getOunces() {
        return ounces;
    }
}
public class EnumDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CoffeeSize size = CoffeeSize.MEDIUM;
	        System.out.println("You ordered a " + size + " coffee, which is " + size.getOunces() + " ounces.");
	}

}
