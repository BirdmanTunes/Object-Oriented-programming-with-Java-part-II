package week10._029_PersonAndTheirHeirs.people;

public class Student extends Person{
	
	private int credits;
	
	public Student (String name, String address) {
		super(name, address);
		credits=0;
	}
	
	public void study() {
		credits++;
	}
	
	public String credits() {
		return "credits: " + credits;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n  " + credits();
	}

}
