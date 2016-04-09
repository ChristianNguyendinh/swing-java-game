package players;

import characters.*;
import characters.Character;

public class Player {
	
	private String name;
	private int totalHP;
	private int totalATK;
	private boolean myTurn;
	private Character[] characters;
	
	public Player(String name) {
		this.name = name;
		totalHP = 30;
		totalATK = 30;
		myTurn = false;
		characters = new Character[6];
	}
	
	public boolean addCharacter(Character character) {
		for(int i = 0; i < 6; i++) {
			if(characters[i] == null) {
				characters[i] = character;
				return true;
			}
		}
		return false;
	}
	
	public void incrementAtk(Character character) {
		character.setATK(character.getATK() + 1);
	}
	
	public void incrementHP(Character character) {
		character.setHP(character.getHP() + 1);
	}
	
	public String action(Player otherPlayer, Character yours, Character theirs) {
		theirs.setHP(theirs.getHP() - yours.getATK());
		//Abilities
		if(yours instanceof Character) {
			return "String ";
		}
		return "";
	}
}
