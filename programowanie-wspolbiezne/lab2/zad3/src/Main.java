//Karol Siedlaczek I8X1N1
//Zaimplementuj w Javie problem producenta - konsumenta, przekazującego losowe liczby z zakresu 1-1000, z wykorzystaniem monitora (dowolny sposób implementacji wewnętrznej)
import java.util.LinkedList;
import java.util.Random;

public class Main {
    static int bufor_max = 20;
    static LinkedList<Integer> bufor = new LinkedList<>();
    static Random losuj = new Random();

    public void produkuj() throws InterruptedException {
        while(true){
            synchronized (this) {
                while(bufor.size() != 0){
                    //wait();
                    wait(losuj.nextInt(300 - (100 * bufor.size())));
                }
                int losowy = losuj.nextInt(1000);
                bufor.add(losowy);
                System.out.println("Producent wyprodukowal: " + bufor.toString());
                notify();
                Thread.sleep(300);
            }
        }
    }

    public void konsumuj() throws InterruptedException {
        while(true){
            synchronized (this) {
                while(bufor.size() == 0){
                    wait();
                }
                int do_usuniecia = bufor.removeFirst();
                System.out.println("Konsument skonsumowal: " + do_usuniecia);
                notify();
            }
        }
    }
}


