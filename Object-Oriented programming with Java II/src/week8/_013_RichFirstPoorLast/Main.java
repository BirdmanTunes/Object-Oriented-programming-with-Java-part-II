package week8._013_RichFirstPoorLast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Person> employees = new ArrayList<Person>();
		
		employees.add(new Person("mikael", 300));
		employees.add(new Person("mikael", 200));
		employees.add(new Person("mikael", 400));
		
		for (Person each: employees) {
			System.out.println(each);
		}
		
		System.out.println("------------");
		
		Collections.sort(employees);
		
		for (Person each: employees) {
			System.out.println(each);
		}
	}

}
