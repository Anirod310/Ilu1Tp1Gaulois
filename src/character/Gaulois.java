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
		return "The gaulois" + name + " : ";
	}
	
	public void hit(Romain romain) {
		System.out.println(name + " send a huge kick in the jaw of " + romain.getName());
		romain.hitten(strength / 3);
	}
	
	@Override
	public String toString() {
		return "Gaulois [name=" + name +", force=" + strength + ", potionEffect=" + potionEffect + "]";
		
	}
	
	public static void main(String[] args) {
		
		Gaulois Patrick = new Gaulois("Patrick", 5);
		Patrick.toString();
		
	}
	
	
}

