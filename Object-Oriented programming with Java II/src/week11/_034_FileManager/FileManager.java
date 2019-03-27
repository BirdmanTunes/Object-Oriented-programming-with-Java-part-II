package week11._034_FileManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
	
	private File read;
	private Scanner sc;
	private FileWriter writer;
	
	public ArrayList<String> read(String file) throws Exception{
		ArrayList<String> list = new ArrayList<String>();
		read = new File(file);
		sc = new Scanner(read);
		while(sc.hasNextLine()) {
			list.add(sc.nextLine());
		}
		return list;
	}
	
	public void save(String file, String text) throws IOException {
		writer = new FileWriter(file);
		writer.write(text);
		writer.close();
	}
	
	public void save(String file, ArrayList<String> texts) throws IOException {
		writer = new FileWriter(file);
		for (String each: texts) {
			writer.write(each);
			writer.write("\n");
		}
		writer.close();
	}
}
