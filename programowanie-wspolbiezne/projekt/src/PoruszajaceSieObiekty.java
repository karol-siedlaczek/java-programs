import static java.lang.Math.*;

import java.util.ArrayList;
import java.util.List;

public class PoruszajaceSieObiekty extends Thread{
    private final int id;
    private final int podatek_do_zaplacenia;
    private int stolik;
    private int x;
    private int y;
    public static Przejscie czy_zajeta_lista=new Przejscie();
    public static Kolejka urzad;
    private static final Przejscie korytarz=new Przejscie();
    private static final Przejscie[] przy_stanowisku=new Przejscie[2];
    private static final Przejscie[] czy_wolne_za_rogiem=new Przejscie[2];
    public static int tempoPracy=5;
    public static List<PoruszajaceSieObiekty> wszyscy_poruszajaceSieObiekty =new ArrayList<>();

    public PoruszajaceSieObiekty(int _id, int _podatek_do_zaplacenia){
        this.id=_id;
        this.podatek_do_zaplacenia=_podatek_do_zaplacenia;
        this.x=0;
        this.y=550;
        for(int i=0;i<2;i++)
            if(przy_stanowisku[i]==null)
                przy_stanowisku[i]=new Przejscie();
        for(int i=0;i<2;i++)
            if(czy_wolne_za_rogiem[i]==null)
                czy_wolne_za_rogiem[i]=new Przejscie();
    }

