/*	Karol Siedlaczek I8X1N1
	Zaimplementuj listy jednokierunkowe  zawierające liczby całkowite (typ int) bez użycia kolekcji. 
	Lista ma się składać z kotwicy, tj. obiektu klasy Anchor, oraz elementów, tj. obiektów klasy Element. Obiekty klasy Element mają posiadać atrybut val typu int 
	oraz opcjonalnie wskaźnik na następny element listy, dokładniej obiekt klasy Element. Klasa Anchor ma posiadać atrybut first typu Element wskazujący na pierwszy element listy oraz metody: 
		insertAtTheFront(int x) – wstawiającą liczbę x na początek listy 
		insertAtTheEnd(int x) – wstawiającą liczbę x na koniec listy
		removeFirst() – usuwającą pierwszy element listy
		removeLast() – usuwającą ostatni element listy
		toString() – zwracająca string reprezentujący daną listę
		equals(Object o) – sprawdzającą, czy dwie listy zawierają dokładnie te same liczby w tym samym porządku; jeśli tak, ma ona zwracać true, w przeciwnym wypadku false
*/
public class Main {
    public static void main (String[] args){
        Anchor lista_jednokierunkowa1 = new Anchor();
        Anchor lista_jednokierunkowa2 = new Anchor();
        boolean is_equal;
        boolean is_cycle;
        Element element1 = null;
        Element element2 = null;

        for (int i = 1; i < 16; i++)
            element1 = lista_jednokierunkowa1.InsertAtTheEnd(i, element1);
        for (int i = 1; i < 15; i++)
            element2 = lista_jednokierunkowa2.InsertAtTheEnd(i, element2);

        System.out.println(lista_jednokierunkowa1.toString());

        is_equal = lista_jednokierunkowa1.equals(lista_jednokierunkowa2);
        System.out.println("Czy listy sa takie same: " + is_equal);

        //lista_jednokierunkowa1.removeFirst();
        //lista_jednokierunkowa1.removeLast();
        //lista_jednokierunkowa1.InsertAtTheFront(20);
        //lista_jednokierunkowa1.InsertAtTheFront(30);

        System.out.println(lista_jednokierunkowa1.toString());

        is_cycle = lista_jednokierunkowa1.isLoop2();
        System.out.println("Czy lista jest cykliczna: " + is_cycle);
    }
}
