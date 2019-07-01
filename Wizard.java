
public class Wizard extends Human {
	public int strength = 3;
	public int stealth = 3;
	public int intelligence = 8;
	public int health = 50;
	
	public void heal(Human player) {
		player.health += this.intelligence;
		System.out.println("Healed player's health: " + "+" + this.intelligence + "; current Health: " + player.health);
	}
	public void fireball(Human player) {
		player.health -= this.intelligence*3;
		System.out.println("Fireballed player's health: " + "-" + (this.intelligence*3) + "; current Health: " + player.health);
	}
}
