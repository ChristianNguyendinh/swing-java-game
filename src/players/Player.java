package players;

import java.util.ArrayList;

import characters.*;
import characters.Character;

public class Player {
	
	private String name;
	private int totalHP;
	private int totalATK;
	private boolean myTurn;
	private ArrayList<Character> characters;
	
	public Player(String name) {
		this.name = name;
		totalHP = 30;
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
		
		if(yours instanceof CombatWombat) {
			yours.attack(theirs);
			return name + "'s" + yours.getName() + " attacked " + theirs.toString() + "for " + yours.getATK();
		} else if(yours instanceof HappyJoker) {
			yours.attack(theirs);
			return name + "'s" + yours.getName() + " attacked " + theirs.toString() + "for " + yours.getATK();
		} else if(yours instanceof OrganicHelicopter) {
			yours.attack(theirs);
			return name + "'s" + yours.getName() + " attacked " + theirs.toString() + "for " + yours.getATK();
		} else if(yours instanceof characters.Player) {
			yours.attack(theirs);
			return name + "'s" + yours.getName() + " attacked " + theirs.toString() + "for " + yours.getATK();
		} else if(yours instanceof RottingTomatoes) {
			yours.attack(theirs);
			return name + "'s" + yours.getName() + " attacked " + theirs.toString() + "for " + yours.getATK();
		} else if(yours instanceof TaxCollector) {
			yours.attack(theirs);
			return name + "'s" + yours.getName() + " attacked " + theirs.toString() + "for " + yours.getATK();
		} else if(yours instanceof WeatherVane) {
			yours.attack(theirs);
			return name + "'s" + yours.getName() + " attacked " + theirs.toString() + "for " + yours.getATK();
		}
		return "";
	}
}
