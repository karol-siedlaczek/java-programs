import java.util.ArrayList;
import java.util.List;

public class Przejscie {
    private List<Integer>kolejna_przychodzacych;

    public Przejscie(){
        kolejna_przychodzacych=new ArrayList<>();

    }
    public synchronized void dodanieDoKolejki(int id_kl){
        kolejna_przychodzacych.add(id_kl);
        przechodzenie(id_kl);

    }

    public synchronized void przechodzenie(int id_kl){
        try{
            while ( !kolejna_przychodzacych.isEmpty() && kolejna_przychodzacych.get(0)!=id_kl) wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void zwolnieniePrzejscia(int id_kl){
        if(!kolejna_przychodzacych.isEmpty() && kolejna_przychodzacych.get(0)==id_kl){
            kolejna_przychodzacych.remove(0);
        }
        notifyAll();
    }
}
