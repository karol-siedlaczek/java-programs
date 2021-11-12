import java.util.ArrayList;
import java.util.List;

public class PrzejsciePriorytetowe {
    private boolean przejscie_normalne;
    private boolean przejscie_priorytetowe;

    public PrzejsciePriorytetowe(){
        this.przejscie_normalne=false;
        this.przejscie_priorytetowe=false;

    }

    public synchronized void przechodzenie(boolean czy_priorytetowe){
        try{
            if(czy_priorytetowe){
                przejscie_priorytetowe=true;
                while (przejscie_normalne)wait();
            }else{
                while (przejscie_priorytetowe)wait();
                przejscie_normalne=true;
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void zwolnieniePrzejscia(boolean czy_priorytetowe){
        if(czy_priorytetowe)
            przejscie_priorytetowe=false;
        else
            przejscie_normalne=false;
        notifyAll();
    }
}
