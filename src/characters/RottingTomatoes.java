package characters;

public class RottingTomatoes extends Character {


	public RottingTomatoes () {
		speed = 5; 
		atk = 0; 
		hp = 0; 
		staticAtk = 0; 
		name = "Rotting Tomatoes";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Barely qualifies as a battle contestant. Edible though.";
	}

	@Override
	public int getDmg() {
		// TODO Auto-generated method stub
		return 1;
	}
	//when rotting tomatoes are in a pinch, they lose attack strength
	public void check() {
		setBleed();
		if (hp <= staticHP/2 && !ability) {
			setATK(getATK() - 5);
			ability = true;
		}
	}
}
