package week9._025_DuplicateRemover.tools;

import java.util.Set;

public interface DuplicateRemover {

	public void add(String characterString);
	public int getNumberOfDetectedDuplicates();
	public Set<String> getUniqueCharacterStrings();
	public void empty();
}
