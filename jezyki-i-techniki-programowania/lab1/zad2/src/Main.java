/*
	Karol Siedlaczek I8X1N1 2019
	Zaimplementuj klasy Point i Line odpowiadające odpowiednio punktom i liniom w przestrzeni dwuwymiarowej z odpowiednimi konstruktorami.  (2pkt)	 
	Klasy te poza konstruktorami i akcesorami/modyfikatorami do zmiennych prywatnych mają zawierać: 
		a) metodę move pozwalającą na przesuwanie punktów i linii o wektor, (2pkt)
		b) metodę flip pozwalającą na przerzucanie symetryczne względem początku układu współrzędnych. (2pkt) 
	Dodatkowo klasa Point powinna zawierać metody:
		a) toLine tworzącą prostą na podstawie drugiego punktu, (1pkt)
		b) toLine tworzącą prostą na podstawie podanych dwóch punktów. (1pkt)
	A także klasa Line powinna zawierać metody:
		a) isOnLine sprawdzającą czy dany punkt należy do prostej,(1pkt)
		b) interSection wyliczającą punkt przecięcia podanej prostej,(1pkt)
		c) interSection  wyliczającą punkt przecięcia podanych prostych.(1pkt)
	Należy napisać testy metod i konstruktorów. 
	W celu testowania należy zaimplementować odpowiednio metodę toString() zwracającą dla danego obiektu reprezentujący go string. (4pkt)
*/
package pl.edu.wat.pw.lab1;


import java.util.concurrent.Semaphore;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("hello from my thread");
    }
}

public class Main {

    public static void main(String[] args) throws InterruptedException {
/*
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World: " + Thread.currentThread());
                final Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("hello: " + Thread.currentThread());
                        try {
                            Thread.sleep(10 * 1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
                thread.start();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(thread.getState());
            }
        });
        t.getState(); // NEW
        t.start(); // RUNNABLE -> harmonogramowanie do działania / bądź już działa
        Thread.sleep(1000 * 3);
        //BLOCKED
        //WAITING
        //TIME_WAITING
        System.out.println(t.getState()); //TERMINATED
        new MyThread().start();


*/
        final Semaphore a = new Semaphore(1); //--> semafor binarny
        final Semaphore b =  new Semaphore(0);
        Thread first = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 1000; i++) {
                    try {
                        a.acquire();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("1: "+i);
                    b.release();
                }
            }
        });

        Thread second = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 1000; i++) {
                    try {
                        b.acquire();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("2: "+i);
                    a.release();
                }
            }
        });

        first.start();
        second.start();
    }
}
