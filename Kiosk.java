
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

/**
 * Das Programm Kiosk zeigt zu Beginn die ganzen Produkte und frag ob man etwas
 * einkaufen will. Wird dies
 * bejat wir ab gefragt was man kaufen will und wie viel stueck. Danach wird
 * gefragt ob man noch etwas dazu will wir dies benein wir der Kassenbon
 * ausgegeben
 * Kiosk
 */

public class Kiosk {
    ArrayList<String> einkaeufe = new ArrayList<String>();
    String[] produkte = { "Kaffee", "Kuchen", "Tee", "Brot", "Wecken", "Milch", "Brezel", "Schokolade" ,"Leberkäs"};
    double[] preis = { 1.25, 2.0, 2.50, 6.37, 0.40, 0.33, 1.20, 2.00 ,3.0,};
    double gesamtpreis;

    public static void main(String[] args) {
        
        Kiosk kio = new Kiosk();
        Scanner scanner = new Scanner(System.in);
        kio.anzeigen();
        System.out.println("Moechtest du was kaufen? Ja /Nein");
        String einkaufen = scanner.nextLine();

        if (einkaufen.equals("Ja")) {

            boolean nochwas = true;
            while (nochwas == true) {

                System.out.println("Was moechtest du kaufen?");
                String ware = scanner.nextLine();
                kio.einkaeufe.add(ware);
                System.out.println("Wie viel stueck");
                int stck = scanner.nextInt();

                kio.einkaeufe.add(String.valueOf(stck));

                scanner.nextLine();
                kio.einkaeufe.add(String.valueOf(kio.produktauswahl(ware, stck)));

                System.out.println("Sonst noch etwas");
                String nochetwas = scanner.nextLine();
                if (nochetwas.equals("Ja")) {
                    nochwas = true;
                    kio.anzeigen();
                } else {
                    nochwas = false;
                }

            }

            // }
            kio.ausgeben();

            System.out.println("Der Gesamtpreis belauft sich auf: " + kio.gesamtpreis);
            System.out.println("Vielen Dank für ihren Einkauf");
        } else {
            System.out.println("Dann wünsche ich ihen noch einen schönen Tag");

        }

    }

    public double produktauswahl(String ware, int stck) {
        double preisaktuel = 0;
        Boolean gefunden = false;
        
        for (int i = 0; i < produkte.length; i++) {
            if (ware.equals(produkte[i])) {

                preisaktuel = preis[i] * stck;

                gesamtpreis = gesamtpreis + (preis[i] * stck);
                gefunden = true;


            }
        }
        if(gefunden == false){
            System.out.print("Es ist ein fehler aufgetreten!");
             einkaeufe.remove(einkaeufe.size() - 1); // Löscht das letzte Element
            einkaeufe.remove(einkaeufe.size() - 1); // Löscht das (neue) letzte Element


        }
    
        return preisaktuel;
        
    }

    public void anzeigen() {
        System.out.println("");
        System.out.println("Herzlich Wilkommen im Kiosk");
        System.out.println("");
        System.out.println("Unsere Produkte sind:");

        for (int i = 0; i < produkte.length; i++) {
            System.out.print(produkte[i] + "\t\t");

        }
        System.out.println("");
        System.out.println("");

    }

    int j = 0;

    public void ausgeben() {

        System.out.println("Ihr Beleg ");
        System.out.println("--------------------------------------------------------- ");
        while (!einkaeufe.isEmpty()) {

            String element = einkaeufe.remove(0);

            System.out.print(element + "\t\t");
            // System.out.print(" ");

            j++;
            if (j > 2) {
                System.out.println("");
                System.out.println("--------------------------------------------------------- ");
                j = 0;
            }

        }
        

    }

}
