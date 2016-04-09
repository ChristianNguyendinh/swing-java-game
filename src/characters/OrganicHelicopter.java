package characters;

public class OrganicHelicopter extends Character {
	public OrganicHelicopter() {
		hp = atk = staticAtk = 0;
		speed = 50;
		name = "Organic Helicopter";
	}
	@Override
	public void attack(Character target) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		return 0;
	}

}
