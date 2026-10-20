 package personnages.secondaires;
import personnages.principaux.*;

public class Testsecond {

    public static void main(String[] args) {
    	
    	/* TEST GRAND MERE 
        GrandMere mamie = new GrandMere("Mamie Odette", 200);
        
        Commercant marchand = new Commercant("Marco", 20);
        Ronin ronin = new Ronin("Roro", 60, "shochu");
        Yakusa yakuza = new Yakusa("Yaku", 50, "bière", "Wars"); 
        Samourai samourai = new Samourai("Akimoto", 20, "saké", "Miyamoto");
        Traitre traitre = new Traitre("Masako", 100, "eau", "Miyamoto");
        
        mamie.faireConnaissanceAvec(marchand);
        mamie.faireConnaissanceAvec(ronin);
        mamie.faireConnaissanceAvec(yakuza);
        mamie.faireConnaissanceAvec(samourai);
        mamie.faireConnaissanceAvec(traitre);
     
        System.out.println("(Relance le programme plusieurs fois pour voir l'aléatoire changer !)");
        mamie.ragoter();
        

        for (int i = 1; i <= 27; i++) {
            Commercant clone = new Commercant("Marchand n°" + i, 10);
            mamie.faireConnaissanceAvec(clone);
        }
    }
    */
    	/* TEST COMMERCANT 
    	System.out.println("--- CRÉATION ---");
		Colporteur sacha = new Colporteur("Sacha", 100);
		Yakusa yakuza = new Yakusa("Yaku", 0, "bière", "Wars");
		
		sacha.direBonjour();
		
		System.out.println("\n--- L'EXTORSION ---");
		yakuza.extorquer(sacha);
		
		System.out.println("\n--- VÉRIFICATION DES POCHES ---");
		System.out.println(sacha.getNom() + " possède " + sacha.getArgent() + " sous.");
		System.out.println(yakuza.getNom() + " possède " + yakuza.getArgent() + " sous.");
		*/

    	/* TEST DES NINJA 
		for (int i = 1; i <= 5; i++) {
			Ninja n = new Ninja("Ninja n°" + i, 50, "saké", "Couverture");
			n.direBonjour();
			System.out.println(""); 
		}
		
		Ninja naruto = new Ninja("Naruto", 10, "ramen", "Konoha");
		Commercant marchand = new Commercant("Ichiraku", 100);
		
		marchand.direBonjour();
		naruto.extorquer(marchand);
		
		System.out.println("\nBilan des bourses :");
		System.out.println(naruto.getNom() + " a " + naruto.getArgent() + " sous.");
		System.out.println(marchand.getNom() + " a " + marchand.getArgent() + " sous.");
	
*/
}
}