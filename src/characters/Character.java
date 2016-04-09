
package characters;

public abstract class Character {
	int hp;
	int atk;
	int staticAtk;
	int staticHP;
	int speed;
	String name;
	boolean ability;
	boolean bleed;
	
	public int getHP() {
		return hp;
	}
	
	public int getATK() {
		return atk;
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
		setBleed();
	}
	public void setStaticATK(int atk) {
		this.staticAtk = atk;
		this.atk = atk;
	}
	public void setBleed() {
		if (!bleed) {
			if ((int)(Math.random() * 1) == 1)
				bleed = true;
		}
		else {
			bleed();
			if ((int)(Math.random() * 2) == 2)
				bleed = false;
		}
	}
	public void bleed() {
		setHP(getHP() - (1 + (int)(Math.random() * 5)));
	}
	public int getDmg() {
		return atk;
	}
	public int randomDmg(int low, int high) {
		int dmg = atk + low + (int)(Math.random() * high);
		if (dmg <= 0) 
			dmg = 1;
		return dmg;
	}
	public abstract String getImage();
	
	public abstract String toString();
	
}
