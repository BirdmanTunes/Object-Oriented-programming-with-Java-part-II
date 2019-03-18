package week8._014_StudentsSortedByName;

import week8._013_RichFirstPoorLast.Person;

public class Student implements Comparable<Student>{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
    	return name;
    }
    
    public int compareTo(Student student) {
    	if (this.name == student.getName()) {
    		return 0;
    	} else {
    		return this.name.compareToIgnoreCase(student.getName());
    	}
    }
}