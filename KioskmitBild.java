
import javax.swing.*;

import java.awt.event.*;
import java.util.ArrayList;

public class KioskmitBild extends Kiosk implements ActionListener {
    ArrayList<String> beleg = new ArrayList<String>();
    private JTextField textField;
    private JButton buttone;
    private JButton buttonz;
    private JButton buttond;
    private JButton buttonv;
    private JTextArea textBereich;
    private JTextField sonstfield;
    private Kunde kunde1;
    private JButton fertig;
    private JFrame display;

    /*
     * public static void main(String[] args) {
     * KioskmitBild bil = new KioskmitBild();
     * bil.erstelleGui();
     * }
     */
    public void erstelleGui() {

        display = new JFrame("Kiosk");
        JLabel wilkommen = new JLabel("Herzlich wilkommen im Kiosk " + kunde1);
        JPanel hintergrund = new JPanel();
        JPanel willi = new JPanel();
        JPanel oben = new JPanel();
        JPanel mitte = new JPanel();
        JPanel unten = new JPanel();
        JPanel unteng = new JPanel();
        JPanel sonst = new JPanel();
        textBereich = new JTextArea(20, 50);
        textBereich.setEditable(false);
        JLabel label = new JLabel("Ihre Bestellung bitte: ");
        textField = new JTextField(30);
        buttone = new JButton("1 Stück");
        buttonz = new JButton("2 Stück");
        buttond = new JButton("3 Stück");
        buttonv = new JButton("4 Stück");
        fertig = new JButton("fertig");
        JLabel so = new JLabel("Stück: ");
        sonstfield = new JTextField(10);

        buttone.addActionListener(this);
        buttonz.addActionListener(this);
        buttond.addActionListener(this);
        buttonv.addActionListener(this);
        fertig.addActionListener(this);
        textField.addActionListener(this);

        sonstfield.addActionListener(this);

        oben.add(label);
        oben.add(textField);
        mitte.add(buttone);
        mitte.add(buttonz);
        mitte.add(buttond);
        mitte.add(buttonv);
        sonst.add(so);
        sonst.add(sonstfield);
        mitte.add(sonst);
        unten.add(fertig);

        willi.add(wilkommen);
        hintergrund.add(willi);
        hintergrund.add(oben);
        hintergrund.add(mitte);

        hintergrund.add(unteng);
        hintergrund.add(textBereich);
        hintergrund.add(unten);
        display.add(hintergrund);

        display.setSize(600, 600);
        display.setVisible(true);
        produktanzeigen();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttone) {

            String text = textField.getText();

            listefuellen(text, "1");
            textField.setText("");
        }
        if (e.getSource() == buttonz) {
            String text = textField.getText();

            listefuellen(text, "2");

            textField.setText("");
        }
        if (e.getSource() == buttond) {
            String text = textField.getText();

            listefuellen(text, "3");

            textField.setText("");
        }
        if (e.getSource() == buttonv) {
            String text = textField.getText();

            listefuellen(text, "4");

            textField.setText("");
        }
        if (e.getSource() == fertig) {

            ausgebenbil();
        }

        if (e.getSource() == sonstfield) {

            String text = textField.getText();

            String zahl = sonstfield.getText();
            sonstfield.setText("");
            textField.setText("");
            listefuellen(text, zahl);
        }
    }

    public void listefuellen(String text, String zahl) {
        beleg.add(text);
        beleg.add(zahl);
        beleg.add(String.valueOf(produktauswahl(text, Integer.parseInt(zahl))));
        if (fehler == true) {
            beleg.remove(beleg.size() - 1);
            fehler = false;
        }

    }

    public void ausgebenbil() {
        int v = 0;
        System.out.println("Ihr Beleg ");
        System.out.println("------------------------------------------------------------------------- ");
        System.out.printf("%-20s %-10s %-10s%n", "Produkt", "Stück", "Preis");
        System.out.println("-------------------------------------------------------------------------");
        while (!beleg.isEmpty()) {

            String produkt = beleg.remove(0);
        String stueck = beleg.remove(0);
        String preis = beleg.remove(0);

        // Gibt die Zeile perfekt ausgerichtet aus:
        System.out.printf("%-20s %-10s %-10s Euro%n", produkt, stueck, preis);

             }
           
               
               
        
            

       System.out.println("------------------------------------------------------------------------- ");
        System.out.println("Der Gesamtpreis belauft sich auf: " + gesamtpreis);
        System.out.println("Vielen Dank für ihren Einkauf");
        reset();
       

    }

    public void produktanzeigen() {
        textBereich.append("Unsere Produkte sind:");
        textBereich.append("\n");
        for (int i = 0; i < produkte.length; i++) {

            textBereich.append(produkte[i]);
            textBereich.append("\n");

        }

    }

    Boolean fehler = false;

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
        if (gefunden == false) {
            System.out.println("Es ist ein fehler aufgetreten!");
            beleg.remove(beleg.size() - 1); // Löscht das letzte Element
            beleg.remove(beleg.size() - 1);
            fehler = true;

        }

        return preisaktuel;
    }

    public void reset() {
        gesamtpreis = 0;
        display.dispose();

    }
    public void setKunde(Kunde kunde) {
        this.kunde1 = kunde;
    }

}
