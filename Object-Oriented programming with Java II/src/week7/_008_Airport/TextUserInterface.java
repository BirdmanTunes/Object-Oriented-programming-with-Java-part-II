package week7._008_Airport;

import java.util.Scanner;

public class TextUserInterface {
	
	private Scanner reader;
	private PlaneList planeList;
	private Planes newPlane;

	public TextUserInterface(Scanner reader) {
		this.reader = reader;
		this.planeList = new PlaneList();
	}
	
	public void start() {
		airPortPanel();
	}
	
	//first menu initialization, this calls the second menu on exit
	public void airPortPanel() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        
		while (true) {
			System.out.println("Choose operation:");
			System.out.println("[1] Add airplane");
			System.out.println("[2] Add flight");
			System.out.println("[x] Exit");
			System.out.print("> ");
			String sc = reader.nextLine();
			System.out.println("");
			
			if (sc.equals("1")){
				addPlane();
			} else if (sc.equals("2")){
				addFlight();
			} else if (sc.equalsIgnoreCase("x")) {
				flightService();
				break;
			} else {
				System.out.println("Unknown command.");
				System.out.println("");
			}
		}
	}
	
	//second menu initialization, this calls the first menu on exit
	public void flightService() {
        System.out.println("Flight service");
        System.out.println("--------------------");
        System.out.println("");
        
		while (true) {
			System.out.println("Choose operation:");
			System.out.println("[1] Print planes");
			System.out.println("[2] Print flights");
			System.out.println("[3] Print plane info");
			System.out.println("[x] Exit");
			System.out.print("> ");
			String sc = reader.nextLine();
			System.out.println("");
			
			if (sc.equals("1")){
				planeList.printPlanes();
			} else if (sc.equals("2")){
				planeList.printPlanesFull();
			} else if (sc.equals("3")) {
				printPlaneInfo();
			} else if (sc.equalsIgnoreCase("x")) {
				break;
			}
		}
	}
	
	//adds plane to list
	private void addPlane() {
		System.out.print("Give plane ID: ");
		String planeID = reader.nextLine();
		if(!planeList.planeSearch(planeID)) {
			System.out.print("Give plane capacity: ");
			int capacity = Integer.parseInt(reader.nextLine());
			System.out.println("");
			newPlane = new Planes(planeID, capacity);
			planeList.addPlane(newPlane);
		} else {
			System.out.println("Plane already exists!");
			System.out.println("");
		}

	}
	
	//changes specific planes flights
	private void addFlight() {
		
		System.out.print("Give plane ID: ");
		String planeID = reader.nextLine();
		
		if(planeList.planeSearch(planeID)) {
			System.out.print("Give departure airport code: ");
			String departure = reader.nextLine();
			System.out.print("Give destination airport code: ");
			String destination = reader.nextLine();
			System.out.println("");
			planeList.setLocations(planeID, departure, destination);
		} else {
			System.out.println("Plane does not exist.");
			System.out.println("");
		}
	}
	
	//prints specific planes info
	private void printPlaneInfo() {
		System.out.print("Give plane ID: ");
		String planeID = reader.nextLine();
		
		if(planeList.planeSearch(planeID)) {
			planeList.printPlane(planeID);
		} else {
			System.out.println("Plane does not exist.");
			System.out.println("");
		}
	}

}