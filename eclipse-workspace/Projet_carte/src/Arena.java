

public class Arena {
	
	public static void nextTurn(int turn) {
		turn=turn+1;
		System.out.println(turn);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player("Tarek");
		final int turn=0;
		Player p2 = new Player("Mohamed");
		
		if(Offensif.class.equals(p2.getClass())) {
			System.out.println("ok");
		}else {
			System.out.println("not ok");
		}
		nextTurn(turn);
		System.out.println(turn);
		nextTurn(turn);
	}

}
