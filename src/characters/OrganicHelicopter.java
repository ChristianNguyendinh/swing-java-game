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
		// TODO Auto-generated method stub
		return 0;
	}

}
