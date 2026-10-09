package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain  {

	public Commercant(String nom , int argent  ) {
		super(nom , argent , " thé") ; 
	}
	public int seFaireExtorquer() {
		int b = this.getArgent() ; 
		this.perdreArgent(b);
		return b ; 
	}
	public void recevoir(int c ) {
		this.gagnerArgent(c);
		
	}
}
