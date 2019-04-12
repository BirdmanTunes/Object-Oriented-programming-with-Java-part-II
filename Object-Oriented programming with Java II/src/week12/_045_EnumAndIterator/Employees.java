package week12._045_EnumAndIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
	
	private List<Person> employees;
	Iterator<Person> iterator;
	
	public Employees() {
		employees = new ArrayList<Person>();
	}
	
	public void add(Person person) {
		employees.add(person);
	}
	
	public void fire(Education education) {
		iterator = employees.iterator();
		
		while(iterator.hasNext()) {
			Person person = iterator.next();
			if (person.getEducation() == education) {
				employees.remove(person);
			}
		}
	}
	
	public void print() {
		iterator = employees.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
	public void print(Education education) {
		iterator = employees.iterator();
		
		while(iterator.hasNext()) {
			Person person = iterator.next();
			if (person.getEducation() == education) {
				System.out.println(person);
			}
		}
	}
}
