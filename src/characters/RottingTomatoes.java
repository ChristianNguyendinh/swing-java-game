package characters;

public class RottingTomatoes extends Character {


	public RottingTomatoes () {
		speed = 5; 
		atk = 0; 
		hp = 0; 
		staticAtk = 0; 
		name = "Rotten Tomatoes";
	}
	
	@Override
	public void attack(Character target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Barely qualifies as a battle contestant. Edible though.";
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
