package characters;

import javax.swing.JOptionPane;

public class WeatherVane extends Character {

	public WeatherVane() {
		hp = atk = staticAtk = staticHP = 0;
		speed = 30;
		name = JOptionPane.showInputDialog("Enter the name for " + getClass());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Swingin' with the wind, day and night!";
	}

	@Override
	public String getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDmg() {
		// TODO Auto-generated method stub
		return randomDmg(-1, 4);
	}
	public void check() {
		setHP(getHP() + 2);
	}
}
