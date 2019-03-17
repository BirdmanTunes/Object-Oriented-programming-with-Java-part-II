package week8._010_NationalService;

public class Main {
	
	public static void main(String[] args) {
		
		CivilService person1 = new CivilService();
		
		System.out.println("Civil Service: " + person1.getDaysLeft());
		
		for (int i= 0; i < 400; i++) {
			person1.work();
		}
		
		System.out.println("Civil Service: " + person1.getDaysLeft());
		
		MilitaryService person2 = new MilitaryService(1);
		
		System.out.println("Military Service: " + person2.getDaysLeft());
		
		person2.work();
		person2.work();
		
		System.out.println("Military Service: " + person2.getDaysLeft());
	}
}
