public class Konsument implements Runnable{
    Main wartosc;
    Bufor bufor = new Bufor();

    Konsument(Main wartosc){
        this.wartosc = wartosc;
        new Thread(this, "konsumpcja").start();
    }

    public void run(){
        for(int i = 0; i < bufor.max; i++){
            wartosc.konsumuj();
        }
    }
}