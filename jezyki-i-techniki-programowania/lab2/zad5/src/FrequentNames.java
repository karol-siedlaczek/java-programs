/*	Karol Siedlaczek I8X1N1 2019
	Napisz program, który będzie wybierał najczęściej występujące imiona klientów z listy (zobacz punkt (iii) zadania nr 3), a następnie je usuwał. 
	Dokładniej, zaimplementuj klasę FrequentNames z obiektowym atrybutem frequentNames i z obiektową metodą choose(), która zwraca najczęściej występujące 
	imię z listy frequentNames usuwając je jednocześnie, oraz metodę insert(String name) wstawiającą imię do danej listy.
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class FrequentNames {
    List<String> lista_pracownikow = new ArrayList();
    Map<String,Integer> frequentNames = new HashMap<String, Integer>();
    Random losuj = new Random();

    public FrequentNames(){
        lista_pracownikow.add("Kamila");
        lista_pracownikow.add("Anna");
        lista_pracownikow.add("Andrzej");
        lista_pracownikow.add("Andrzej");
        lista_pracownikow.add("Andrzej");
        lista_pracownikow.add("Marek");
        lista_pracownikow.add("Adam");
        lista_pracownikow.add("Jarek");
        lista_pracownikow.add("Stanisław");
        lista_pracownikow.add("Monika");
        lista_pracownikow.add("Monika");
        lista_pracownikow.add("Monika");
        lista_pracownikow.add("Monika");
        lista_pracownikow.add("Adam");
        lista_pracownikow.add("Adam");
        lista_pracownikow.add("Monika");
        for(String imie: lista_pracownikow){//dodaje imiona i inty do mapy wzgledem czestotliwosci wystepowania w liscie
            Integer frequency = frequentNames.get(imie);
            frequentNames.put(imie, (frequency == null) ? 1 : frequency + 1);
        }
    }

    public void choose(){
        int do_usuniecia = 0;//zmienna wskazująca najczesciej wystepujące nazwisko

        for (Map.Entry<String, Integer> dane: frequentNames.entrySet()){//znajduje wartosc integera nazwiska ktore wystepuje najczesciej
            if (do_usuniecia < dane.getValue())
                do_usuniecia = dane.getValue();
        }

        for (Map.Entry<String, Integer> dane: frequentNames.entrySet()){//informuje ktory to pracownik
            if(dane.getValue() == do_usuniecia)
                System.out.println("Pracownik/cy o imieniu " + dane.getKey() + " zostal usuniety, poniewaz wystepuje " + dane.getValue() + " razy, czyli najwiecej z calej listy");
        }

        int new_do_usuniecia = do_usuniecia;
        frequentNames.values().removeIf(value -> value.equals(new_do_usuniecia));//usuwa pracownika o podanej wartosci
    }

    void insert(String name){
        lista_pracownikow.add(name);

    }

    public void get_size_map(){
        System.out.println("Obecna wielkosc: " + frequentNames.size());
    }

    public void wyswietl(){
        System.out.print("Obecna lista: ");
        for(String imie: lista_pracownikow){
            System.out.print(imie + ", ");
        }
    }

    public static void main (String[] args) {
        FrequentNames frequentNames = new FrequentNames();
        frequentNames.get_size_map();
        frequentNames.choose();
        frequentNames.get_size_map();
        frequentNames.insert("Dominika");
        frequentNames.wyswietl();
    }
}
