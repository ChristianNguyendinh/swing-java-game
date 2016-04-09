
package characters;

public abstract class Character {
	int hp;
	int atk;
	int staticAtk;
	int staticHP;
	int speed;
	String name;
	String path;
	
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
	
	public void setImage(String path) {
		this.path = path;
	}
	
	public String getImage() {
		return path;
	}
	
	public abstract int getDmg();
	
	public abstract String toString();
	
}
