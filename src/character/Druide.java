package character;
import java.util.Random;

public class Druide {
	
	private String nom; 
	private int minPotionEffect; 
	private int maxPotionEffect;
	private int potionStrength = 1;
	
	public Druide(String nom, int minPotionEffect, int maxPotionEffect) { 
		
		this.nom = nom; 
		this.minPotionEffect = minPotionEffect; 
		this.maxPotionEffect = maxPotionEffect; 
		
		talk("Hello, I'm the druide " + nom + " and the strength of my potions varies between " + minPotionEffect + " and " + maxPotionEffect + "."); 
		} 
	
	public String getName() { 
		return nom; 
		} 
	
	public void talk(String texte) { 
		System.out.println(speak() + "« " + texte + "»"); 
		} 
	private String speak() { 
		return "Le druide " + nom + " : "; 
		}
	
	public int nextInt(int maxPotionEffect) {
		return maxPotionEffect;
	}
	
	
	public int makePotion() {
		
		Random potion = new Random();
		int potionStrength = potion.nextInt(maxPotionEffect - minPotionEffect) + minPotionEffect;
		
		if (potionStrength > 7){
			talk("I will make my little potion... potion Strength : " + potionStrength);
		}
		else {
			talk("I didn't found all the ingredients i need, my potion is only strength " + potionStrength);
		}
		
		return potionStrength;
	}
	
	public void boost(Gaulois gaulois) {
		if (gaulois.getName() == "Obeli") {
			talk("No Obeli, you aint gonna have any magic potion !");
		}
		else {
			gaulois.drinkPotion(potionStrength);
		}
	}
	
	public static void main(String[] args) {
		Druide Panorami = new Druide("Panorami", 5, 10);
		Panorami.makePotion();
		
	}
}
