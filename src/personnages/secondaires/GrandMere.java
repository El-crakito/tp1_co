package personnages.secondaires;
import personnages.Humain;
import java.util.Random;
public class GrandMere extends Humain {
	
	private Humain [] memoire = new Humain[30];
	private int nbco;
	
	public GrandMere(String nom , int argent) {
		super(nom , argent , "tisane");
		this.nbco = 0;
	}
	private  String humainHasard() {
		Random generateur = new Random();
		int x = generateur.nextInt(4); 
		switch(x) {
		case 0 :return "Commercant";
		case 1 :return "Ronin";
		case 2 :return "Samourai";
		case 3 :return "Yakusa ";	}
		return "Traitre";}
	
	public void faireConnaissanceAvec(Humain humain) {
		if(nbco>=30) {
			System.out.println("Ajout impossible mere grand n'a plus de place dans sa cabeza de mamie: " + this.getNom());
			
		}
		else {
		this.memoire[nbco]=humain ;
		this.nbco+=1;
	}}
	
	public void ragoter() {
		for( int i = 0 ; i<nbco ; i++) {
			if (memoire[i] instanceof Traitre) {
				this.parler("je sais que " + memoire[i].getNom() +" est un traitre ");
			}
			else {
				this.parler("je crois que " + memoire[i].getNom() + " est un " + this.humainHasard());
			}
			}
		}
	}


