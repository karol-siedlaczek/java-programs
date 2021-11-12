// Karol Siedlaczek I8X1N1
// Zaimplementuj w Javie problem producenta - konsumenta, przekazującego losowe liczby z zakresu 1-1000 z wykorzystaniem kolejki blokującej
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    static int bufor_max = 31;
    static BlockingQueue kolejka = new LinkedBlockingQueue(bufor_max);
    Random losuj = new Random();

    public static void main(String[] args) {
        Producent producent = new Producent();
        Konsument konsument = new Konsument();
        producent.start();
        konsument.start();
    }
}