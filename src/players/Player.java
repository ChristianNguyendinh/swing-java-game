package players;

import characters.*;
import characters.Character;

public class Player {
	
	private boolean myTurn;
	private Character[] characters;
	
	public Player() {
		myTurn = false;
		characters = new Character[6];
	}
}
