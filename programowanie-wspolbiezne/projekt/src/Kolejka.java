import java.util.ArrayList;
import java.util.List;

public class Kolejka  {
    private final Stoliki[] dostepne_stanowiska;
    private final List<Integer> klienci;

    public Kolejka(){
        this.dostepne_stanowiska=new Stoliki[4];
        for(int i=0;i<4;i++)this.dostepne_stanowiska[i]=new Stoliki();
        this.klienci=new ArrayList<>();
    }

    public int sprawdzCzyJestMojaKolej(int numer_kl){
        for(int i=0;i<4;i++)
            if (dostepne_stanowiska[i].czyKlPrzyStanowisku(numer_kl))
                return i;
        return -1;
    }

    public synchronized int czekajNaStolik(int numer_kl) {
        int dostepny_stolik=-1;
        try {
            while ((dostepny_stolik=sprawdzCzyJestMojaKolej(numer_kl))==-1) wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return dostepny_stolik;
    }

    public void zasiadzZaBiurkiem(int urzednik_numer){
        dostepne_stanowiska[urzednik_numer].zabieraniePodatku();
    }

    public void idzNaPrzerwe(int urzednik_numer){
        dostepne_stanowiska[urzednik_numer].przerwa();
    }

    public int poczekalnia(int numer_kl){
        for(int i=0;i<4;i++){
            if (dostepne_stanowiska[i].czyKlPrzyStanowisku(-1)) {
                dostepne_stanowiska[i].zarezerwujStolik(numer_kl);
                return i;
            }
        }
        klienci.add(numer_kl);
        return czekajNaStolik(numer_kl);
    }

    public synchronized void klPrzyStoliku(int numer_stolika, int ilosc_do_zaplacenia){
        dostepne_stanowiska[numer_stolika].oddawaniePodatku(ilosc_do_zaplacenia);
        if(klienci.isEmpty())
            dostepne_stanowiska[numer_stolika].zarezerwujStolik(-1);
        else{
            dostepne_stanowiska[numer_stolika].zarezerwujStolik(klienci.get(0));
            klienci.remove(0);
        }
        notifyAll();
        dostepne_stanowiska[numer_stolika].dzwonekDonastepnegoKlienta();
    }
}