    @Override
    public void run(){
        while (x<360) {
            ruchObiektu(x+40,y);
            Thread.yield();
        }
        if(id<4){
           ruchObiektu(360,550);
           ruchObiektu(405,510);
           ruchObiektu(405,200);
           ruchObiektu(375+(id*40),50);
           while (true){
               urzad.idzNaPrzerwe(id);
               dojscieNaStanowisko();
               urzad.zasiadzZaBiurkiem(id);
               przerwaNaKawe();
               try{
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               Thread.yield();
           }
        }
        ruchObiektu(400,520);
        stolik=(urzad.poczekalnia(id));
        czyMogeWejsc();
        dojscieDoStanowiska();
        urzad.klPrzyStoliku(stolik,podatek_do_zaplacenia);
        wyjscieZUrzedu();
        korytarz.dodanieDoKolejki(id);
        ruchObiektu(450,550);
        korytarz.zwolnieniePrzejscia(id);
        ruchObiektu(900,550);
        stop();

    }
    
    public void dojscieNaStanowisko(){
        if(id==0 || id==3){
            ruchObiektu(375+(id*40),95);
            ruchObiektu(90+(id*230),95);
            ruchObiektu(90+(id*230),180);
        }else{
            ruchObiektu(375+(id*40),135);
            ruchObiektu(90+(id*230),135);
            ruchObiektu(90+(id*230),180);
        }
    }

    public void przerwaNaKawe(){
        if(id==0 || id==3){
            ruchObiektu(90+(id*230),95);
            ruchObiektu(375+(id*40),95);
            ruchObiektu(375+(id*40),50);
        }else{
            ruchObiektu(90+(id*230),135);
            ruchObiektu(375+(id*40),135);
            ruchObiektu(375+(id*40),50);
        }
    }

    public void czyMogeWejsc(){
        if(stolik>1)
            czy_wolne_za_rogiem[1].dodanieDoKolejki(id);
        else
            czy_wolne_za_rogiem[0].dodanieDoKolejki(id);

        korytarz.dodanieDoKolejki(id);
        ruchObiektu(410,505);
        if(stolik>1)
            ruchObiektu(450,400);
        else
            ruchObiektu(410,400);

        korytarz.zwolnieniePrzejscia(id);
        if(stolik>1){
            ruchObiektu(490,400);
            czy_wolne_za_rogiem[1].zwolnieniePrzejscia(id);
        }else{
            ruchObiektu(370,400);
            czy_wolne_za_rogiem[0].zwolnieniePrzejscia(id);
        }
    }
    
    public void dojscieDoStanowiska(){
        if(stolik==0){
            ruchObiektu(90,400);
            ruchObiektu(90,280);
        }
        else if(stolik==1){
            ruchObiektu(320,400);
            przy_stanowisku[0].dodanieDoKolejki(id);
            ruchObiektu(320,280);
            przy_stanowisku[0].zwolnieniePrzejscia(id);
        }
        else if(stolik==2){
            ruchObiektu(550,400);
            przy_stanowisku[1].dodanieDoKolejki(id);
            ruchObiektu(550,280);
            przy_stanowisku[1].zwolnieniePrzejscia(id);
        }
        else if(stolik==3){
            ruchObiektu(780,400);
            ruchObiektu(780,280);
        }
    }

    public void wyjscieZUrzedu(){
        if(stolik==0){

            ruchObiektu(140,280);
            ruchObiektu(140,340);
            ruchObiektu(270,340);
            przy_stanowisku[0].dodanieDoKolejki(id);
            ruchObiektu(370,340);
            przy_stanowisku[0].zwolnieniePrzejscia(id);
            ruchObiektu(400,340);
        }
        else if(stolik==1){

            ruchObiektu(370,280);
            przy_stanowisku[0].dodanieDoKolejki(id);
            ruchObiektu(370,340);
            przy_stanowisku[0].zwolnieniePrzejscia(id);
            ruchObiektu(400,340);
        }
        else if(stolik==2){

            ruchObiektu(500,280);
            przy_stanowisku[1].dodanieDoKolejki(id);
            ruchObiektu(500,340);
            przy_stanowisku[1].zwolnieniePrzejscia(id);
            ruchObiektu(480,340);
        }
        else if(stolik==3){

            ruchObiektu(760,280);
            ruchObiektu(760,340);
            ruchObiektu(600,340);
            przy_stanowisku[1].dodanieDoKolejki(id);
            ruchObiektu(500,340);
            przy_stanowisku[1].zwolnieniePrzejscia(id);
            ruchObiektu(480,340);
        }
    }
    
    public synchronized void ruchObiektu(int xDo, int yDo){
        boolean koniec_ruchu_X=false;
        for (;;){
            if(x<xDo){
                if(wykrywanie_kolizji(id,0))x++;
            }
            else if(x>xDo){
                if(wykrywanie_kolizji(id,1))x--;
            }
            else
                koniec_ruchu_X=true;

            if(y<yDo){
                if(wykrywanie_kolizji(id,2))y++;
            }
            else if(y>yDo){
                if(wykrywanie_kolizji(id,3))y--;
            }
            else if(koniec_ruchu_X){
                break;
            }
            try {
                Thread.sleep(tempoPracy);

            }catch (InterruptedException e) {
                    e.printStackTrace();
            }

        }
    }
    // 0 - x++
    // 1 - x--
    // 2 - y++
    // 3 - y--
    // 4 - xy++
    // 5 - xy--
    public synchronized boolean wykrywanie_kolizji(int punktA, int zadanie) {
        int ax=x;
        int ay=y;
        if (zadanie == 0 || zadanie == 4)
            ax++;
        else if (zadanie == 1 || zadanie == 5)
            ax--;
        if (zadanie == 2 || zadanie == 4)
            ay++;
        else if (zadanie == 3 || zadanie == 5)
            ay--;
        czy_zajeta_lista.przechodzenie(0);
        for (PoruszajaceSieObiekty aktualnie_sprawdzany : wszyscy_poruszajaceSieObiekty) {
            if (aktualnie_sprawdzany.getid() != punktA) {
                if (sqrt((aktualnie_sprawdzany.getX() - ax) * (aktualnie_sprawdzany.getX() - ax) +
                        (aktualnie_sprawdzany.getY() - ay) * (aktualnie_sprawdzany.getY() - ay)) < 35) {
                    return false;
                }
            }
        }
        return true;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getid(){
        return id;
    }
}