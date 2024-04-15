package character;

public class Romain {
	private String name;
	private int strength;
	
	public Romain(String name, int strength) {
		this.name = name;
		this.strength = strength;
	}
	
	public String getName() {
		return name;
	}
	
	public void Talk(String text) { 
		System.out.println(speak() + "« " + text  + "»"); 
	} 
	private String speak(){
		return "Le romain " + name + " : "; 
	}
	public void recevoirCoup(int forceCoup) { 
		strength-= forceCoup; 
		if (strength > 0) { 
			Talk("Aïe"); 
		} 
		else 
	{ Talk("J'abandonne..."); }
	}
}
