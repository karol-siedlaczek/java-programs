/*	Karol Siedlaczek I8X1N1 2019
	Zaimplementuj klasę DoTrzechRazySztuka, która wczyta z konsoli liczbę float 
	i wypisuje ją w postaci np. „x = 1.2” (zobacz slajdy z pierwszego wykładu). 
	Metoda ta powinna dopuszczać maksymalnie dwa błędy w typie danych, np. jeśli podczas pierwszej próby 
	wpisany będzie string „abc”, to jest to błąd i metoda powinna zażądać innej danej i tak maksymalnie dwa razy. 
	Metoda ma kończyć swoje wykonanie po pierwszym wprowadzeniu float lub po trzech nieudanych próbach.
*/
public class Main {
    public static void main(String args[]){
        DoTrzechRazySztuka main = new DoTrzechRazySztuka();
        main.wczytaj();
    }
}
