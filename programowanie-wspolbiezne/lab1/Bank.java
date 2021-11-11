/*
  Karol Siedlaczek I8X1N1 2019
  Napisz program wspolbiezny dla N (konfigurowalne) kont bankowych i M stałej początkowej wartości
  pieniędzy na każdym koncie będzie w N+1 wątkach realizował przelewy z N kont bankowych na inne
  losowe konta, tak aby przy każdorazowym sprawdzeniu sumy pieniędzy w banku wynosiła ona stałą
  liczbe MxN. Zaimplementuj z użyciem semafora
*/
package threads;
import java.util.Arrays;

public class Bank{
    private int[] konta;

    public Bank(int N, int M){//N - ilosc kont, M - saldo
        konta = new int[N];
        Arrays.fill(konta, M);
    }

    public void transfer(int od_kogo, int do_kogo, int wartosc){
        System.out.println(Thread.currentThread());
        konta[od_kogo] = konta[od_kogo] - wartosc;
        //String str_wartosc = String.format("%10.02f", wartosc);//w przypadku double
        System.out.println(wartosc + " z konta nr " + od_kogo + " na konto nr " + do_kogo);
        konta[do_kogo] = konta[do_kogo] + wartosc;
        System.out.println("Saldo w banku: " + pokaz_saldo() + "\n");
    }

    public int pokaz_saldo(){
        int suma = 0;

        for(int wartosc : konta){
            suma = suma + wartosc;
        }
        return suma;
    }
}
