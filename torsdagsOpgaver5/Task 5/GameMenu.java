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
	
	public String getAction() {

		System.out.println("Type a number to choose an action");
		for(String k : actions) {

			System.out.println(k);

		}

		Scanner scannerOne = new Scanner(System.in);
		String choice = scannerOne.nextLine(); 
		return choice; 

	}

}