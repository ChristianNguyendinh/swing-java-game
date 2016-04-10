package characters;

public class HappyJoker extends Character {
	public HappyJoker() {
		speed = 20;
		name = "Happy Joker";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Joker from the movie, only reloaded with happiness.";
	}

	@Override
	public int getDmg() {
		return randomDmg(-2, 2);
	}
	
}
