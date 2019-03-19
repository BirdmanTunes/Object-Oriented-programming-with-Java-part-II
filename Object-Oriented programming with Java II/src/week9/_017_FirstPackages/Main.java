package week9._017_FirstPackages;
import week9._017_FirstPackages.mooc.logic.ApplicationLogic;
import week9._017_FirstPackages.mooc.ui.TextUserInterface;
import week9._017_FirstPackages.mooc.ui.UserInterface;

public class Main {
	
	public static void main(String[] args) {
		
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
	}
}
