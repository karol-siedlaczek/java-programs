// Karol Siedlaczek I8X1N1
// Zaimplementuj w Javie problem producenta - konsumenta, przekazującego losowe liczby z zakresu 1-1000, z wykorzystaniem semaforów
import java.util.concurrent.Semaphore;

public class Main {
    int wartosc;
    final Semaphore Producent = new Semaphore(0);
    final Semaphore Konsument = new Semaphore(1);

    void konsumuj(){
        try{
            Konsument.acquire();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
            System.out.println("Konsument skonsumował: " + wartosc);
            Producent.release();
    }

    void produkuj(int wartosc){
        try{
            Producent.acquire();
            Thread.sleep(300);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Producent wyprodukował: " + wartosc);
        this.wartosc = wartosc;
        Konsument.release();
    }

    public static void main(String args[]){
        Main wartosc = new Main();
        new Konsument(wartosc);
        new Producent(wartosc);
    }
}