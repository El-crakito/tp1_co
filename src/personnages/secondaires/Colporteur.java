package personnages.secondaires;
import personnages.principaux.Commercant  ; 

public class Colporteur extends Commercant  {
	
	public Colporteur (String nom , int n ) {
		super(nom , n );
	}
	public int seFaireExtorquer() {
		int s= this.getArgent()/2;
		this.perdreArgent(s);
		this.parler(" Hihihihi j'avais caché " + s + " dans mes chaussetes ce beta ne les as pas vu ");
		return s ; 
	}
	
	
	
	
}
	
