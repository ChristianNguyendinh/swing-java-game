package characters;

public abstract class Character {
	Integer hp;
	Integer atk;
	Integer speed;
	String name;
	
	public int getHP() {
		return hp.intValue();
	}
	
	public int getATK() {
		return atk.intValue();
	}
	
	public String getName() {
		return name;
	}
	public void setHP(int hp) {
		this.hp = hp;
	}
	
	public void setATK(int atk) {
		this.atk = atk;
	}
	
	public abstract String getImage();
	
	public abstract void attack(Character target);
	
	public abstract String toString();
	
}