/*	Karol Siedlaczek I8X1N1 2019
	Zaimplementuj klasę Factorial (silnia) z metodą factorial(int x)  liczącą silnię x. 
		a) Zachowując tę sygnaturę, zmodyfikuj tę implementację tak, aby dla x < 0 metoda nie zwracała wartości    
		b) Zaimplementuj metodę factorial1, która dla liczb ujemnych będzie rzucać wyjątek NegativeValueException. 
	NegativeValueExceptionma bezpośrednio rozszerzać Exception.
		c) Napisz jaka jest różnica pomiędzy wyjątkomi sprawdzanymi a niesprawdzanymi
		d) Przetestuj obie metody implementując metodę main tak, żeby w niej metody były sprawdzane dla ciągu argumentów typu: -3, -1, 0, 1, 2, 4, 5.
		e) Użyj metody printStackTrace do pokazania zawartości stosu wywołań w momencie rzucania wyjątku. 
*/
public class Factorial {
    int silnia;

    void factorial(int x){
        silnia = 1;
        if(x < 0){
            System.out.println("Brak silni, podana liczba mniejsza niz zero");
        }
        else{
            for(int i = x; i > 0; i--)
                silnia = silnia * i;
            System.out.println(silnia);
        }
    }

    void factorial1(int x){
        try{
            if(x < 0)
                throw new IllegalArgumentException("NegativeValueExpection");
            silnia = 1;
            for(int i = x; i > 0; i--)
                silnia = silnia * i;
            System.out.println(silnia);
        }catch(IllegalArgumentException e){
            e.printStackTrace();
            System.out.println();
        }
    }

    public static void main(String[] args){
        int tab[] = {-3, -1, 0, 1, 2, 4, 5};
        Factorial silnia = new Factorial();

        //metoda factorial
        for (int i = 0; i < tab.length; i++){
            System.out.print("Silnia dla tab[" + i + "]: ");
            silnia.factorial(tab[i]);
        }
        System.out.println();
        //metoda factorial1
        for (int i = 0; i < tab.length; i++){
            System.out.print("Silnia dla tab[" + i + "]: ");
            silnia.factorial1(tab[i]);
        }
    }
}
