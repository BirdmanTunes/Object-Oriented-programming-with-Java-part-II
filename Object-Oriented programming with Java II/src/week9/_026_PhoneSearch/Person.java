package week9._026_PhoneSearch;

import java.util.HashSet;

public class Person {
	
	private HashSet<String> numbers;
	private String address;
	
	public Person() {
		this.numbers = new HashSet<String>();
		this.address = "No known address.";
	}
	
	public void addNumber(String number) {
		numbers.add(number);
	}
	
	public void getNumbers() {
		int counter = 0;
		for (String each: numbers) {
			counter++;
			System.out.println("     " + each);
		}
		if (counter == 0) {
			System.out.println("     No numbers for this person.");
		}
	}
	
	public HashSet<String> getNumberList(){
		return numbers;
	}
	
	public void addAddress(String address) {
		this.address=address;
	}
	
	public void getAddress() {
		System.out.println(address);
	}
	
	public String getAddressReturn() {
		return address;
	}
	
	public void removeinfo() {
		numbers.clear();
		address = "No known address.";
	}
}
