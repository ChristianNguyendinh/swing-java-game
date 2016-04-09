package characters;

public abstract class Character {
	Integer hp;
	Integer atk;
	
	public int getHP() {
		return hp.intValue();
	}
	
	public int getATK() {
		return atk.intValue();
	}
	
	public void setHP(int hp) {
		this.hp = hp;
	}
	
	public void setATK(int atk) {
		this.atk = atk;
	}
	
	public abstract void ability();
	
	public abstract void attack(Character target);
	
}
