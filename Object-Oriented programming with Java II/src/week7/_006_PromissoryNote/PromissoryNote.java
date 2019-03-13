package week7._006_PromissoryNote;

import java.util.HashMap;

public class PromissoryNote {

	private HashMap<String, Double> people;

	public PromissoryNote() {
		people = new HashMap<String, Double>();
	}

	public void setLoan(String toWhom, double value) {
		people.put(toWhom, value);
	}

	public double howMuchIsTheDebt(String whose) {
		if (people.containsKey(whose)){
			return people.get(whose);
		}
	    return 0;
	}
}
