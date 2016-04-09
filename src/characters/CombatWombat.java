package characters;

public class CombatWombat extends Character {
	public CombatWombat() {
		hp = atk = staticAtk = staticHP = 0;
		speed = 30;
		name = "Combat Wombat";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A wombat graduating at the top of its class in combat readiness";
	}

	@Override
	public int getDmg() {
		return randomDmg(-2, 5);
	}
	//when CombatWombats are in an pinch, their attack goes up
	public void check() {
		setBleed();
		if (hp <= staticAtk / 2 && !ability) {
			atk += 5;
			ability = true;
		}
	}

}
