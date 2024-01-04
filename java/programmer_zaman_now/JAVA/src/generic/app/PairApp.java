package generic.app;

import generic.Pair;

public class PairApp {

	public static void main(String[] args) {
		
		Pair<String, Integer> pair = new Pair<String, Integer>("alwiya", 100);
		
		System.out.println(pair.getName());
		System.out.println(pair.getNilai());

	}

}
