package personnages.principaux;
import java.util.Random;
import personnages.Humain;


public class Ronin extends Humain {
	private int honneur ;
	
	public Ronin(String nom , int argent , String boisson) {
		super(nom, argent , boisson );
		this.honneur=1;
	}
	public void donner( int f , Commercant c) {
		if( f >this.getArgent()) {
			System.out.println("don impossible le personnage ne posséde que : " + this.getArgent());
		}
		else {
			this.perdreArgent(f);
			c.gagnerArgent(f);
			this.parler("tient " + c.getNom()+" voilà"+f + " sous."); 
		}
	}
	
	public void provoquer(Yakusa y ) {
		if(this.honneur*2>y.geteputation()) {
			this.honneur+=1;
			
			int g = y.perdreDuel();
			this.parler("c'est chaud comment t'es faible , va boire du bon bissap et revient me voir petit ronin  ");
			this.gagnerArgent(g);
		}
		else if (this.honneur*2<y.geteputation()) {
			this.honneur--;
			this.parler(" arhhh j'avais pas mes geox att seulement je reviens ");
		}
		else {
			 Random generateur = new Random();
	        int pf = generateur.nextInt(2); 
	        
	        if (pf==1) {
	            this.honneur += 1;
	            this.parler("c'est chaud comment t'es faible, va boire du bon bissap et revient me voir ");
	            int g = y.perdreDuel();
	            this.gagnerArgent(g); 
	        } 
	        else {
	            this.honneur--;
	            this.parler("arhhh j'avais pas mes geox att seulement je reviens ");
	            y.gagnerDuel();
	        }
		}
	}
}
