package week9._017_FirstPackages.mooc.logic;
import week9._017_FirstPackages.mooc.ui.TextUserInterface;
import week9._017_FirstPackages.mooc.ui.UserInterface;

public class ApplicationLogic {
	
	private UserInterface ui;
	
	public ApplicationLogic(UserInterface ui) {
		this.ui=ui;
	}
	
	public void execute(int howManyTimes) {
		for (int i = 0; i < howManyTimes; i++) {
			System.out.println("The application logic works");
			ui.update();
		}
	}

}
