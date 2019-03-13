package week7._002_CharacterStringChanger;

public class Change {
	
	private char fromCharacter;
	private char toCharacter;
	
	
	public Change(char fromCharacter, char toCharacter) {
		this.fromCharacter=fromCharacter;
		this.toCharacter=toCharacter;
	}
	
	public String change(String characterString) {
		return characterString = characterString.replace(fromCharacter, toCharacter);
	}

}
