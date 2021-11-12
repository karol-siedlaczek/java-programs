/*	Karol Siedlaczek I8X1N1 2019
	Napisz program, który będzie losował nazwiska klientów z listy (zobacz punkt (i) poprzedniego zadania nr 3), a następnie je usuwał. 
	Dokładniej, zaimplementuj klasę Names z obiektowym atrybutem names odpowiadającym wspomnianej liście i z obiektową metodą choose(), która zwraca losowo wybrane 
	nazwisko z listy names usuwając je jednocześnie. 
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Names {
    List<String> lista_klientow = new ArrayList();
    Random losuj = new Random();
    int random;
    int i = 1;

    public Names(){
        lista_klientow.add("Kamila");
        lista_klientow.add("Anna");
        lista_klientow.add("Andrzej");
        lista_klientow.add("Andrzej");
        lista_klientow.add("Marek");
        lista_klientow.add("Adam");
        lista_klientow.add("Janusz");
        lista_klientow.add("Karol");
        lista_klientow.add("Marcin");
        lista_klientow.add("Mikołaj");
        lista_klientow.add("Danuta");
        lista_klientow.add("Milena");
    }
    public void choose(){
        random = losuj.nextInt(lista_klientow.size());
        System.out.println(i + ": " + "Usuniety klient: " + lista_klientow.get(random));
        lista_klientow.remove(random);
        i++;
    };

    public void get_size(){
        System.out.println("Obecna wielkosc listy: " + lista_klientow.size());
    }

    public static void main (String[] args) {
        Names klienci = new Names();

        klienci.get_size();
        klienci.choose();
        klienci.choose();
        klienci.choose();
        klienci.choose();
        klienci.choose();
        klienci.choose();
        klienci.choose();
        klienci.choose();
        klienci.choose();
        klienci.choose();
        klienci.choose();
        klienci.choose();
        klienci.get_size();

    }
}
