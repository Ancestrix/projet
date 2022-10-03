
public class Player {
	
	protected String name;
	protected int hp,mana;

	public Player(String name) {
		this.name = name;
		this.hp = 100;
		this.mana = 10;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}
	
	public static void finishTurn() {
		Arena.nextTurn(Arena.turn);
	}
	public static void main(String[] args) {

		System.out.println(Arena.turn);
		finishTurn();
		System.out.println(Arena.turn);
		finishTurn();
		System.out.println(Arena.turn);
	}
	
	

}
