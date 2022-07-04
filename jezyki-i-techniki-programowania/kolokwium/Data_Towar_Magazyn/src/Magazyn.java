import java.util.ArrayList;

public class Magazyn {
    ArrayList<Towar> towary = new ArrayList<>();

    void add(Towar towar) {
        towary.add(towar);
    }

    ArrayList<Towar> przeterminowane (Data d) {
        ArrayList<Towar> przeterminowaneLista = new ArrayList<>();
        for (Towar towar : this.towary) {
            if (towar.wazny(d) < 0)
                przeterminowaneLista.add(towar);
        }
        return przeterminowaneLista;
    }
}
