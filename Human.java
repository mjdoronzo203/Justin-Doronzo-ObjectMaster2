
public class Human {
	public int strength = 3;
	public int stealth = 3;
	public int intelligence = 3;
	public int health = 100;
	
	public void attack(Human player) {
		player.health -= this.strength;
		System.out.println("Attacked player's health: " + "-" + this.strength + "; current Health: " + player.health);
		
	}
}
