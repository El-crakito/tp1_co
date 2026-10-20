package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain  {

	public Commercant(String nom , int argent  ) {
		super(nom , argent , " thé") ; 
	}
	public int seFaireExtorquer() {
		this.parler("Jai tout perdu! Le monde est trop injuste...");
		int b = this.getArgent() ; 
		this.perdreArgent(b);
		return b ; 
	}
	public void recevoir(int c ) {
		this.gagnerArgent(c);
		this.parler("Je te remercie généreux donateur!");
		
	}
}
