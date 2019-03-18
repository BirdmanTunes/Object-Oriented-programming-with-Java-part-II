package week8._014_StudentsSortedByName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
				
		students.add(new Student("timmy"));
		students.add(new Student("zach"));
		students.add(new Student("alex"));
		students.add(new Student("david"));
		
		for (Student each: students) {
			System.out.println(each);
		}
		
		System.out.println("--------");
		
		Collections.sort(students);
		
		for (Student each: students) {
			System.out.println(each);
		}
	}
}
