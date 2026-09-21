
import javax.swing.*;

import java.awt.event.*;
import java.util.ArrayList;


public class App implements ActionListener{
KioskmitBild bil = new KioskmitBild();
    JButton weiter;
    JFrame displayapp;
JTextField textfieldnam;
Kunde kunde1;
    public void erstelleGuiApp() {
         displayapp = new JFrame("App");
        JLabel zukiosk = new JLabel("Hier geht es zum Kiosk.");
        JPanel hintergrundapp = new JPanel();
        JPanel namen = new JPanel();
        JPanel kioskbutton = new JPanel();
        JLabel nameneingabe = new JLabel("Bitte geben sie hier bitte ihren Namen ein:");
        textfieldnam = new JTextField(25);

        weiter = new JButton("Drücken");

        weiter.addActionListener(this);
        textfieldnam.addActionListener(this);
        namen.add(nameneingabe);
        namen.add(textfieldnam);

        kioskbutton.add(zukiosk);
        kioskbutton.add(weiter);
        hintergrundapp.add(namen);
        hintergrundapp.add(kioskbutton);

        displayapp.add(hintergrundapp);










         displayapp.setSize(600, 600);
         displayapp.setVisible(true);
    }
     String vun;

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == weiter){
            vun = textfieldnam.getText();
            kunde1 = new Kunde(vun);
            bil.setKunde(kunde1);
        bil.erstelleGui();
         displayapp.dispose();
         
    }

}

public String getvun(){

return vun;
}
}
