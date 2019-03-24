package week9._026_PhoneSearch;

import java.util.Scanner;

public class UserInterface {
	
	private Scanner sc = new Scanner(System.in);
	private PhoneBook ofPeople = new PhoneBook();
	
	public void start() {
		mainMenu();
		while(true) {
			System.out.print("command: ");
			String command = sc.nextLine();
			if (command.equals("1")) {
				addANumber1();
			} else if (command.equals("2")) {
				searchforNumber2();
			} else if (command.equals("3")) {
				nameByNumber3();
			} else if (command.equals("4")) {
				addAddressToPerson4();
			} else if (command.equals("5")) {
				searchforPersonalInfo5();
			} else if (command.equals("6")) {
				removeInformation6();
			} else if (command.equals("7")) {
				filteredSearch7();
			} else if (command.equals("x")) {
				break;
			}
		}
		System.out.println("");
		System.out.println("Goodbye!");
	}
	
	public void mainMenu() {
		System.out.println("Phone search");
		System.out.println("Available operations:");
		System.out.println("  1 add a number");
		System.out.println("  2 search for a number");
		System.out.println("  3 search for a person by phone number");
		System.out.println("  4 add an address");
		System.out.println("  5 search for personal information");
		System.out.println("  6 delete personal information");
		System.out.println("  7 filtered listing");
		System.out.println("  x quit");
		System.out.println("");
	}
	
	public void addANumber1() {
		System.out.println("");
		System.out.print("whose number: ");
		String name = sc.nextLine();
		System.out.print("number: ");
		String number = sc.nextLine();
		
		ofPeople.addNumber(name, number);
	
		System.out.println("");
	}
	
	public void searchforNumber2() {
		System.out.println("");
		System.out.print("whose number: ");
		String name = sc.nextLine();
			if (ofPeople.checkIfNameThere(name)) {
				ofPeople.searchByPerson(name);
			} else {
				System.out.println("No such person!");
			}
		
		System.out.println("");
	}
	
	public void nameByNumber3() {
		System.out.println("");
		System.out.print("number: ");
		String number = sc.nextLine();
		ofPeople.searchByNumber(number);
		System.out.println("");
	}
	
	public void addAddressToPerson4() {
		System.out.println("");
		System.out.print("whose address: ");
		String name = sc.nextLine();
		System.out.print("street: ");
		String street = sc.nextLine();
		System.out.print("city: ");
		String city = sc.nextLine();
		
		ofPeople.addAddress(name, street + " " + city);
		
		System.out.println("");
	}
	
	public void searchforPersonalInfo5() {
		System.out.println("");
		System.out.print("whose information: ");
		String name = sc.nextLine();
			if (ofPeople.checkIfNameThere(name)) {
				System.out.print("  address: ");
				ofPeople.addressByPerson(name);
				ofPeople.searchByPerson(name);
			} else {
				System.out.println("No such person!");
			}
		
		System.out.println("");
	}
	
	public void removeInformation6() {
		System.out.println("");
		System.out.print("whose information: ");
		String name = sc.nextLine();
			if (ofPeople.checkIfNameThere(name)) {
				ofPeople.removeInformation(name);
			} else {
				System.out.println("No such person!");
			}
		
		System.out.println("");
	}
	
	public void filteredSearch7() {
		System.out.println("");
		System.out.print("keyword (if empty, all listed): ");
		String keyword = sc.nextLine();
		ofPeople.filteredListing(keyword);
		System.out.println("");
	}
}
