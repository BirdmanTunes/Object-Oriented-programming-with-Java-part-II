package week11._035_TwoDirectionDictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MindfulDictionary {
	
	private HashMap<String, String> dictionary;
	private File readFile;
	private FileReader reader;
	private Scanner sc;
	private String file;
	
	public MindfulDictionary(){
		dictionary=new HashMap<String, String>();
	}
	
	public MindfulDictionary(String file) {
		this.file=file;
		dictionary=new HashMap<String, String>();
	}
	
	//loads a file and adds the words to the map
	public boolean load() throws FileNotFoundException {
		readFile = new File(file);
		sc = new Scanner(readFile);
		
		while (sc.hasNextLine()){
		    String line = sc.nextLine();
		    String[] parts = line.split(":");
		    dictionary.put(parts[0], parts[1]);
		}
		return readFile.exists();
	}
	
	//checks if a word is in the dictionary then adds it
	public void add(String word, String translation){
		if (!dictionary.containsKey(word))
			dictionary.put(word, translation);
	}
	
	//translates the word in both directions
	public String translate(String word) {
		if (dictionary.get(word) == null) {
			for (String key: dictionary.keySet()){
				if (dictionary.get(key).equals(word))
					return key;
			}
		} 
		return dictionary.get(word);
	}
	
	//removes an entry from the map list
	public void remove(String word) {
		if (dictionary.containsKey(word)) {
            dictionary.remove(word);
        }
        if (this.dictionary.containsValue(word)) {
            List<String> keys = new ArrayList<String>();
            for (String key : dictionary.keySet()) {
                if (dictionary.get(key).equals(word)) {
                    keys.add(key);
                }
            }
            dictionary.remove(keys.get(0));
        }
	}
	
	//saves all the entries from the map into a file
	public boolean save() {

        FileWriter writer;
        try {
            writer = new FileWriter(file);
            for (String key : dictionary.keySet()) {
                writer.write(key + ":" + dictionary.get(key));
                writer.write("\n");
            }
            writer.close();
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
}
