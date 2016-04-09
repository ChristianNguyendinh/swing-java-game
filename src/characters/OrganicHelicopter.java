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
	public String getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDmg() {
		return randomDmg(-5, 1);
	}
	//when attacked, helicopter gets more aggressive 
	public void check() {
		setBleed();
		atk += 1 + (int)(Math.random() * 5);
	}

}
