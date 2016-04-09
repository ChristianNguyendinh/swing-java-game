package players;

import java.util.ArrayList;

import characters.*;
import characters.Character;

public class Player {
	
	private String name;
	private int totalHP;
	private int totalATK;
	private boolean myTurn;
	public ArrayList<Character> characters;
	
	public Player(String name) {
		this.name = name;
		totalHP = 90;
		totalATK = 30;
		myTurn = false;
		characters = new ArrayList<Character>();
	}
	
	public boolean addCharacter(Character character) {
		if(characters.size() < 6) {
			characters.add(character);
			return true;
		}
		return false;
	}
	
	public void incrementAtk(Character character) {
		character.setStaticATK(character.getATK() + 1);
	}
	
	public void incrementHP(Character character) {
		character.setHP(character.getHP() + 1);
	}
	
	public Character getCharacter(int i) {
		return characters.get(i);
	}
	
	public String action(Player otherPlayer, Character yours, Character theirs) {
		int dmg = yours.getDmg();
		theirs.setHP(theirs.getHP() - dmg);
		myTurn = false;
		return name + "'s " + yours.getName() + " attacked " + " " + otherPlayer.name + 
				"'s " + theirs.getName() + " for " + dmg + ". " + theirs.check();
	}
	
	public boolean lost() {
		int totalHP = 0;
		for (Character current : characters)
			totalHP += current.getHP();
		
		return totalHP == 0;
	}
	public int speed() {
		int totalSpeed = 0;
		for (Character current : characters)
			totalSpeed += current.getSpeed();
		
		return totalSpeed;
	}
}
