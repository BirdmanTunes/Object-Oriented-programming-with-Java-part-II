package week7._002_CharacterStringChanger;

import java.util.ArrayList;

public class Changer {
	
	private ArrayList<Change> list;
	
	public Changer() {
		list = new ArrayList<Change>();
	}
	
	public void addChange(Change change){
		list.add(change);
	}
	
	public String change(String characterString) {
		for (Change each:list) {
			characterString = each.change(characterString);
		}
		return characterString;
	}
}
