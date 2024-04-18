package Story;

import character.Gaulois;
import character.Romain;
import character.Druide;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois Obeli = new Gaulois("Obeli", 25);
		Gaulois Asteri = new Gaulois("Asteri", 8);
		Romain Minus = new Romain("Minus", 6);
		Druide Panorami = new Druide("Panorami", 5, 10);
		Panorami.talk("Hi, I'm the druide Panorami, and my potion can range from a strength of 5 to 10.");
		Panorami.makePotion();
		Panorami.boost(Obeli);
		Obeli.Talk("It's not fair !");
		Panorami.boost(Asteri);
		Asteri.Talk("Hey!");
		Minus.Talk("Oh no a gaulois !");
		Asteri.hit(Minus);

	}

}
