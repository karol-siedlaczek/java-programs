import java.util.InputMismatchException;
import java.util.Scanner;

public class DoTrzechRazySztuka{
    int max_szans = 2;

    public DoTrzechRazySztuka(){};

    void wczytaj() throws InterruptedException{
        for(int i = max_szans; i >= 0; i--){
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.print("Podaj float: ");
                float x = scanner.nextFloat();
                System.out.printf("x = %.1f", x);
                break;
            } catch (InputMismatchException e){
                if(i == max_szans)
                    System.out.println("Niepoprawne wejście, mozna sie pomylic jeszcze jeden raz");
                else if(i == max_szans - 1)
                    System.out.println("Znowu niepoprawne wejście, nie mozna sie juz pomylic");
                else{
                    System.out.println("To byla ostatnia próba. Koniec programu");
                    throw new InterruptedException();
                }
            }
        }
    }
}
