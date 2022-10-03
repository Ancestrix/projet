
public class Defensif extends Card {

	protected int shield;
	
	public Defensif(String name, int cost, int hp,int shield) {
		super(name, cost, hp);
		this.shield=shield;
	}

	public void protect(Player p) {
		p.setHp(p.getHp()+this.shield);
	}
}
