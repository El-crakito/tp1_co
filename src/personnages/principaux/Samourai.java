package personnages.principaux;

public class Samourai extends Ronin {
	private String seigneur ; 

	public Samourai(String nom , int argent , String boisson , String noms){
		super(nom, argent , boisson );
		this.seigneur=noms;
	}
	public void setnoms(String noms) {this.seigneur=noms;}
	
	public void direBonjour() {
        super.direBonjour();
        this.parler("Je sers le grand seigneur " + this.seigneur + " !");
    }
	
	public void boire(String boisson) {
		super.parler("Mhhhh , un bon verre de " + boisson + "! GLOUPS ! ");
	}
}
