 package personnages.secondaires;
import personnages.principaux.*;

public class Testsecond {

    public static void main(String[] args) {
        GrandMere mamie = new GrandMere("Mamie Odette", 200);
        
        Commercant marchand = new Commercant("Marco", 20);
        Ronin ronin = new Ronin("Roro", 60, "shochu");
        Yakusa yakuza = new Yakusa("Yaku", 50, "bière", "Wars"); 
        Samourai samourai = new Samourai("Akimoto", 20, "saké", "Miyamoto");
        Traitre traitre = new Traitre("Masako", 100, "eau", "Miyamoto");
        
        System.out.println("--- PHASE 1 : RENCONTRES ---");
        mamie.faireConnaissanceAvec(marchand);
        mamie.faireConnaissanceAvec(ronin);
        mamie.faireConnaissanceAvec(yakuza);
        mamie.faireConnaissanceAvec(samourai);
        mamie.faireConnaissanceAvec(traitre);
     
        System.out.println("\n--- PHASE 2 : RAGOTS ---");
        System.out.println("(Relance le programme plusieurs fois pour voir l'aléatoire changer !)");
        mamie.ragoter();
        
        System.out.println("\n--- PHASE 3 : TEST DE LA LIMITE DE MEMOIRE ---");

        for (int i = 1; i <= 27; i++) {
            Commercant clone = new Commercant("Marchand n°" + i, 10);
            mamie.faireConnaissanceAvec(clone);
        }
    }
}