package week10._029_PersonAndTheirHeirs.people;

public class Person {
	
	private String name;
	private String address;
	
	public Person (String name, String address) {
		this.name=name;
		this.address=address;
	}
	
	@Override
	public String toString() {
		return name + "\n  " + address;
	}

}
