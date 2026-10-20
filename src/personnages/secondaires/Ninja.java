package personnages.secondaires;
import personnages.principaux.Yakusa;
import java.util.Random;
public class Ninja extends Yakusa{
	private String clansecret;
	private static final String clanNinja []  = {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};
	
	public  Ninja(String nom , int argent  , String boisson , String clan  ) {
		super(nom, argent , boisson , clan );
		Random generateur =  new Random();
		int x = generateur.nextInt(5);
		this.clansecret = switch (x) {
			case 0 ->clanNinja[x];
			case 1 ->clanNinja[x];
			case 2 ->clanNinja[x];
			case 3 ->clanNinja[x];
			case 4 ->clanNinja[x];
			default -> "Of Darkness";
			};	
	}
	public void direBonjour() {
		super.direBonjour();
		this.parler("mon clan secret est :"+this.clansecret+ " et maintenant que tu le sais, je vais devoir te tuer");
	}
}
