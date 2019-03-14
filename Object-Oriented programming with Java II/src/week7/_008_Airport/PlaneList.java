package week7._008_Airport;

import java.util.ArrayList;

public class PlaneList {
	
	ArrayList<Planes> list;
	
	public PlaneList() {
		list = new ArrayList<Planes>();
	}
	
	public void addPlane(Planes newPlane) {
		list.add(newPlane);
	}
	
	//prints single plane
	public void printPlane(String search) {
		for (Planes each:list) {
			if (each.getName().equals(search)) {
				System.out.println(each.printPlane());
			} 
			
		}
		System.out.println("");
	}
	
	//prints all the planes without locations
	public void printPlanes() {
		for (Planes each: list) {
			System.out.println(each.printPlane());
		}
		System.out.println("");
	}
	
	//prints all the planes with locations
	public void printPlanesFull() {
		for (Planes each: list) {
			System.out.println(each);
		}
		System.out.println("");
	}
	
	public boolean planeSearch(String search) {
		for (Planes each:list) {
			if (each.getName().contains(search)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	//sets the location of the searched plane
	public void setLocations(String search, String departure, String destination) {
		
		for (Planes each:list) {
			if (each.getName().equals(search)) {
				each.setDeparture(departure);
				each.setDestination(destination);
			}
			
		}
	}
}
