package characters;

import javax.swing.JOptionPane;

public class Player extends Character {

	public Player() {
		hp = atk = staticAtk = staticHP = 0;
		speed = 30;
		name = JOptionPane.showInputDialog("Enter the name for " + getClass());
	}
	
	@Override
	public String getImage() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Standard vanilla player for players.";
	}

	@Override
	public int getDmg() {
		return atk;
	}
	//player's attack doesn't get affected
	public void check() {
		setBleed();
		atk = staticAtk;
	}
}
