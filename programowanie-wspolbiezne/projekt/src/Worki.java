public class Worki {
    public static int skarbiec=0;
    private int zawartosc;
    public Worki(){
        this.zawartosc=0;
    }
    public boolean czyPusty(){
        if(zawartosc==0)
            return true;
        return false;
    }
    public synchronized void dodaj(int ile){
        zawartosc+=ile;
    }
    public synchronized void wyjmij(){
        skarbiec+=zawartosc;
        zawartosc=0;
    }
}
