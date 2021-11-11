import java.util.concurrent.ThreadLocalRandom;


class Bank{
    public static int N = 0;//ilosc_kont
    public static int suma_M = 0;
    static int number_of_bank;
    //rivate static Bank[] konto;


    public static KontoBankowe[] konto;
    static int saldo;
    static int numer_banku;
    static int index;
    public Bank() {
        this.number_of_bank = 1;
    };

    /*public static int dodaj_konto(){
        return N++;
    }*/
    public static void dodaj_konto(int x, int ile_kont){
        N++;
        konto[N].saldo = x;
        konto[N].numer_banku = 1;
        konto[N].index = N;
        suma_M = suma_M + x;
    }
    public void wyswietl_konta(){
        for(int i = 0; i < N; i++)
        System.out.println("index konta:" + konto[N].index + ", saldo konta: " + konto[N].saldo + ", numer banku: " + konto[N].numer_banku);
    }


    public static int licz_suma(int x){return suma_M += x;}
    void get(){System.out.println("SUMA_M: " + suma_M + ", kont jest: " + N);}

    public static void edytuj_saldo(int wartosc, int index_nadawca, int index_odbiorca){
       // System.out.println("stare: " + klient_0.M);
        //klient_0.M = klient_0.M+wartosc;
        //System.out.println("nowe: " + klient_0.M);
       // klient
    }

    public static void main(String[] args){
        Bank bank = new Bank();

        for(int i=0; i<20; i++){
            bank.dodaj_konto(1000, i);
        }


        bank.wyswietl_konta();

        /*KontoBankowe klient_0 = new KontoBankowe(1000, 1, bank_1);
        KontoBankowe klient_1 = new KontoBankowe(1000, 2, bank_1);
        KontoBankowe klient_2 = new KontoBankowe(1000, 3, bank_1);
        KontoBankowe klient_3 = new KontoBankowe(1000, 4, bank_1);
        KontoBankowe klient_4 = new KontoBankowe(1000, 5, bank_1);
        KontoBankowe klient_5 = new KontoBankowe(1000, 6, bank_1);
        KontoBankowe klient_6 = new KontoBankowe(1000, 7, bank_1);
        KontoBankowe klient_7 = new KontoBankowe(1000, 8, bank_1);
        KontoBankowe klient_8 = new KontoBankowe(1000, 9, bank_1);
        KontoBankowe klient_9 = new KontoBankowe(1000, 10, bank_1);*/

        //klient_0.bank_1.edytuj_saldo(100,1,1);

    }
}

class KontoBankowe extends Thread{
    static public int M;
    int index;
    static Bank bank_1;


    int saldo;
    int numer_banku;

    public KontoBankowe(int M, int index, Bank bank_new){
        this.M = M;
        this.index = index;
       // Bank.licz_suma(M);
        //Bank.dodaj_konto();

        if(bank_1 == null){
            bank_1 = bank_new;
        }
    }
    /*public KontoBankowe(int M, int index, int suma_N, int number_of_bank) extends Bank(), M_Bank(M), index_Bank(index){
        this.M = M;
        this.index = index;
        Bank.licz_suma(M);
        Bank.dodaj_konto();
    }*/

    public void run(){
        for(;;){
            int index_odbiorca = ThreadLocalRandom.current().nextInt(0,Bank.N);
            if(index_odbiorca != index){
                int wartosc_przelewu = ThreadLocalRandom.current().nextInt(-100,100);
                /*try{
                    //bank_1.edytuj_saldo(wartosc_przelewu, index, index_odbiorca);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }*/
            }
        }
    }
    void get_all(){System.out.println("index: " + index + ", saldo na koncie: " + M + ", numer banku: " + bank_1.number_of_bank);}
    int get_index(){return index;};
    int get_M(){return M;};

    /*public void run(){
        for(;;){
            int do_kogo = ThreadLocalRandom.current().nextInt(0, Bank.this.N);
            if(do_kogo != index){
                int ile = ThreadLocalRandom.current().nextInt(-100,100);
            }
        }
    }*/


}
class Main{

}



