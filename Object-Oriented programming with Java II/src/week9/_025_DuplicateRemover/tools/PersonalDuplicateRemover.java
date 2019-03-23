package week9._025_DuplicateRemover.tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
	
	Set<String> list;
	int duplicateCounter;
	
	public PersonalDuplicateRemover() {
		list = new HashSet<String>();
		duplicateCounter = 0;
	}

	@Override
	public void add(String characterString) {
		if (list.contains(characterString)) {
			duplicateCounter++;
		} else {
			list.add(characterString);
		}
	}

	@Override
	public int getNumberOfDetectedDuplicates() {
		return duplicateCounter;
	}

	@Override
	public Set<String> getUniqueCharacterStrings() {
		return list;
	}

	@Override
	public void empty() {
		list.clear();
		duplicateCounter = 0;
	}
}
