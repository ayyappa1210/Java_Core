package com.java.hashmap;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence ="hello world hello java world";
		
		Map<String,Integer> frequencyMap = new HashMap<>();
		
		String[] words=sentence.split("\\s+");
		
		for(String word:words) {
			frequencyMap.put(word, frequencyMap.getOrDefault(word, 0)+1);
		}
		System.out.println(frequencyMap);
		

	}

}
