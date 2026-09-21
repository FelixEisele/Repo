public class Kunde {
    String name;
    int alter;
    double geld;

    public static void main (String[]args){
       
        
        App kio = new App();
        kio.erstelleGuiApp();
    }


    public Kunde( String name, int alter, double geld){
        this.name = name;

        this.alter = alter;
        this.geld = geld;
        

    }
    public Kunde(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return this.name;
    }

}
