package week9._024_MultipleEntryDictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
	
	private Map<String, Set<String>> dictionary;
	
	public PersonalMultipleEntryDictionary() {
		dictionary = new HashMap<String, Set<String>>();
	}

	@Override
	public void add(String word, String entry) {
		if (!dictionary.containsKey(word)) {
			dictionary.put(word, new HashSet<String>());
		}
		Set<String> finished = dictionary.get(word);
        finished.add(entry);
	}

	@Override
	public Set<String> translate(String word) {
		return dictionary.get(word);
	}

	@Override
	public void remove(String word) {
		dictionary.remove(word);
	}
}
