package week9._024_MultipleEntryDictionary;

import java.util.Set;

public interface MultipleEntryDictionary {
	
	public void add(String word, String entry);
	public Set<String> translate(String word);
	public void remove(String word);

}
