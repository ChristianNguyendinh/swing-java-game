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
		// TODO Auto-generated method stub
		return 0;
	}

}
