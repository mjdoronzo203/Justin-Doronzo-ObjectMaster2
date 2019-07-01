
public class RpgTest {

	public static void main(String[] args) {
		Wizard player1 = new Wizard();
		Ninja player2 = new Ninja();
		Samurai player3 = new Samurai();
		Human player4 = new Human();
		Samurai player5 = new Samurai();
		Samurai player6 = new Samurai();
		
		player2.steal(player1);
		player3.howMany();
		player5.deathBlow(player6);
		player1.fireball(player4);
		player4.attack(player5);
		player2.runAway();
		player1.heal(player2);
		player1.fireball(player5);
		player3.meditate();
		
		
		

	}

}
