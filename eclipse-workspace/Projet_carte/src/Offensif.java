
public class Offensif extends Card{

	protected int dmg;
	
	public Offensif(String name, int cost, int hp,int dmg) {
		super(name, cost, hp);
		this.dmg=dmg;
	}

	public void attack(Player p) {
		p.setHp(p.getHp()-this.dmg);
	}
	
	
}
