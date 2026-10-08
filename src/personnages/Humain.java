package personnages;

public class Humain {
	private String nom ; 
	private int argent ; 
	private String boisson ; 
	

	public Humain(String nom , int argent , String boisson ) {
		this.nom=nom;
		this.argent=argent;
		this.boisson=boisson;
	} 
	
	public void parler(String texte) {
		System.out.println(this.nom +" - " + texte);
		
	}
	public void direBonjour() {
		this.parler("Bonjour ! Je m'apelle "+ this.nom + " et j'aime boire du "+ this.boisson);
	}
	public void boire() {
		this.parler("Mhhhh , un bon verre de " + this.boisson + "! GLOUPS ! ");
	}
	public int getArgent() {
		return this.argent;
	}
	public  String getBoisson() {
		return this.boisson;
	}
	public String getNom() {
		return this.nom;
	}
	public void gagnerArgent(int a) {
		this.argent+=a;
	}
	public void perdreArgent(int a) {
		this.argent-=a;
	}
}
