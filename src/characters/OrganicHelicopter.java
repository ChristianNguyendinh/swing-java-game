package characters;

public class OrganicHelicopter extends Character {
	public OrganicHelicopter() {
		hp = atk = staticAtk = staticHP = 0;
		speed = 50;
		name = "Organic Helicopter";
	}

	@Override
	public String toString() {
		return "Hypersonic organic helicopter to suit all your helicopter needs.";
	}

	@Override
	public int getDmg() {
		return randomDmg(-5, 1);
	}
	//when attacked, helicopter gets more aggressive 
	public String check() {
		setBleed();
		int increase = 1 + (int)(Math.random() * 5);
		atk += increase;
		String msg = name + "'s attack increased by " + increase;
		if (bleed)
			msg += " " + name + " is bleeding.";
		return msg;
	}

}
