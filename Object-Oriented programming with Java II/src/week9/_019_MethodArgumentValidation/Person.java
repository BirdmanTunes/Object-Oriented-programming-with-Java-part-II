package week9._019_MethodArgumentValidation;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		if (name.length() > 40 || name == null || name.isEmpty() || age < 0 || age > 120) {
			throw new IllegalArgumentException("The name or age is wrong!");
		}
		this.name=name;
		this.age=age;
	}
}
