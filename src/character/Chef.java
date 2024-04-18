package character;

public class Chef {
	private String name;
	private int strength;
	private Village village;
	
	public Chef(String name, int strength, Village village){
		this.name = name;
		this.strength = strength;
		this.village = 	village;
	}
	
	public String getName() {
		return name;
	}
	
	public void Talk(String text) {
		System.out.println(speak() + "« " + text + "»");
	}
	
	private String speak() { 
		return "Le chef " + name + " du village " + village.getName() + " : ";
		} 
	public void frapper(Romain romain) { 
		System.out.println(name + " envoie un grand coup dans la mâchoire de " + romain.getName()); 
		romain.hitten(strength / 3); 
		}

}
