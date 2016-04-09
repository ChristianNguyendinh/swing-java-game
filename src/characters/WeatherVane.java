package characters;

import javax.swing.JOptionPane;

public class WeatherVane extends Character {

	public WeatherVane() {
		hp = atk = staticAtk = staticHP = 0;
		speed = 30;
		name = "WeatherVane";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Swingin' with the wind, day and night!";
	}

	@Override
	public int getDmg() {
		// TODO Auto-generated method stub
		return randomDmg(-1, 4);
	}
	public String check() {
		setHP(getHP() + 2);
		return name + " gained 2 HP.";
	}
}
