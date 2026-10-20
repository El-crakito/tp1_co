package personnages.principaux; 
public class Test {

	public static void main (String[]args){  
		
		System.out.println("--- TEST 1 : LE SAMOURAI CLASSIQUE ---");
        Samourai akimoto = new Samourai("Miyamoto", 20, "Akimoto", "saké");
        akimoto.direBonjour();
        akimoto.boire();
        akimoto.boire("thé");
        Ronin musaichi = new Samourai("Miyamoto", 50, "Musaichi", "thé");
        musaichi.direBonjour();
        ((Samourai) musaichi).boire("bière");
		
		
	}
}
