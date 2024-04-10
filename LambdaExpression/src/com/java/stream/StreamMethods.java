package com.java.stream;

import java.util.List;

public class StreamMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = List.of("Ayyappa","yalamandha","Manikumari","Venkateswarlu","Venkataramana");
		list.forEach(System.out::println);
		
		list.stream().forEach(System.out::println);
		

	}

}
