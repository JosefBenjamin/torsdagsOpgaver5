import java.util.*;
public class Main {
	
	public static void main(String[] args) {

		ArrayList<String> actions = new ArrayList<String>(Arrays.asList("1) Start game", "2) Resume game", "3) Pause game", "4) End game" )); 

		// test print: System.out.println(actions.get(2));

		GameMenu newGameMenu = new GameMenu(actions);

		newGameMenu.displayMenu();

		newGameMenu.getAction();

		String userChoice = newGameMenu.getAction();

		doAction(Integer.parseInt(userChoice));


	}

public static void doAction(int action) {
	switch(action) {
	case 1: 
		System.out.println("Starting the game now");
	break;

	case 2:
		System.out.println("Fetching previously saved game data");
	break;

	case 3: 
		System.out.println("Game paused");
	break;

	case 4:
		System.out.println("Ending game");
	break;





	}


}


}