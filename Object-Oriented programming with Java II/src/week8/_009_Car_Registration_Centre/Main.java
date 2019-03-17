package week8._009_Car_Registration_Centre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        VehicleRegister owners = new VehicleRegister();
        
        owners.add(reg1, "Arto");
        owners.add(reg2, "Marty");
        owners.add(reg3, "Jurgen");
        
        System.out.println("Registration plates:");
        owners.printRegistrationPlates();
        
        System.out.println("");
        
        System.out.println("Owners: ");
        owners.printOwners();
        
        owners.delete(reg1);
        owners.delete(reg1);
        
        System.out.println("");
        
        System.out.println("Registration plates:");
        owners.printRegistrationPlates();
        
        System.out.println("");
        
        System.out.println("Owners: ");
        owners.printOwners();
    }
}