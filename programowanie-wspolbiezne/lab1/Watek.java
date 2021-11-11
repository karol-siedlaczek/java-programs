package threads;

import java.util.concurrent.Semaphore;

public class Watek{
   public static void main (String[] args) {
        int wartosc_min = 5;
        var bank_1 = new threads.Bank(10, 1000);
        final Semaphore a = new Semaphore(0);
        final Semaphore b = new Semaphore(1);

        Thread first = new Thread(new Runnable() {
            @Override
            public void run(){
                for (int i = 0; i < 100; i++){
                    int od_kogo = (int)(Math.random() * 5);
                    int do_kogo = (int)((Math.random() * 5) + wartosc_min);
                    System.out.print("1: " + i + " ");
                    try{
                       b.acquire();
                       Thread.sleep((int) (200));
                    }catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                    int wartosc = (int) (Math.random() * 500);
                    bank_1.transfer(od_kogo, do_kogo, wartosc);
                    a.release();
                }
            }
        });

        Thread second = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++){
                    int od_kogo = (int)(Math.random() * 4);
                    int do_kogo = (int)((Math.random() * 4) + wartosc_min);
                    System.out.print("2: " + i + " ");
                    try{
                        a.acquire();
                        Thread.sleep((int) (200));
                    }catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                    int wartosc = (int) (Math.random() * 1000);
                    bank_1.transfer(od_kogo, do_kogo, wartosc);
                    b.release();
                }
            }
        });

        first.start();
        second.start();
    }
}
