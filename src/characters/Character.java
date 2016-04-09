
package characters;

public abstract class Character {
	int hp;
	int atk;
	int staticAtk;
	int staticHP;
	int speed;
	String name;
	
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
	public void check() {
		//do nothing
	}
	public void setStaticATK(int atk) {
		this.staticAtk = atk;
		this.atk = atk;
	}
	
	public void setATK(int atk) {
		this.atk = atk;
	}
	public abstract int getDmg();
	
	public abstract String getImage();
	
	public abstract String toString();
	
}
