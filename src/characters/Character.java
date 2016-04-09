package characters;

public abstract class Character {
	Integer hp;
	Integer atk;
	Integer staticAtk;
	Integer staticHP;
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
	public boolean isDead() {
		return hp <= 0;
	}
	public void setATK(int newAtk) {
		atk = newAtk;
		if (atk <= 0) 
			atk = 1;
	}
	public void check() {
		//do nothing
	}
	public void setStaticATK(int atk) {
		this.staticAtk = atk;
	}
	public abstract int getDmg();
	
	public abstract String getImage();
	
	public abstract String toString();
	
}
