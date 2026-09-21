import java.util.Scanner;

public class Baecker {



    String [] waren ={"Kaffee", "Brot", "Bretzel","Tee" };
    double [] preis = {1.20, 2.40,1.0,2.0};
    double preisgesamt;
    public static void main (String[] args){
        Baecker ba =new Baecker();

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Was moechtest du kaufen?");
        String warenein = scanner.nextLine();
        System.out.println(" Welche Anzahl magst du?");
        int anzahl = scanner.nextInt();

        ba.rechner(warenein);

        






    }
    public void rechner(String warenein){

        


    }

}
