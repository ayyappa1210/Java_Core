package com.java.functionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> pre =str->str.length()>5;
		System.out.println(pre.test("Ayyappa"));
		
		Consumer<String> consume=str->System.out.println(str);
		consume.accept("Ayyappa");
		
		Function<String,String> fun = (str1)->str1.concat(" Ayyappa");
		System.out.println(fun.apply("Ponnapoola"));
		
		Supplier<Double> sup =()->Math.random();
		System.out.println(sup.get());

	}

}
