import java.util.*; 
public class GameMenu {
	
	private ArrayList<String> actions = new ArrayList<String>(); 


	public GameMenu(ArrayList<String> actions) {

		this.actions = actions;


	}
	
	public void displayMenu() {

		for(String x : actions) {
			System.out.println(x);
		}
	}


}