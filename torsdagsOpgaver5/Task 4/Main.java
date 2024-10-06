import java.util.*;
public class Main {
	
	public static void main(String[] args) {

		ArrayList<String> actions = new ArrayList<String>(Arrays.asList("1) Start game", "2) Resume game", "3) Pause game", "4) End game" )); 

		// test print: System.out.println(actions.get(2));

		GameMenu newGameMenu = new GameMenu(actions);

		newGameMenu.displayMenu();


	}



}