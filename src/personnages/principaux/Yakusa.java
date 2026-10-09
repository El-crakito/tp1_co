package personnages.principaux;

import personnages.Humain;

public class Yakusa extends Humain  {
	private String clan ; 
	private int reputation ; 
	
	public Yakusa(String nom , int argent  , String boisson , String clan  ) {
		super(nom, argent , boisson );
		this.clan=clan;
		this.reputation=0;
		
}
	public String getClan() {return this.clan;}
	public  int geteputation() {return this.reputation;}
	
	public void extorquerc(Commercant c ) {
		int d = c.seFaireExtorquer();
		this.gagnerArgent(d);
	}
	public void gagnerDuel() {
		this.reputation+=1;
		this.parler(" ko 1er round poto  , aller retourne dormir ");
		
	}
	public int perdreDuel() {
		int e = this.getArgent();
		this.reputation=-1;
		this.parler("j'ai ptet perdu mais prochaine 1vs1 octogone gare du nord à main nu ");
		this.perdreArgent(e);
		return e ;
	}
	public void direBonjour() {
		this.parler("Bonjour ! Je m'apelle "+ this.getNom() + " et j'aime boire du "+ this.getBoisson() + " ,  je posséde : "+this.geteputation() +" de réputation et appartient au clan : "+this.getClan());
		//super.direBonjour()
		//this.parler(" ,je posséde : "+this.geteputation() +" de réputation et appartient au clan : "+this.getClan());
	}
}
