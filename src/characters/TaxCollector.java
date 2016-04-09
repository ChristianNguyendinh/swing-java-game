package characters;

public class TaxCollector extends Character {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Robin Hood of the Government. Hated by everyone.";
	}

	@Override
	public int getDmg() {
		// TODO Auto-generated method stub
		return randomDmg(-10, 10);
	}
}
