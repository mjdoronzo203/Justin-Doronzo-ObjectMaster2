
public class Ninja extends Human{
	public int strength = 3;
	public int stealth = 10;
	public int intelligence = 3;
	public int health = 100;
	
	public void steal(Human player) {
		player.health -= this.stealth;
		System.out.println("Stolen player's health: " + "-" + this.stealth + "; current Health: " + player.health);
		this.health += this.stealth;
		System.out.println("Ninja player's health: " + "+" + this.stealth + "; current Health: " + this.health);
	}
	public void runAway() {
		this.health -= 10;
		System.out.println("Fleeing player's health: -10" + "; current Health: " + this.health);
	}
}
