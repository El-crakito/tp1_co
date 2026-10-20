package personnages.secondaires;
import personnages.principaux.Commercant;
import personnages.principaux.Samourai;
import personnages.Humain;
public class Traitre extends Samourai{
	private int nivt;

	public Traitre(String nom , int argent , String boisson , String noms) {
		super(nom, argent , boisson , noms);
		this.nivt=0;
	}	
		public void extorquer(Commercant c ) {
			if(nivt>=3) {
				this.parler("ARH mon niveau de traitrise est trop haut les gens se méfient de moi");
			}
			else {
			int d = c.seFaireExtorquer();
			this.gagnerArgent(d);
			this.parler("J’ai piqué le fric de "+ c.getNom());
			this.nivt++;}
		}
		
		public void direBonjour() {
			super.direBonjour();
			this.parler(" , et je posséde " + this.nivt +" de niveau de traitrise0 ");
		}
		public void faireLeGentil(Humain h , int d ){
			if(d> this.getArgent()) {
				this.parler("Je n'ai pas assez d'argent pour faire ce don je n'ai que : "+this.getArgent());
			}
			else {
				h.gagnerArgent(d);
				this.perdreArgent(d);
				this.parler("Nous sommes maintenant amis "+ h.getNom());
				this.nivt-= (d/10);
				if(this.nivt<0) {this.nivt=0;}
				
			}

			
		}
		
	
}
