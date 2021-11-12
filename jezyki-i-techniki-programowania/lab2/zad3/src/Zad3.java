/*	Karol Siedlaczek I8X1N1 2019
	Rozważ użycie interfejsów Set, List, Queue i Map dla każdego z następujących przypadków (zobacz specyfikację Java API). Ustal, który z nich jest najbardziej odpowiedni oraz wyjaśnij, jak użyć go w implementacji:
		(i) Pewna firma chce odpowiednio zapisać swoich klientów. Każdego miesiąca będą oni losowo wybierani aby otrzymać mały upominek. Trzeba wybrać strukturę danych odpowiednią dla losowania.
		(ii) Ta sama firma chce ponazywać produkty imionami swoich pracowników. Każde imię będzie użyte tylko raz. Trzeba przygotować listę imion.
		(iii) W końcu firma ta zdecydowała się użyć tylko najczęściej występujących imion swoich pracowników do nazwania produktów. Policzono ilu pracowników posiada dane imię. Trzeba przygotować listę imion.
		(iv) Firma chce rozprowadzić bilety na mecze lokalnej drużyny siatkarskiej. Trzeba skonstruować odpowiednią listę oczekujących.
*/
import java.util.*;

public class Zad3 {
    public static void main (String[] args) {

        //CZESC PIERWSZA ZADANIA(i) (LIST)
        Random losuj = new Random();
        List<String> lista_klientow = new ArrayList();
        lista_klientow.add("Kamila");
        lista_klientow.add("Anna");
        lista_klientow.add("Andrzej");
        lista_klientow.add("Andrzej");
        lista_klientow.add("Marek");
        lista_klientow.add("Adam");
        lista_klientow.add("Adam");

        List<String> lista_prezentow = new ArrayList();
        lista_prezentow.add("upominek nr 1");
        lista_prezentow.add("upominek nr 2");
        lista_prezentow.add("upominek nr 3");
        lista_prezentow.add("upominek nr 4");
        lista_prezentow.add("upominek nr 5");
        lista_prezentow.add("upominek nr 6");
        lista_prezentow.add("upominek nr 7");
        lista_prezentow.add("upominek nr 8");
        lista_prezentow.add("upominek nr 9");

        for(int i = 0; i < 15; i++){//symulacja rozdawania upominków co miesiac
            System.out.println(i + ": " + lista_klientow.get(losuj.nextInt(lista_klientow.size())) + " otrzymal/la " + lista_prezentow.get(losuj.nextInt(lista_prezentow.size())));
        }
        System.out.println("Rozmiar lista_klientow: " + lista_klientow.size());
        System.out.println("Rozmiar lista_prezentow: " + lista_prezentow.size());
        System.out.println("\n");

        //CZESC DRUGA ZADANIA(ii) (SET)
        Set<String> lista_pracownikow = new TreeSet<String>();
        lista_pracownikow.add("Kamila");
        lista_pracownikow.add("Anna");
        lista_pracownikow.add("Andrzej");
        lista_pracownikow.add("Andrzej");
        lista_pracownikow.add("Marek");
        lista_pracownikow.add("Adam");
        lista_pracownikow.add("Adam");
        lista_pracownikow.add("Jarek");
        lista_pracownikow.add("Stanisław");
        lista_pracownikow.add("Monika");
        lista_pracownikow.add("Monika");
        lista_pracownikow.add("Monika");

        List lista_produktow = new ArrayList();
        lista_produktow.add("produkt A");
        lista_produktow.add("produkt B");
        lista_produktow.add("produkt C");
        lista_produktow.add("produkt D");

        for(String imie1: lista_pracownikow){
            System.out.println("Nowa nazwa produktu: " + imie1 + " " + lista_produktow.get(losuj.nextInt(lista_produktow.size())));
        }
        System.out.println("\n");

        //CZESC TRZECIA ZADANIA (iii) (MAP)
        List<String> lista_pracownikow2 = new ArrayList();
        lista_pracownikow2.add("Kamila");
        lista_pracownikow2.add("Anna");
        lista_pracownikow2.add("Andrzej");
        lista_pracownikow2.add("Andrzej");
        lista_pracownikow2.add("Marek");
        lista_pracownikow2.add("Adam");
        lista_pracownikow2.add("Jarek");
        lista_pracownikow2.add("Stanisław");
        lista_pracownikow2.add("Monika");
        lista_pracownikow2.add("Monika");
        lista_pracownikow2.add("Adam");
        lista_pracownikow2.add("Monika");

        Map<String,Integer> lista_pracownikow_count = new HashMap<String, Integer>();

        for(String imie: lista_pracownikow2){
            Integer i = lista_pracownikow_count.get(imie);
            lista_pracownikow_count.put(imie, (i == null) ? 1 : i + 1);
        }

        for (Map.Entry<String, Integer> dane: lista_pracownikow_count.entrySet()){
            System.out.println("Pracownik o imieniu " + dane.getKey() + " wystepuje: " + dane.getValue() + " razy");
        }
        System.out.println("\n");

        //CZESC CZWARTA ZADANIA (iv) (QUEUE)
        ArrayDeque<String> lista_oczekujacych = new ArrayDeque<String>();
        lista_oczekujacych.add("Kamila");
        lista_oczekujacych.add("Anna");
        lista_oczekujacych.add("Andrzej");
        lista_oczekujacych.add("Marek");
        lista_oczekujacych.add("Andrzej");
        lista_oczekujacych.add("Adam");
        lista_oczekujacych.add("Jarek");;


        for(int i = 0; i < lista_oczekujacych.size(); i++){//realizacja
            System.out.println("Obecna kolejka: " + lista_oczekujacych);
            System.out.println("Sprzedano bilet klientowi: " + lista_oczekujacych.peek() + "\n");
            lista_oczekujacych.removeFirst();
        }
    }
}