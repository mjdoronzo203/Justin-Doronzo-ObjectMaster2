
public class Samurai extends Human{
	public int strength = 3;
	public int stealth = 3;
	public int intelligence = 3;
	public int health = 200;
	public static int counter = 0;
	
	public Samurai() {
		counter++;
	}

	public void deathBlow(Human player) {
		player.health = 0;
		System.out.println("Namu! Namu! This player is now dead; Health: 0");
		this.health /= 2;
		System.out.println("Samurai's health: " + this.health);
	}
	public void meditate() {
		this.health *= 1.5;
		System.out.println("Samurai's mind refreshed; health: " + this.health);
	}
	public void howMany() {
		System.out.println("Brotherhood of the Samurai members: " + counter);
	}

}
