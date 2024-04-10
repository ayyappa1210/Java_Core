package com.java.inner;

class ShoppingCart {
	private double totalPrice;
	
	public void addItem(String itemName,double itemPrice) {
		class CartItem {
			private String name;
			private double price;
			public CartItem(String name, double price) {
				super();
				this.name = name;
				this.price = price;
			}
			
			public void display() {
				System.out.println("Name:"+name+" Price:"+price);
			}
		}
		CartItem item = new CartItem(itemName, itemPrice);
		totalPrice+=itemPrice;
		item.display();
	}

	public double getTotalPrice() {
		return totalPrice;
	}
	
	
	
}
public class LocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart cart = new ShoppingCart();
		cart.addItem("Book", 500);
		cart.addItem("Charger", 200);
		cart.addItem("Headphones", 1000);
		
		System.out.println("Total Price: "+cart.getTotalPrice());

	}

}
