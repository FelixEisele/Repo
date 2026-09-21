import java.util.Scanner;

public class Main{

String productName = "Kaffe" ;
double price = 2.5;
int stock = 10;
Boolean available = true;
int amount = 3;
double totalPrice = price * 3;
double discount = totalPrice * 0.1;
double rund = totalPrice - discount;
String receipt = productName.toUpperCase() +"\n" + "Preis: " + price + "\n" + "Anzahl: " + amount +"\n" + "Endpreis: " + rund;

/*
Console Wichtige Befehle:
kompilieren:
C:\Users\Your Name>javac Main.java
ausgabe:
C:\Users\Your Name>java Main


*/

/**
 * final fuer Konstanten das Wert sich nicht aendert
 * var fuer alle Datentypen
 *  int double = int;
 * int myInt = (int) myDouble;
 * 
 * String
 * Großbuchstaben um.toUpperCase()
 *  Kleinbuchstaben um.toLowerCase()
 * .lenght fuer laenge
 * equals fuer vergleiche
 * String result = a.concat(b).concat(c); zum verbinden 
 * 
 * \n new line 
 * 
 * double zahl = 7.8362;​

double gerundet = Math.round(zahl * 100.0) / 100.0;​

// Zufallszahl zwischen 1 und 6 (wie ein Wuerfel)​
int wuerfel = (int) (Math.random() * 6) + 1;​
System.out.println("Gewuerfelt: " + wuerfel);​
 */






public static void main(String[]args){
   
Main ma = new Main();
/* 
Scanner scanner = new Scanner(System.in);
System.out.println(" Welches Produkt moechtest du kaufen?");
String eingabe = scanner.nextLine();
System.out.println(" Wie viel moechtest du kaufen?");
int stck = scanner.nextInt();
ma.scanner(eingabe, stck);
*/

int  zahl = (int) (Math.random()*20);
System.out.println(zahl);



}

public void scanner(String eingabe,int stck){

System.out.println("Du hast " + eingabe + " ausgewaehlt");
System.out.println("Du moechtest " + stck + " kaufen");
double preis = Math.round(stck * price );
System.out.println("Das macht dann " + preis+ " Euro​"); 



}








public void ausgeben (){
   
System.out.println(" Ausgabe Konsole: ");
System.out.println(" ");
System.out.println(" ");
 System.out.println("Wilkommen im Shop!"); // Felix Eisele 11.09.2026
System.out.println("Produkt: " +productName);
System.out.println("Preis: " + price);
System.out.println("Bestand: " + stock);
System.out.println("Verfuegbar: " + available);
System.out.println("Gesamtpreis: " + totalPrice);
System.out.println("Rabatt: " + discount);
System.out.println("Endpreis: " + (totalPrice - discount));
System.out.println("Rundung: " + (int) rund );





}
public void aufgabe4 (){
System.out.println(receipt);


}


}