package week7._009_Car_Registration_Centre;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {
	
	private HashMap<RegistrationPlate, String> owners;
	
	public VehicleRegister() {
		owners = new HashMap<RegistrationPlate, String>();
	}
	
	public boolean add(RegistrationPlate plate, String owner) {
		if (owners.get(plate) == null) {
			owners.put(plate, owner);
			return true;
		}
		return false;
	}
	
	public String get(RegistrationPlate plate) {
		return owners.get(plate);
	}
	
	public boolean delete(RegistrationPlate plate) {
		if (owners.get(plate) != null) {
			owners.remove(plate);
			return true;
		}
		return false;
	}
	
	public void printRegistrationPlates() {
		for (RegistrationPlate each : owners.keySet()) {
			System.out.println(each);
		}
	}

	public void printOwners() {
		for (RegistrationPlate key : owners.keySet()) {
			System.out.println(owners.get(key));
		}
	}
}
	
