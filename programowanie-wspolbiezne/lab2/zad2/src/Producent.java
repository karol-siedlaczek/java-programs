import java.util.Random;

public class Producent implements Runnable{
    Main wartosc;
    static Random losuj = new Random();
    Bufor bufor = new Bufor();

    Producent(Main wartosc){
        this.wartosc = wartosc;
        new Thread(this,"produkcja").start();
    }

    public void run(){
        for(int i = 0; i < bufor.max; i++){
            int losowy = losuj.nextInt(1000);
            wartosc.produkuj(losowy);
        }
    }
}