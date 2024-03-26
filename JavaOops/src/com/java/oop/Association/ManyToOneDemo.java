package com.java.oop.Association;

import java.util.ArrayList;
import java.util.List;

// Product class representing a product
class Product {
    private String name;
    private double price;
    private Category category;

    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }
}

// Category class representing a product category
class Category {
    private String name;
    private List<Product> products;

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}

public class ManyToOneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Category electronics = new Category("Electronics");

        // Create products
        Product laptop = new Product("Laptop", 1200.0, electronics);
        Product smartphone = new Product("Smartphone", 800.0, electronics);

        // Add products to the category
        electronics.addProduct(laptop);
        electronics.addProduct(smartphone);

        // Print information
        System.out.println("Products in the " + electronics.getName() + " category:");
        List<Product> products = electronics.getProducts();
        for (Product product : products) {
            System.out.println("Name: " + product.getName() + ", Price: $" + product.getPrice());
        }
	}

}
