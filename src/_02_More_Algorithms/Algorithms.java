package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i) == "cracked") {
				return i;	
			}
		}
		return -1;
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int amount = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i) == true) {
				amount++;
			}
		}
		return amount;
	}
	
	public static double findTallest(List<Double> tall) {
		double tallest = 0.0;
		for (int i = 0; i < tall.size(); i++) {
			if(tall.get(i) > tallest) {
				tallest = tall.get(i);
			}
		}
		return tallest;
	}
	
	public static String findLongestWord(List<String> word) {
		String longest = "";
		for (int i = 0; i < word.size(); i++) {
			if(word.get(i).length() > longest.length()) {
				longest = word.get(i);
			}
		}
		return longest;
	}
	
	public static boolean containsSOS (List<String> morse) {
		for (int i = 0; i < morse.size(); i++) {
			if (morse.get(i) == "... --- ...") {
				return true;
			}
		}
		return false;
	}
}
