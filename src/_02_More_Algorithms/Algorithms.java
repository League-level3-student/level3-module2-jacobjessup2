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
			System.out.println(morse.get(i));
			if (morse.get(i).equals(" ... --- ... ")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		for (int i = 0; i < results.size(); i++) {
			for (int j = 0; j < results.size()-1; j++) {
				if (results.get(j)>results.get(j+1)) {
					double tempNum = results.get(j);
					results.set(j, results.get(j+1));
					results.set(j+1, tempNum);
				}
			}
		}
		return results;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		for (int i = 0; i < unsortedSequences.size(); i++) {
			for (int j = 0; j < unsortedSequences.size()-1; j++) {
				if (unsortedSequences.get(j).length()>unsortedSequences.get(j+1).length()) {
					String tempNum = unsortedSequences.get(j);
					unsortedSequences.set(j, unsortedSequences.get(j+1));
					unsortedSequences.set(j+1, tempNum);
				}
			}
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
			for (int j = 0; j < words.size()-1; j++) {
				if (words.get(j).compareTo(words.get(j+1)) > 0) {
					String tempNum = words.get(j);
					words.set(j, words.get(j+1));
					words.set(j+1, tempNum);
				}
			}
		}
		return words;
	}
	
}
