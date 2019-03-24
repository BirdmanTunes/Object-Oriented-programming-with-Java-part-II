package week9._026_PhoneSearch;

import java.util.Map.Entry;
import java.util.Set;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook{
	
	private Map <String, Person> nameToPerson;
	
	public PhoneBook() {
		nameToPerson = new TreeMap<String, Person>();
	}
	
	public void addNumber(String name, String number) {
		if (!nameToPerson.containsKey(name)) {
			nameToPerson.put(name, new Person());
			nameToPerson.get(name).addNumber(number);
		} else {
			nameToPerson.get(name).addNumber(number);
		}
	}

	public void searchByPerson(String name) {
		if (nameToPerson.containsKey(name))
			System.out.println("  phone numbers: ");
			nameToPerson.get(name).getNumbers();
	}
	
	public void searchByNumber(String number) {
		for (Entry<String, Person> nameAndNumber : nameToPerson.entrySet()) {
			if (nameAndNumber.getValue().getNumberList().contains(number)) {
		        System.out.println("  " + nameAndNumber.getKey());
			} else {
				System.out.println("No such number!");
			}
		}
	}
	
	public void addressByPerson(String name) {
		if (nameToPerson.containsKey(name))
			nameToPerson.get(name).getAddress();
	}
	
	public void addAddress(String name, String address) {
		if (!nameToPerson.containsKey(name)) {
			nameToPerson.put(name, new Person());
			nameToPerson.get(name).addAddress(address);
		} else {
			nameToPerson.get(name).addAddress(address);
		}
	}
	
	public boolean checkIfNameThere(String name) {
		return nameToPerson.containsKey(name);
	}
	
	public void removeInformation(String name) {
		if  (nameToPerson.containsKey(name)) {
			nameToPerson.get(name).removeinfo();
			nameToPerson.remove(name);
		}
	}
	
	public void filteredListing(String keyword) {
        boolean found = false;
        System.out.println("");
        for (String name : nameToPerson.keySet()) {
            if (name.contains(keyword) ||
            	nameToPerson.get(name).getAddressReturn().contains(keyword)) {
            		System.out.println("  " + name);
            		System.out.print("    Address: ");
            		addressByPerson(name);
            		System.out.print("  ");
            		searchByPerson(name);
            		System.out.println("");
            		found=true;
            }
        }
        if (!found) {
            System.out.println(" keyword not found");
            System.out.println("");
        }
	}
}

