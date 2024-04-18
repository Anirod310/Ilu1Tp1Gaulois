package character;

public class Gaulois {
	private String name;
	private int strength;
	private int potionEffect = 1;
	
	public Gaulois(String name, int strength) {
		this.name = name;
		this.strength = strength;
		}
	
	
	public String getName() {
		return name;
	}
	
	
	public void Talk (String text) {
		System.out.println(speak() + "'" + text + "'");
	}
	private String speak() {
		return "The gaulois " + name + " : ";
	}
	
	public int drinkPotion(int potionStrength) {
		potionEffect = potionStrength;
		Talk("Thank's Druide, I feel that my strength is " + potionStrength + "times higher");
		return potionEffect;
	}
	
	public void hit(Romain romain) {
		System.out.println(name + " send a huge kick in the jaw of " + romain.getName());
		romain.hitten(strength / 2 * potionEffect);
	}
	
	@Override
	public String toString() {
		return "Gaulois [name=" + name +", force=" + strength + ", potionEffect=" + potionEffect + "]";
		
	}
	
	public static void main(String[] args) {
	
	Gaulois Asteri = new Gaulois("Asteri", 5);
	Romain cesar = new Romain("Cesar", 5);
	System.out.println(Asteri.getName());
	Asteri.hit(cesar);
	Asteri.drinkPotion(8);
	Asteri.hit(cesar);
	}
	
	
}

