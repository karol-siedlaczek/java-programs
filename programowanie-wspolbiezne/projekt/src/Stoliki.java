public class Stoliki {
    private int kl_przy_stoliku;
    private final Worki worek_na_podatek;

    public Stoliki(){
        this.kl_przy_stoliku=-1;
        worek_na_podatek=new Worki();
    }
    public boolean czyKlPrzyStanowisku(int numer_kl){
        if(kl_przy_stoliku==numer_kl)
            return true;
        else
            return false;
    }
    public void zarezerwujStolik(int numer_kl){
        kl_przy_stoliku=numer_kl;
        dzwonekDonastepnegoKlienta();
    }
    public synchronized void oddawaniePodatku(int ilosc_do_zaplacenia){
        try {
            worek_na_podatek.dodaj(ilosc_do_zaplacenia);
            notifyAll();
            while (!worek_na_podatek.czyPusty())
                wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread.yield();
    }
    public synchronized void zabieraniePodatku(){
        try {

            while (worek_na_podatek.czyPusty() && kl_przy_stoliku!=-1) wait();
            if(!worek_na_podatek.czyPusty()){
                Thread.sleep(500);
                worek_na_podatek.wyjmij();
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public synchronized void dzwonekDonastepnegoKlienta(){
        notifyAll();
    }
    public synchronized void przerwa(){
        try {
            while (kl_przy_stoliku==-1) wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
